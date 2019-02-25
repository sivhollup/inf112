package inf112.patterns.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NorwegianAddressTest {

    @Test
    public void canCreateValidAddress() {
        NorwegianAddress address = new NorwegianAddress("Leilighetsveien", "17b", "3456", "Suburbia", "Norge");

        assertEquals("Leilighetsveien", address.getStreetName());
        assertEquals("17b", address.getHouseNumber());
        assertEquals("3456", address.getZipCode());
        assertEquals("Suburbia", address.getZipArea());
        assertEquals("Norge", address.getCountry());
    }

    @Test
    public void shouldHaveFourDigitsInZipCode() {

    }
}
