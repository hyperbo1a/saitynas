package lt.viko.eif.asinkevic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UzsakovasTest {
    Uzsakovas uzsakovas = new Uzsakovas("Tadas", "T", "123");

    @Test
    void getPhonenumber() {
        String testPhone = uzsakovas.getTelefonoNumeris();
        assertEquals("123", testPhone);
    }

    @Test
    void setPhonenumber() {
        uzsakovas.setTelefonoNumeris("321");
        String testPhone = uzsakovas.getTelefonoNumeris();
        assertEquals("321", testPhone);
    }
}