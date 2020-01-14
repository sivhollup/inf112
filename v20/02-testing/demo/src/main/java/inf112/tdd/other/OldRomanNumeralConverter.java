package inf112.tdd.other;

import org.codehaus.plexus.util.StringUtils;

public class RomanNumeralConverter {
    public String convert(int numberToConvert) {
        final String allOnes = StringUtils.repeat("I", numberToConvert);

        final String result = String.join("", allOnes)
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX");

        return result;
    }
}
