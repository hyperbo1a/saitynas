package lt.viko.eif.asinkevic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReisasTest {
    Reisas reisas = new Reisas();

    Uzsakovas uzsakovas = new Uzsakovas("Tadas", "T", "123");
    Vairuotojas vairuotojas = new Vairuotojas("Tadas", "T", "123");
    Autobusas autobusas = new Autobusas("Baltas", "TMV:098", 23);

    @Test
    void getUzsakovas() {
        reisas.setUzsakovas(uzsakovas);
        Uzsakovas test = reisas.getUzsakovas();
        Uzsakovas uzsakovasTest = new Uzsakovas("Tadas", "T", "123");
        assertEquals(uzsakovasTest.toString().trim(), test.toString().trim());
    }

    @Test
    void setUzsakovas() {
        reisas.setUzsakovas(uzsakovas);
        Uzsakovas test = reisas.getUzsakovas();
        Uzsakovas uzsakovasTest = new Uzsakovas("Tadas", "T", "123");
        assertEquals(uzsakovasTest.toString().trim(), test.toString().trim());
    }

    @Test
    void getVairuotojas() {
        reisas.setVairuotojas(vairuotojas);
        Vairuotojas test = reisas.getVairuotojas();
        Vairuotojas vairuotojasTest = new Vairuotojas("Tadas", "T", "123");
        assertEquals(vairuotojasTest.toString().trim(), test.toString().trim());
    }

    @Test
    void setVairuotojas() {
        reisas.setVairuotojas(vairuotojas);
        Vairuotojas test = reisas.getVairuotojas();
        Vairuotojas vairuotojasTest = new Vairuotojas("Tadas", "T", "123");
        assertEquals(vairuotojasTest.toString().trim(), test.toString().trim());
    }

    @Test
    void getAutobusas() {
        reisas.setAutobusas(autobusas);
        Autobusas test = reisas.getAutobusas();
        Autobusas autobusasTest = new Autobusas("Baltas", "TMV:098", 23);
        assertEquals(autobusasTest.toString().trim(), test.toString().trim());


    }

    @Test
    void setAutobusas() {
        reisas.setAutobusas(autobusas);
        Autobusas test = reisas.getAutobusas();
        Autobusas autobusasTest = new Autobusas("Baltas", "TMV:098", 23);
        assertEquals(autobusasTest.toString().trim(), test.toString().trim());
    }

    @Test
    void getAdresas() {
        reisas.setAdresas("adresas");
        String test = reisas.getAdresas();
        assertEquals("adresas", test);
    }

    @Test
    void setAdresas() {
        reisas.setAdresas("adresas");
        String test = reisas.getAdresas();
        assertEquals("adresas", test);
    }
}