package lt.viko.eif.asinkevic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AutobusasTest {

    Autobusas autobusas = new Autobusas("Baltas", "TMV:098", 23);

    @Test
    void getSpalva() {
        String testPhone = autobusas.getSpalva();
        assertEquals("Baltas", testPhone);
    }

    @Test
    void setSpalva() {
        autobusas.setSpalva("Juodas");
        String testPhone = autobusas.getSpalva();
        assertEquals("Juodas", testPhone);
    }

    @Test
    void getValstybinisNumeris() {
        String testWorkphone = autobusas.getValstybinisNumeris();
        assertEquals("TMV:098", testWorkphone);
    }

    @Test
    void setValstybinisNumeris() {
        autobusas.setValstybinisNumeris("BNM:999");
        String testWorkphone = autobusas.getValstybinisNumeris();
        assertEquals("BNM:999", testWorkphone);
    }

    @Test
    void getVietuSkaicius() {
        int testPhone = autobusas.getVietuSkaicius();
        assertEquals(23, testPhone);
    }

    @Test
    void setVietuSkaicius() {
        autobusas.setVietuSkaicius(20);
        int testPhone = autobusas.getVietuSkaicius();
        assertEquals(20, testPhone);
    }

}