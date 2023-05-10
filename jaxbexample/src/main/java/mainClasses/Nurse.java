package mainClasses;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Nurse {
    @XmlElement(name = "fullName")
    private String fullName;
    @XmlElement(name = "jobTitle")
    private String jobTitle;
    @XmlElement(name = "department")
    private String department;
    @XmlElement(name = "workExperience")
    private String workExperience;

    public String getFullName() {
        return fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public String getWorkExperience() {
        return workExperience;
    }
}
