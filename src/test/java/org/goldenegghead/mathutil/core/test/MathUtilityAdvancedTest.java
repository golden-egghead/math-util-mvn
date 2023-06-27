/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.goldenegghead.mathutil.core.test;

import org.goldenegghead.mathutil.core.MathUtility;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author tin
 */
public class MathUtilityAdvancedTest {

    public static Object[][] initTestData() {
        Object testData[][] = {{0, 1},
                               {1, 1}, 
                               {2, 2}, 
                               {4, 24}, 
                               {6, 720}};
        
        return testData;
    }
   
    @ParameterizedTest
    @MethodSource(value = "initTestData")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    
}
