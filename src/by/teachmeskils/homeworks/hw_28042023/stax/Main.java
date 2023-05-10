package by.teachmeskils.homeworks.hw_28042023.stax;

import by.teachmeskils.homeworks.hw_28042023.Employee;
import by.teachmeskils.homeworks.hw_28042023.exception.ValidationException;
import by.teachmeskils.homeworks.hw_28042023.validator.ValidatorEmployee;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = StAXStreamProcessor.stAXProcessor();
        employees.forEach(s ->
                System.out.printf("ФИО сотрудника: %s; Должность: %s; Отделение %s; Стаж работы: %s\n",
                        s.getFullName(), s.getJobTitle(), s.getDepartment(), s.getDepartment()));

        System.out.print("\nВведите ФИО сотрудника для поиска в базе: ");
        Scanner scanner = new Scanner(System.in);
        try {
            ValidatorEmployee.certainEmployee(scanner.nextLine(), employees);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
