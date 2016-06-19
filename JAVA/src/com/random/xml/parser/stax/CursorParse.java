package nonweb.xml.parser.stax;

import java.io.FileInputStream;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;

public class CursorParse
{
    public static void main(String[] args) throws Exception
    {
        String filename = "./files/NewFile.xml";
        XMLInputFactory xmlif = null;
        xmlif = XMLInputFactory.newInstance();
        xmlif.setProperty(XMLInputFactory.IS_REPLACING_ENTITY_REFERENCES,
            Boolean.TRUE);
        xmlif.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES,
            Boolean.FALSE);
        xmlif.setProperty(XMLInputFactory.IS_COALESCING, Boolean.FALSE);
        try
        {
            XMLStreamReader xmlr =
                xmlif.createXMLStreamReader(filename, new FileInputStream(
                    filename));
            int eventType = xmlr.getEventType();
            printStartDocument(xmlr);
            printElements(xmlr);
        }
        catch (XMLStreamException ex)
        {
            System.out.println(ex.getMessage());
            if (ex.getNestedException() != null)
            {
                ex.getNestedException().printStackTrace();
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public static final void printElements(XMLStreamReader xmlr)
    {
        try
        {
            while (xmlr.hasNext())
            {
                switch (xmlr.next())
                {
                    case XMLEvent.START_ELEMENT:
                        printStartElement(xmlr);
                        break;
                    case XMLEvent.END_ELEMENT:
                        printEndElement(xmlr);
                        break;
                    case XMLEvent.PROCESSING_INSTRUCTION:
                        printPIData(xmlr);
                        break;
                    case XMLEvent.CHARACTERS:
                        break;
                    case XMLEvent.COMMENT:
                        printComment(xmlr);
                        break;
                    case XMLEvent.START_DOCUMENT:
                        break;
                    case XMLEvent.END_DOCUMENT:
                        break;
                    case XMLEvent.ENTITY_REFERENCE:
                        break;
                    case XMLEvent.ATTRIBUTE:
                        break;
                    case XMLEvent.DTD:
                        break;
                    case XMLEvent.CDATA:
                        break;
                    case XMLEvent.SPACE:
                           
                            
                }
                printText(xmlr);
                
            }
        }
        catch (XMLStreamException e)
        {
            System.err.println("My error : Xml is not proper");
            e.printStackTrace();
        }
    }
    
    private static void printStartDocument(XMLStreamReader xmlr)
    {
        System.out.println("<?xml version=\"" + xmlr.getVersion() + "\""
            + " encoding=\"" + xmlr.getCharacterEncodingScheme() + "\"" + "?>");
    }
    
    private static void printComment(XMLStreamReader xmlr)
    {
        System.out.println("Inside printComment");
        System.out.print("<!--" + xmlr.getText() + "-->");
    }
    
    private static void printText(XMLStreamReader xmlr)
    {
        if ( xmlr.hasText())
        {System.out.print(":**:");
            System.out.print(xmlr.getText());
        }
    }
    
    private static void printPIData(XMLStreamReader xmlr)
    {
       
            System.out.print("<?" + xmlr.getPITarget() + " " + xmlr.getPIData()
                + "?>");
    }
    
    private static void printStartElement(XMLStreamReader xmlr)
    {
            System.out.print("<" + xmlr.getName().getLocalPart());
            printAttributes(xmlr);
            System.out.print(">");
    }
    
    private static void printEndElement(XMLStreamReader xmlr)
    {       
            System.out.print("</" + xmlr.getName().getLocalPart() + ">");
        
    }
    
    private static void printAttributes(XMLStreamReader xmlr)
    {
        int count = xmlr.getAttributeCount();
        if (count > 0)
        {
            for (int i = 0; i < count; i++)
            {
                System.out.print(" ");
                System.out.print(xmlr.getAttributeName(i).toString());
                System.out.print("=");
                System.out.print("\"");
                System.out.print(xmlr.getAttributeValue(i));
                System.out.print("\"");
            }
        }
        /*
         * count = xmlr.getNamespaceCount(); if (count > 0) { for (int i = 0; i
         * < count; i++) { System.out.print(" "); System.out.print("xmlns"); if
         * (xmlr.getNamespacePrefix(i) != null) { System.out.print(":" +
         * xmlr.getNamespacePrefix(i)); } System.out.print("=");
         * System.out.print("\""); System.out.print(xmlr.getNamespaceURI(i));
         * System.out.print("\""); } }
         */
    }
}