package lt.viko.eif.asinkevic.model;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
/**
 * Abstract User Model class
 */
@XmlTransient
@XmlSeeAlso({Uzsakovas.class, Autobusas.class, Vairuotojas.class})
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Naudotojas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String firstName;
    private String lastName;



    public void setId(int id) {
        this.id = id;
    }
    @XmlElement(name = "FirstName")
    public void setFirstname(String firstname) {
        this.firstName = firstname;
    }
    @XmlElement(name = "Lastname")
    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public String getFirstname() {
        return firstName;
    }
    public String getLastname() {
        return lastName;
    }
    public int getId() {
        return id;
    }

}
