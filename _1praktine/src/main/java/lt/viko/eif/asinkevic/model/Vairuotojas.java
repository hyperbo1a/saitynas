package lt.viko.eif.asinkevic.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.xml.bind.annotation.*;

/**
 * Public Vairuotojas Model class
 */
@XmlRootElement(name="Vairuotojas")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder={"id","firstname","lastname","telefononumeris"})
@Entity
@DiscriminatorColumn(name = "vairuotojas")
public class Vairuotojas extends Naudotojas {

    private String telefonoNumeris;

    public Vairuotojas(String firstname, String lastname, String telefononumeris)
    {
        setFirstname(firstname);
        setLastname(lastname);
        this.telefonoNumeris = telefononumeris;
    }

    public Vairuotojas() {

    }
    @Override
    public String toString() {
        return String.format("\n" +
                        "\t\t\tVardas:   %s \n" +
                        "\t\t\tPavarde:    %s \n" +
                        "\t\t\tTelefono numeris: %s  \n",
                getFirstname(),getLastname(),this.telefonoNumeris);
    }
    @XmlElement(name="telefonoNumeris")
    public String getTelefononumeris() {
        return telefonoNumeris;
    }
    public void setTelefononumeris(String telefononumeris) {
        this.telefonoNumeris = telefononumeris;
    }
}
