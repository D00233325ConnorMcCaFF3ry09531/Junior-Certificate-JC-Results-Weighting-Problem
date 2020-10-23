package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Copy;

import javax.xml.transform.Result;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {


    //tests will the selected five grades be correct
    @Test
    void selectFiveGrades() {
        App Student = new App();

        int[] codes = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] mark = new int[]{60, 42, 43, 44, 35, 46, 77, 68};
        int[] result = Student.selectFiveGrades(codes, mark);
        int[] expResult = new int[]{60, 42, 43, 77, 68};

//Test that if cspe is the largest mark it will not add it to the five results method
        int[] codes1 = new int[]{1, 2, 3, 4, 5, 6,218, 8};
        int[] mark1 = new int[]{60, 42, 43, 44, 35, 46, 99, 68};
        int[] result1 = Student.selectFiveGrades(codes1, mark1);
        int[] expResult1 = new int[]{60, 42, 43,68, 46};

        //Test Math, Irish and English are accepted when they are the smallest values.

        int[] codes2 = new int[]{1, 2, 3, 4, 5, 6,218, 8};
        int[] mark2= new int[]{2, 1, 5,55, 35, 46, 99, 68};
        int[] result2 = Student.selectFiveGrades(codes2, mark2);
        int[] expResult2 = new int[]{2, 1, 5,68, 55};


        Assert.assertArrayEquals(expResult, result);


        Assert.assertArrayEquals(expResult1, result1);
        Assert.assertArrayEquals(expResult2, result2);

    }
    @Test
    private double calculateAverage(int[] fmarks) {
 fmarks = new int[]{2, 1, 5,68, 55};
Double Result = calculateAverage( fmarks);
Double ExpResult = 26.2;

Assert.assertEquals(Result,ExpResult);

return Result;
    }
}



