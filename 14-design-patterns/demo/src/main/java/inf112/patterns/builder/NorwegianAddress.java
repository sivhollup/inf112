package inf112.patterns.builder;

public class NorwegianAddress {
    private String streetName;
    private String houseNumber;
    private String zipCode;
    private final String zipArea;
    private final String country;

    /**
     * Privat konstruktør slik at alle som ønsker å opprette en instans må bruke builder-klassen.
     * Trenger kun full konstruktør med alle parametre, builder tar seg av alle optional-varianter og ulike
     * sammensetninger av parametre
     *
     * @param streetName
     * @param houseNumber
     * @param zipCode
     * @param zipArea
     * @param country
     */
    private NorwegianAddress(String streetName, String houseNumber, String zipCode, String zipArea, String country) {

        validate(streetName, houseNumber, zipCode, zipArea, country);
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.zipArea = zipArea;
        this.country = country;
    }

    private void validate(String streetName, String houseNumber, String zipCode, String zipArea, String country) {
        shouldBePresent(zipCode, "zipCode");
        shouldBePresent(zipArea, "zipArea");
    }

    private void shouldBePresent(String inputField, String fieldName) {
        if (inputField == null) {
            throw new IllegalArgumentException("Field " + fieldName + " is required");
        }
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

    /**
     * Builderklasse som bygger riktig adresse-objekt
     */
    public static class Builder {

        /**
         * Setter standardverdier, særlig nyttig i testsammenheng
         */
        private String streetName = "Standardgaten";
        private String houseNumber = "1";
        private String zipCode = "1234";
        private String zipArea = "Bergen";
        private String country = "Norge";

        public Builder() {
        }

        /**
         * Endrer gatenavn i builderen til streetName
         *
         * @param streetName
         * @return builder-objektet slik at det kan bygges videre på eller kalle build()-metoden
         */
        public Builder streetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder houseNumber(String number) {
            this.houseNumber = number;
            return this;
        }

        public Builder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder zipArea(String zipArea) {
            this.zipArea = zipArea;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * Bygger objektet vi egentlig er på jakt etter med alle oppgitte parametre. Kaller den private konstruktøren
         * i adresse-klassen
         *
         * @return en instans av NorwegianAddress
         */
        public NorwegianAddress build() {
            return new NorwegianAddress(streetName, houseNumber, zipCode, zipArea, country);
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
}
