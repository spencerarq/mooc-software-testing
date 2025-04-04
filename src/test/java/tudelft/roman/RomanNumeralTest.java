package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {


    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XLVI");
        Assertions.assertEquals(46, result);
    }
    @Test
    public void numberWithThreeDigits () {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("DLII");
        Assertions.assertEquals(552,result);
    }

    @Test
    public void numberWithFourDigits () {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("MDLIV");
        Assertions.assertEquals(1554,result);
    }
}
