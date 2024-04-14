
package lt.viko.eif.asinkevic.xsdtest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "valstybinisNumeris",
    "spalva",
    "vietuSkaicius"
})
@XmlRootElement(name = "autobusas")
public class Autobusas {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(name = "valstybinisNumeris", required = true)
    protected String valstybinisNumeris;
    @XmlElement(name = "spalva", required = true)
    protected String spalva;
    @XmlElement(name = "vietuSkaicius", required = true)
    protected String vietuSkaicius;
    @Override
    public String toString() {
        return String.format("\t\tAutobusas: \n" +
                        "\t\t\tID:           %s \n" +
                        "\t\t\tvalstybinis numeris:   %s \n" +
                        "\t\t\tspalva:    %s \n" +
                        "\t\t\tvietu skaicius: %s \n",
                this.id,this.valstybinisNumeris, this.spalva, this.vietuSkaicius);
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
     * Gets the value of the valstybinisNumeris property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValstybinisNumeris() {
        return valstybinisNumeris;
    }
    /**
     * Sets the value of the valstybinisNumeris property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setvalstybinisNumeris(String value) {
        this.valstybinisNumeris = value;
    }
    /**
     * Gets the value of the spalva property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpalva() {
        return spalva;
    }
    /**
     * Sets the value of the spalva property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpalva(String value) {
        this.spalva = value;
    }
    /**
     * Gets the value of the vietuSkaicius property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVietuSkaicius() {
        return vietuSkaicius;
    }
    /**
     * Sets the value of the vietuSkaicius property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVietuSkaicius(String value) {
        this.vietuSkaicius = value;
    }
}
