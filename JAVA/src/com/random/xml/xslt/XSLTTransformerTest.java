package nonweb.xml.xslt;

import java.io.File;
import java.io.StringWriter;
import java.net.URISyntaxException;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XSLTTransformerTest {
	public static void main(String[] args) throws TransformerException, URISyntaxException {

		File xmlFile = new File(XSLTTransformerTest.class.getResource("/staticData/xmlSource.xml").toURI());
		File xsltFile = new File(XSLTTransformerTest.class.getResource("/staticData/xsltSource.xsl").toURI());
		Source xmlSource = new StreamSource(xmlFile);
		Source xsltSource = new StreamSource(xsltFile);
		StringWriter writer = new StringWriter();
		Result result = new StreamResult(writer);
		Transformer transformer = TransformerFactory.newInstance()
				.newTransformer(xsltSource);
		transformer.setParameter("clientType", "preminet");
		transformer.setParameter("operator", "Finland: TeliaSonera");
		
		//transformer.setParameter("expirationDelta", "10080");
		
				transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty(
				"{http://xml.apache.org/xslt}indent-amount", "1");
		transformer.transform(xmlSource, result);
		System.out.println(writer.toString());
	}
}
