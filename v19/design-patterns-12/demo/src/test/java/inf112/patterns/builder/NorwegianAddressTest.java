package inf112.patterns.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NorwegianAddressTest {

    @Test
    public void canCreateValidAddress() {
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
        new NorwegianAddress.Builder().zipCode(null).build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldHaveZipArea() {
        new NorwegianAddress.Builder().zipArea(null).build();
    }
}
