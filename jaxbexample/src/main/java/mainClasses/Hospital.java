package mainClasses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement (name = "hospital")
//@XmlType (propOrder = {"doctor", "nurse"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Hospital {
    @XmlElement (name = "doctor")
    private List<Doctor> doctors = new ArrayList<>();
    @XmlElement (name = "nurse")
    private List<Nurse> nurses = new ArrayList<>();

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }
}
