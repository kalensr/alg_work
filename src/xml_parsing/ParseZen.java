package xml_parsing;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
/*

import javax.*;
import javax.xml.stream.*;
import javax.xml.stream.events.*;


import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;


import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
*/
public class ParseZen {
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLEventReader eventReader = 
				factory.createXMLEventReader(
						new FileReader("ticket.xml"));
		
		while (eventReader.hasNext()){
			XMLEvent event = eventReader.nextEvent();
			switch(event.getEventType()){
			case XMLStreamConstants.START_ELEMENT:
				StartElement startElement = event.asStartElement();
				String qName = startElement.getName().getLocalPart();
				if(qName.equalsIgnoreCase("ticket")){
					System.out.print(Start Element : ticket);
					Iterator<Attribute> attributes = startElement.getAttributes();
					String attrib = attributes.next().getValue();
				}
			}
			
		}

	}
	*/

}
