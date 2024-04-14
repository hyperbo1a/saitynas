package lt.viko.eif.asinkevic.util;

import lt.viko.eif.asinkevic.model.Autobusas;
import lt.viko.eif.asinkevic.model.Uzsakovas;
import lt.viko.eif.asinkevic.model.Reisas;
import lt.viko.eif.asinkevic.model.Vairuotojas;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JaxbUtilTest {

    Reisas reisas = new Reisas();

    Uzsakovas uzsakovas = new Uzsakovas("Tadas", "T", "123");
    Vairuotojas vairuotojas = new Vairuotojas("Tadas", "T", "123");
    Autobusas autobusas = new Autobusas("Baltas", "TMV:098", 23);
    String adresas = "adresas";
    GenericList<Reisas> myGenericlist = new GenericList<Reisas>();

    @Test
    void transformToXML() {
        reisas.setAdresas(adresas);
        reisas.setAutobusas(autobusas);
        reisas.setUzsakovas(uzsakovas);
        reisas.setVairuotojas(vairuotojas);
        List<Reisas> reisai = new ArrayList<>();
        reisai.add(reisas);
        JaxbUtil.transformToXML(reisai, new File("JAXBJUnitTest.xml"), new File("JAXBObject.xsd"));
        GenericList<Reisas> reisasGenericList = JaxbUtil.transformToPOJO(Reisas.class, new File("JAXBJUnitTest.xml"), new File("JAXBObject.xsd"));
        JaxbUtil.transformToXML(reisai, new File("JAXBJUnitTest.xml"), new File("JAXBObject.xsd"));
        GenericList<Reisas> reisasGenericListTest = JaxbUtil.transformToPOJO(Reisas.class, new File("JAXBJUnitTest.xml"), new File("JAXBObject.xsd"));
        assertEquals(reisasGenericList.getData().toString().trim(), reisasGenericListTest.getData().toString().trim());
    }

    @Test
    void transformToPOJO() {
        reisas.setAdresas(adresas);
        reisas.setAutobusas(autobusas);
        reisas.setUzsakovas(uzsakovas);
        reisas.setVairuotojas(vairuotojas);
        List<Reisas> reisai = new ArrayList<>();
        reisai.add(reisas);
        JaxbUtil.transformToXML(reisai, new File("JAXBJUnitTest.xml"), new File("JAXBObject.xsd"));
        GenericList<Reisas> reisasGenericList = JaxbUtil.transformToPOJO(Reisas.class, new File("JAXBJUnitTest.xml"), new File("JAXBObject.xsd"));
        JaxbUtil.transformToXML(reisai, new File("JAXBJUnitTest.xml"), new File("JAXBObject.xsd"));
        GenericList<Reisas> reisasGenericListTest = JaxbUtil.transformToPOJO(Reisas.class, new File("JAXBJUnitTest.xml"), new File("JAXBObject.xsd"));
        assertEquals(reisasGenericList.getData().toString().trim(), reisasGenericListTest.getData().toString().trim());

    }
}