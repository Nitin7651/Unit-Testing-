package com.lwc_test;


import com.lwc_test.services.Calculater;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @org.junit.jupiter.api.Test
    public void addTwoNumbersTest() {

        int actualResult = Calculater.addTwoNumbers(12, 12);
        int expectedResult = 24;

        Assertions.assertEquals(expectedResult, actualResult,  "Test faild");
    }



}
