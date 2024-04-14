package lt.viko.eif.asinkevic.util;

import lt.viko.eif.asinkevic.model.Autobusas;
import lt.viko.eif.asinkevic.model.Uzsakovas;
import lt.viko.eif.asinkevic.model.Reisas;
import lt.viko.eif.asinkevic.model.Vairuotojas;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenericListTest {

    static Reisas reisas = new Reisas();

    static Uzsakovas uzsakovas = new Uzsakovas("Tadas", "T", "123");
    static Vairuotojas vairuotojas = new Vairuotojas("Tadas", "T", "123");
    static Autobusas autobusas = new Autobusas("Baltas", "TMV:098", 23);
    static String adresas = "adresas";
    GenericList<Reisas> myGenericlist = new GenericList<Reisas>();

    @BeforeAll
    public static void init() {
        reisas.setAdresas(adresas);
        reisas.setAutobusas(autobusas);
        reisas.setUzsakovas(uzsakovas);
        reisas.setVairuotojas(vairuotojas);
    }

    @Test
    void getData() {

        Reisas reisasTest = reisas;
        List<Reisas> reisasList = new ArrayList<>();
        reisasList.add(reisasTest);
        myGenericlist.setData(reisasList);
        GenericList<Reisas> genericListTest = new GenericList<Reisas>();
        List<Reisas> reisasListTest = new ArrayList<>();
        reisasListTest.add(reisasTest);
        genericListTest.setData(reisasListTest);
        assertEquals(myGenericlist.getData(), genericListTest.getData());

    }

    @Test
    void setData() {

        Reisas reisasTest = reisas;
        List<Reisas> reisasList = new ArrayList<>();
        reisasList.add(reisasTest);
        myGenericlist.setData(reisasList);
        GenericList<Reisas> genericListTest = new GenericList<Reisas>();
        List<Reisas> reisasListTest = new ArrayList<>();
        reisasListTest.add(reisasTest);
        genericListTest.setData(reisasListTest);
        assertEquals(myGenericlist.getData(), genericListTest.getData());
    }
}