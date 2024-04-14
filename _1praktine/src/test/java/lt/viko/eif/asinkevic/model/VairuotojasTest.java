package lt.viko.eif.asinkevic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VairuotojasTest {
    Vairuotojas vairuotojas = new Vairuotojas("Tadas", "T", "123");

    @Test
    void getTelefonoNumeris() {
        String testPhone = vairuotojas.getTelefononumeris();
        assertEquals("123", testPhone);
    }

    @Test
    void setTelefonoNumeris() {
        vairuotojas.setTelefononumeris("321");
        String testPhone = vairuotojas.getTelefononumeris();
        assertEquals("321", testPhone);
    }

}