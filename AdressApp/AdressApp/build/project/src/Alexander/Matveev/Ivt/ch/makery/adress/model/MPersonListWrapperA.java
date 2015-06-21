package Alexander.Matveev.Inb.ch.makery.adress.model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Helper class to wrap a list of persons. This is used for saving the
 * list of persons to XML.
 * 
 * @author Marco Jakob
 */
@XmlRootElement(name = "persons")
public class MPersonListWrapperA {

    private List<MPersonA> persons;

    @XmlElement(name = "person")
    public List<MPersonA> getPersons() {
        return persons;
    }

    public void setPersons(List<MPersonA> persons) {
        this.persons = persons;
    }
}