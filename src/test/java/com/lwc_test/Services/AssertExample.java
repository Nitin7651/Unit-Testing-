package com.lwc_test.Services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AssertExample {

    //Assertion - validating actual result with expected result
//Assertions class



    @Test
    public void test1() {

        System.out.println("Testing some assertion methods");

//        float actual = 12;
//
//        Float expected = 12.0f;
//
//        //Overloaded
//
//        Assertions.assertEquals(expected, actual);

        int []actualIntArray={1,2,3,4,5};

        int []expectedIntArray={1,2,3,4,5};

        Assertions.assertArrayEquals(expectedIntArray,actualIntArray);



//        Assertions.assertNull();
//        Assertions.assertNotNull();
//        boolean value=false;
//        Assertions.assertTrue(value);

        List<Integer> list1= Arrays.asList(1,2,3,4,5);
        List<Integer> list2= Arrays.asList(1,2,3,4,5);

        Assertions.assertIterableEquals(list2, list1);


        Assertions.assertThrows(RuntimeException.class, () -> {
    //        System.out.println("this is testing executable");
            throw new RuntimeException("This is testing exception");
        });

    }
}
