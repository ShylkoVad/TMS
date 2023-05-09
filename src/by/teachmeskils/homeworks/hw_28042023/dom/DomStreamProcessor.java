package by.teachmeskils.homeworks.hw_28042023.dom;

import by.teachmeskils.homeworks.hw_28042023.Employee;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.List;

public class DomStreamProcessor {
    public static void elements (Document document, String name, List<Employee> employees) {
        NodeList employeesDocument = document.getDocumentElement().getElementsByTagName(name);
        for (int i = 0; i < employeesDocument.getLength(); i++) {
            Node employee = employeesDocument.item(i);
            Employee temp = new Employee();
            if (employee.getNodeType() == Node.ELEMENT_NODE) {
                Element e = (Element) employee;
                temp.setFullName(e.getElementsByTagName("fullName").item(0).getTextContent());
                temp.setJobTitle(e.getElementsByTagName("jobTitle").item(0).getTextContent());
                temp.setDepartment(e.getElementsByTagName("department").item(0).getTextContent());
                temp.setWorkExperience(e.getElementsByTagName("workExperience").item(0).getTextContent());
                employees.add(temp);
            }
        }
    }
}
