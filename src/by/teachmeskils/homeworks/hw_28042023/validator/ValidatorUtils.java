package by.teachmeskils.homeworks.hw_28042023.validator;

import by.teachmeskils.homeworks.hw_28042023.exception.ValidationException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidatorUtils {
   
    public static void validateFullName (String fullName) throws ValidationException {
        Pattern patternFullName = Pattern.compile("([А-Я][а-я]+\\s){2}[А-Я][а-я]+");
        Matcher matcherFullName = patternFullName.matcher(fullName);
        if (!matcherFullName.matches()) {
            throw new ValidationException("Проверка ФИО не пройдена");
        }
    }
    public static void validateJobTitle (String jobTitle ) throws ValidationException {
        Pattern patternJobTitle = Pattern.compile("[А-Я][а-я]+[\\s-]?[а-я]+");
        Matcher matcherJobTitle = patternJobTitle.matcher(jobTitle);
        if (!matcherJobTitle.matches()) {
            throw new ValidationException("Проверка должности не пройдена");
        }
    }
    public static void validateDepartment (String department ) throws ValidationException {
        Pattern patternDepartment = Pattern.compile("[А-Яа-я\\s\\d-]+");
        Matcher matcherDepartment = patternDepartment.matcher(department);
        if (!matcherDepartment.matches()) {
            throw new ValidationException("Проверка отделения не пройдена");
        }
    }
    public static void validateWorkExperience (String workExperience) throws ValidationException {
        Pattern patternWorkExperience = Pattern.compile("[0-9]+\\s(лет)?(год)?(года)?");
        Matcher matcherWorkExperience = patternWorkExperience.matcher(workExperience);
        if (!matcherWorkExperience.matches()) {
            throw new ValidationException("Проверка стажа работы не пройдена");
        }
    }
}
