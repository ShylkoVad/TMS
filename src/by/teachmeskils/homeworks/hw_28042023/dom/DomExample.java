package by.teachmeskils.homeworks.hw_28042023.dom;

import by.teachmeskils.homeworks.hw_28042023.Employee;
import by.teachmeskils.homeworks.hw_28042023.exception.ValidationException;
import by.teachmeskils.homeworks.hw_28042023.validator.ValidatorEmployee;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DomExample {
    private static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder;
            Document document;
            builder = factory.newDocumentBuilder();
            document = builder.parse(new File("hospital.xml"));

            DomStreamProcessor.elements(document, "doctor", employees);
            DomStreamProcessor.elements(document, "nurse", employees);
            employees.forEach(s ->
                    System.out.printf("ФИО сотрудника: %s; Должность: %s; Отделение %s; Стаж работы: %s\n",
                            s.getFullName(), s.getJobTitle(), s.getDepartment(), s.getDepartment()));

            System.out.print("\nВведите ФИО сотрудника для поиска в базе: ");
            Scanner scanner = new Scanner(System.in);
            ValidatorEmployee.certainEmployee(scanner.nextLine(), employees);
        } catch (ParserConfigurationException | SAXException | IOException | ValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
