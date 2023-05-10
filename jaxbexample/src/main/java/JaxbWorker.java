import by.teachmeskils.homeworks.hw_28042023.Employee;
import by.teachmeskils.homeworks.hw_28042023.exception.ValidationException;
import by.teachmeskils.homeworks.hw_28042023.validator.ValidatorEmployee;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import mainClasses.Hospital;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JaxbWorker {

    private static final List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("hospital.xml"));
            String str = br.lines().collect(Collectors.joining());
            StringReader reader = new StringReader(str);
            JAXBContext context = JAXBContext.newInstance(Hospital.class);
            Unmarshaller unMarshaller = context.createUnmarshaller();
            Hospital hospital = (Hospital) unMarshaller.unmarshal(reader);

            hospital.getDoctors().forEach(s ->
                    employees.add(new Employee(s.getFullName(), s.getJobTitle(), s.getDepartment(), s.getWorkExperience())));
            hospital.getNurses().forEach(s ->
                    employees.add(new Employee(s.getFullName(), s.getJobTitle(), s.getDepartment(), s.getWorkExperience())));
            employees.forEach(s ->
                    System.out.printf("ФИО сотрудника: %s; Должность: %s; Отделение %s; Стаж работы: %s\n",
                            s.getFullName(), s.getJobTitle(), s.getDepartment(), s.getDepartment()));
            System.out.print("\nВведите ФИО сотрудника для поиска в базе: ");
            Scanner scanner = new Scanner(System.in);
            ValidatorEmployee.certainEmployee(scanner.nextLine(), employees);

        } catch (JAXBException | FileNotFoundException | ValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
