
package lt.viko.eif.asinkevic.xsdtest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reisas"
})
@XmlRootElement(name = "ReisasList")
public class ReisasList {

    @XmlElement(name = "Reisas")
    protected List<Reisas> reisas;


    public List<Reisas> getReisas() {
        if (reisas == null) {
            reisas = new ArrayList<Reisas>();
        }
        return this.reisas;
    }

}
