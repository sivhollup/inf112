package inf112.tdd.demo;

import org.codehaus.plexus.util.StringUtils;

import java.util.TreeMap;

public class RomanNumeralConverter {

    int[] values = new int[]{5, 4, 1};
    String[] numerals = new String[]{"V", "IV", "I"};
    TreeMap<Integer, String> numeralMap;

    public RomanNumeralConverter() {
        numeralMap = new TreeMap<>();
        numeralMap.put(1, "I");
        numeralMap.put(4, "IV");
        numeralMap.put(5, "V");
    }

    public String convert3(int numericValue) {
        return StringUtils.repeat("I", numericValue)
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                ;
    }

    public String convert2(int numericalValue) {
        StringBuilder result = new StringBuilder();
        while (numericalValue > 0) {
            for (int i = 0; i < values.length; i++) {
                if (numericalValue >= values[i]) {
                    result.append(numerals[i]);
                    numericalValue -= values[i];
                }
            }
        }
        return result.toString();
    }

    public String convert(int numericalValue) {
        StringBuilder result  = new StringBuilder();
        while(numericalValue > 0) {
            Integer key = numeralMap.floorKey(numericalValue);
            result.append(numeralMap.get(key));
            numericalValue -= key;
        }
        return result.toString();
    }

}
