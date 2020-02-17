package inf112.patterns.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NorwegianAddressTest {

    @Test
    public void canCreateValidAddress() {
        /**
         * Opprettelsen av default-objekt tar veldig lite plass og skaper ikke støy for testen.
         */
        NorwegianAddress.Builder builder = new NorwegianAddress.Builder();
        NorwegianAddress address = builder.build();

        assertEquals(address.getStreetName(), builder.getStreetName());
        assertEquals(address.getHouseNumber(), builder.getHouseNumber());
        assertEquals(address.getZipCode(), builder.getZipCode());
        assertEquals(address.getZipArea(), builder.getZipArea());
        assertEquals(address.getCountry(), builder.getCountry());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldHaveZipCode() {
        /**
         * Kompakt kode som er lett å lese. Kan kun ta med det viktige i testen, heller enn å gjemme det vekk i alle
         * detaljer som også må til for å opprette en ellers gyldig adresse
         */
        new NorwegianAddress.Builder().zipCode(null).build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldHaveZipArea() {
        new NorwegianAddress.Builder().zipArea(null).build();
    }
}
