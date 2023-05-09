package by.teachmeskils.homeworks.hw_28042023.validator;

import by.teachmeskils.homeworks.hw_28042023.Employee;
import by.teachmeskils.homeworks.hw_28042023.exception.ValidationException;

import java.util.List;

public class ValidatorEmployee {

    public static void certainEmployee(String fullName, List<Employee> employees) throws ValidationException {
        Employee tempEmployees = employees.stream().filter(s -> s.getFullName().equals(fullName)).findFirst().orElseThrow(() ->
                new ValidationException("Работника с ФИО " + fullName + " нет в базе"));
        try {
            ValidatorUtils.validateFullName(tempEmployees.getFullName());
            ValidatorUtils.validateJobTitle(tempEmployees.getJobTitle());
            ValidatorUtils.validateDepartment(tempEmployees.getDepartment());
            ValidatorUtils.validateWorkExperience(tempEmployees.getWorkExperience());
            String[] nameFullInfo = tempEmployees.getFullName().split(" ");
            System.out.println("\nИмя: " + nameFullInfo[1] + "\nФамилия: " + nameFullInfo[0] + "\nДолжность: " + tempEmployees.getJobTitle() +
                    "\nОтделение: " + tempEmployees.getDepartment() + "\nСтаж работы: " + tempEmployees.getWorkExperience());
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
