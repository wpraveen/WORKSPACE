package nonweb.xml.parser.stax;

import java.io.*;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import javax.xml.stream.*;
import javax.xml.stream.events.*;
import java.util.Date;
import javax.xml.namespace.QName;

/**
 * MyStreamFilter sample is used to demonstrates the use of STAX stream filter
 * api's. This filter accepts only StartElement and EndElement events and
 * filters out rest of the events.
 */
public class MyStreamFilter implements javax.xml.stream.StreamFilter
{
    private static String filename = null;
    
    public static void main(String[] args) throws Exception
    {
        String filename = "./files/NewFile.xml";
        XMLInputFactory xmlif = null;
        try
        {
            xmlif = XMLInputFactory.newInstance();
            xmlif.setProperty(XMLInputFactory.IS_REPLACING_ENTITY_REFERENCES,
                Boolean.TRUE);
            xmlif.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES,
                Boolean.FALSE);
            //xmlif.setProperty(XMLInputFactory.IS_NAMESPACE_AWARE, Boolean.TRUE);
            xmlif.setProperty(XMLInputFactory.IS_COALESCING, Boolean.FALSE);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        try
        {
            FileInputStream fis = new FileInputStream(filename);
            XMLStreamReader xmlr =
                xmlif.createFilteredReader(xmlif.createXMLStreamReader(fis),
                    new MyStreamFilter());
            int eventType = xmlr.getEventType();
            printEventType(eventType);
            while (xmlr.hasNext())
            {
                eventType = xmlr.next();
                System.out.println("ET : " + eventType);
                printEventType(eventType);
               /* printName(xmlr, eventType);
                printText(xmlr);
                if (xmlr.isStartElement())
                {
                    printAttributes(xmlr);
                }
                printPIData(xmlr);*/
                System.out.println("-----------------------------");
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    /**
     * @param eventType
     * @return
     */
    public static final String getEventTypeString(int eventType)
    {
        switch (eventType)
        {
            case XMLEvent.START_ELEMENT:
                return "START_ELEMENT";
            case XMLEvent.END_ELEMENT:
                return "END_ELEMENT";
            case XMLEvent.PROCESSING_INSTRUCTION:
                return "PROCESSING_INSTRUCTION";
            case XMLEvent.CHARACTERS:
                return "CHARACTERS";
            case XMLEvent.COMMENT:
                return "COMMENT";
            case XMLEvent.START_DOCUMENT:
                return "START_DOCUMENT";
            case XMLEvent.END_DOCUMENT:
                return "END_DOCUMENT";
            case XMLEvent.ENTITY_REFERENCE:
                return "ENTITY_REFERENCE";
            case XMLEvent.ATTRIBUTE:
                return "ATTRIBUTE";
            case XMLEvent.DTD:
                return "DTD";
            case XMLEvent.CDATA:
                return "CDATA";
        }
        return "UNKNOWN_EVENT_TYPE";
    }
    
    private static void printEventType(int eventType)
    {
        System.out.print("EVENT TYPE(" + eventType + "):");
        System.out.println(getEventTypeString(eventType));
    }
    
    private static void printName(XMLStreamReader xmlr, int eventType)
    {
        if (xmlr.hasName())
        {
            System.out.println("HAS NAME: " + xmlr.getLocalName());
        }
        else
        {
            System.out.println("HAS NO NAME");
        }
    }
    
    private static void printText(XMLStreamReader xmlr)
    {
System.out.println("printText");
        if (xmlr.hasText())
        {
            System.out.println("HAS TEXT: " + xmlr.getText());
        }
        else
        {
            System.out.println("HAS NO TEXT");
        }
    }
    
    private static void printPIData(XMLStreamReader xmlr)
    {
        if (xmlr.getEventType() == XMLEvent.PROCESSING_INSTRUCTION)
        {
            System.out.println(" PI target = " + xmlr.getPITarget());
            System.out.println(" PI Data = " + xmlr.getPIData());
        }
    }
    
    private static void printAttributes(XMLStreamReader xmlr)
    {
        if (xmlr.getAttributeCount() > 0)
        {
            System.out.println("\nHAS ATTRIBUTES: ");
            int count = xmlr.getAttributeCount();
            for (int i = 0; i < count; i++)
            {
                QName name = xmlr.getAttributeName(i);
                String namespace = xmlr.getAttributeNamespace(i);
                String type = xmlr.getAttributeType(i);
                String prefix = xmlr.getAttributePrefix(i);
                String value = xmlr.getAttributeValue(i);
                System.out.println("ATTRIBUTE-PREFIX: " + prefix);
                System.out.println("ATTRIBUTE-NAMESP: " + namespace);
                System.out.println("ATTRIBUTE-NAME:   " + name.toString());
                System.out.println("ATTRIBUTE-VALUE:  " + value);
                System.out.println("ATTRIBUTE-TYPE:  " + type);
                System.out.println();
            }
        }
        else
        {
            System.out.println("HAS NO ATTRIBUTES");
        }
    }
    
    /**
     * Accept only StartElement and EndElement events,Filters out rest of the
     * events.
     * 
     * @param reader
     * @return
     */
    public boolean accept(XMLStreamReader reader)
    {
        if (!reader.isStartElement() && !reader.isEndElement())
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
