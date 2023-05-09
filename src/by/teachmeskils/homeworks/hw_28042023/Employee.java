package by.teachmeskils.homeworks.hw_28042023;

public class Employee {
    private String fullName;
    private String jobTitle;
    private String department;
    private String workExperience;

    public Employee(String fullName, String jobTitle, String department, String workExperience) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.department = department;
        this.workExperience = workExperience;
    }

    public Employee() {

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }
}
