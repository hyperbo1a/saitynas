package lt.viko.eif.asinkevic.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
/**
 * Public Autobusas Model class
 */
@XmlRootElement(name="Autobusas")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder={"spalva","valstybinisNumeris","vietuSkaicius"})
@Entity
@Table(name = "autobusas")
public class Autobusas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String valstybinisNumeris;
    private String spalva;
    private int vietuSkaicius;

    public Autobusas(String spalva, String valstybinisNumeris, int vietuSkaicius){
    setSpalva(spalva);
    setValstybinisNumeris(valstybinisNumeris);
    setVietuSkaicius(vietuSkaicius);
    }
    public Autobusas() {

    }

    @Override
    public String toString() {
        return String.format("\n" +
                        "\t\t\tSpalvas:               %s \n" +
                        "\t\t\tvalstybinis numeris: %s \n" +
                        "\t\t\tvietu skaicius:     %d",
                this.spalva, this.valstybinisNumeris, this.vietuSkaicius);
    }

    public int getId() {
        return id;
    }

    public String getValstybinisNumeris() {
        return valstybinisNumeris;
    }
    @XmlElement(name = "valstybinisNumeris")
    public void setValstybinisNumeris(String valstybinisNumeris) {
        this.valstybinisNumeris = valstybinisNumeris;
    }
    public String getSpalva() {
        return spalva;
    }
    @XmlElement(name = "spalva")
    public void setSpalva(String spalva) {
        this.spalva = spalva;
    }


    public int getVietuSkaicius() {
        return vietuSkaicius;
    }
    @XmlElement(name = "vietuSkaicius")
    public void setVietuSkaicius(int vietuSkaicius) {
        this.vietuSkaicius = vietuSkaicius;
    }
}
