package nonweb.xml;

import java.io.StringWriter;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XMLTools {
	public static void main(String[] args) throws Exception {
		String xml = "<?xml version=\"1.0\"?>" + "<note>" + "<to>Tove</to>"
				+ "<from>Jani</from>" + "<heading>Reminder</heading>"
				+ "<body>Don't forget me this weekend!</body>" + "</note>";
		System.out.println("ORIGINAL xml");
		System.out.println(xml);
		System.out.println("FORMATTED XML");
		String formattedXml = XMLTools.formatXml(xml);
		System.out.println(formattedXml);
		System.out.println("UN_FORMATTED XML");
		String unFormattedXml = XMLTools.unFormatXml(formattedXml);
		System.out.println(unFormattedXml);
	}

	public static String formatXml(String xml) throws TransformerException {

		Source source = new StreamSource(new java.io.StringReader(xml));
		TransformerFactory tfactory = TransformerFactory.newInstance();
		Transformer serializer;
		serializer = tfactory.newTransformer();
		serializer.setOutputProperty(OutputKeys.INDENT, "yes");
		serializer.setOutputProperty(
				"{http://xml.apache.org/xslt}indent-amount", "2");
		StringWriter writer = new StringWriter();
		Result result = new StreamResult(writer);
		serializer.transform(source, result);
		String formattedString = writer.toString();
		return formattedString;
	}
	
	public static String unFormatXml(String xml) throws TransformerException {

		xml = xml.replaceAll(">\\s+<", "><");
		return xml;
	}

}
