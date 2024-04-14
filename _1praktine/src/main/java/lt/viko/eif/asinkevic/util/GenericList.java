package lt.viko.eif.asinkevic.util;

import lt.viko.eif.asinkevic.model.Autobusas;
import lt.viko.eif.asinkevic.model.Reisas;
import lt.viko.eif.asinkevic.model.Vairuotojas;
import lt.viko.eif.asinkevic.model.Uzsakovas;


import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.List;

/**
 * Generic model class wrapper for marshalling
 */
@XmlRootElement(name = "ReisasList")
@XmlSeeAlso({Reisas.class, Vairuotojas.class, Uzsakovas.class, Autobusas.class})
public class GenericList<T> {
    private List<T> Data;

    public GenericList() {
    }

    @XmlAnyElement(lax = true)
    public List<T> getData() {
        return Data;
    }

    public void setData(List<T> Data) {
        this.Data = Data;
    }
}
