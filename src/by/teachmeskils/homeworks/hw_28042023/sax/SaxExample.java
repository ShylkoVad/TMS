package by.teachmeskils.homeworks.hw_28042023.sax;

import by.teachmeskils.homeworks.hw_28042023.Employee;
import by.teachmeskils.homeworks.hw_28042023.exception.ValidationException;
import by.teachmeskils.homeworks.hw_28042023.validator.ValidatorEmployee;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaxExample {
    private static List<Employee> employees = new ArrayList<>();
    private static String lastElementName;

    public static void main(String[] args) {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser;
        try {
            XMLHandler handler = new XMLHandler();
            parser = factory.newSAXParser();
            parser.parse(new File("hospital.xml"), handler);
            employees.forEach(s ->
                    System.out.printf("ФИО сотрудника: %s; Должность: %s; Отделение %s; Стаж работы: %s\n",
                            s.getFullName(), s.getJobTitle(), s.getDepartment(), s.getDepartment()));
            System.out.print("\nВведите ФИО сотрудника для поиска в базе: ");
            Scanner scanner = new Scanner(System.in);
            ValidatorEmployee.certainEmployee(scanner.nextLine(), employees);
        } catch (ParserConfigurationException | SAXException | IOException | ValidationException e) {
            throw new RuntimeException(e);
        }
    }

    private static class XMLHandler extends DefaultHandler {
        private String fullName;
        private String jobTitle;
        private String department;
        private String workExperience;

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            lastElementName = qName;
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            String information = new String(ch, start, length);
            information = information.replace("\n", "").trim();

            if (!information.isEmpty()) {
                if (lastElementName.equals("fullName"))
                    fullName = information;
                if (lastElementName.equals("jobTitle"))
                    jobTitle = information;
                if (lastElementName.equals("department"))
                    department = information;
                if (lastElementName.equals("workExperience"))
                    workExperience = information;
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if ((fullName != null && !fullName.isEmpty()) && (jobTitle != null && !jobTitle.isEmpty())
                    && (department != null && !department.isEmpty()) && (workExperience != null && !workExperience.isEmpty())) {
                employees.add(new Employee(fullName, jobTitle, department, workExperience));
                fullName = null;
                jobTitle = null;
                department = null;
                workExperience = null;
            }
        }
    }
}
