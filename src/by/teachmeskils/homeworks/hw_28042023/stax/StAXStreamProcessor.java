package by.teachmeskils.homeworks.hw_28042023.stax;

import by.teachmeskils.homeworks.hw_28042023.Employee;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class StAXStreamProcessor {

    public static List<Employee> stAXProcessor() {
        List<Employee> employees = new ArrayList<>();
        Employee employee = null;
        XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
        try {
            XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream("hospital.xml"));
            while (reader.hasNext()) {
                XMLEvent xmlEvent = reader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    switch (startElement.getName().getLocalPart()) {
                        case "doctor", "nurse" -> employee = new Employee();
                        case "fullName" -> {
                            xmlEvent = reader.nextEvent();
                            employee.setFullName(xmlEvent.asCharacters().getData());
                        }
                        case "jobTitle" -> {
                            xmlEvent = reader.nextEvent();
                            employee.setJobTitle(xmlEvent.asCharacters().getData());
                        }
                        case "department" -> {
                            xmlEvent = reader.nextEvent();
                            employee.setDepartment(xmlEvent.asCharacters().getData());
                        }
                        case "workExperience" -> {
                            xmlEvent = reader.nextEvent();
                            employee.setWorkExperience(xmlEvent.asCharacters().getData());
                        }
                    }
                }
                if (xmlEvent.isEndElement()) {
                    EndElement endElement = xmlEvent.asEndElement();
                    if (endElement.getName().getLocalPart().equals("doctor") ||
                            endElement.getName().getLocalPart().equals("nurse")) {
                        employees.add(employee);
                    }
                }
            }
        } catch (XMLStreamException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return employees;
    }
}
