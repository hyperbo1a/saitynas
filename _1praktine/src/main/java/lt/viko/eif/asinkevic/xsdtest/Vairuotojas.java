
package lt.viko.eif.asinkevic.xsdtest;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "firstName",
    "lastname",
    "phoneNumber"
})
@XmlRootElement(name = "vairuotojas")
public class Vairuotojas {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "Lastname", required = true)
    protected String lastname;
    @XmlElement(name = "telefonoNumeris", required = true)
    protected String telefonoNumeris;

    @Override
    public String toString() {
        return String.format("\t\tVairuotojas: \n" +
                        "\t\t\tID:           %s \n" +
                        "\t\t\tVardas:   %s \n" +
                        "\t\t\tPavarde:    %s \n" +
                        "\t\t\tTelefono numeris: %s  \n",
                this.id,this.firstName, this.lastname, this.telefonoNumeris);
    }
    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }
    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }
    /**
     * Gets the value of the firstName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Sets the value of the firstName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }
    /**
     * Gets the value of the lastname property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLastname() {
        return lastname;
    }
    /**
     * Sets the value of the lastname property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLastname(String value) {
        this.lastname = value;
    }
    /**
     * Gets the value of the telefonoNumeris property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTelefonoNumeris() {
        return telefonoNumeris;
    }
    /**
     * Sets the value of the telefonoNumeris property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTelefonoNumeris(String value) {
        this.telefonoNumeris = value;
    }

}
