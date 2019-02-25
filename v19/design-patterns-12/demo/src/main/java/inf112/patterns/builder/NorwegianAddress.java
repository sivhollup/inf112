package inf112.patterns.builder;

public class NorwegianAddress {
    private String streetName;
    private String houseNumber;
    private String zipCode;
    private final String zipArea;
    private final String country;

    public NorwegianAddress(String streetName, String houseNumber, String zipCode, String zipArea, String country) {

        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.zipArea = zipArea;
        this.country = country;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getZipArea() {
        return zipArea;
    }

    public String getCountry() {
        return country;
    }
}
