package edu.by.ishangulyev;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class StringUtilsTest {
    @Test
    public void isPositiveNumber(){
        String notNumber = "asd32";
        String number = "31";
        String negativeNumber = "-5";
        String zero = "0";

        Assertions.assertTrue(StringUtils.isPositiveNumber(number));
        Assertions.assertFalse(StringUtils.isPositiveNumber(notNumber));
        Assertions.assertFalse(StringUtils.isPositiveNumber(negativeNumber));
        Assertions.assertFalse(StringUtils.isPositiveNumber(zero));
    }
}
