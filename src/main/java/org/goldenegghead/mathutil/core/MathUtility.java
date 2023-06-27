/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.goldenegghead.mathutil.core;

/**
 *
 * @author Tin
 */
//class này clone giống class java.util.Math
// contain functions static Math.sqrt() Math.sin() Math.random()
public class MathUtility {

    public static final double PI = 3.1415;

    //calculate n! = 1, 2, 3...n
    //0! = 1! = 1
    //do not have factorial of negative number -> exception
    //factorial boost too fast, can not calculate 21! (long have 18 number)
    //20! is maximum
    //21! 22! 23! 20! -> exception
//    public static long getFactorial(int n) {
//        
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. n must be between 0...20, please");
//        
//        if((n == 0 || n ==1)) 
//            return 1;
//        
//        long product = 1;
//        for (int i = 2; i <= n; i++) 
//            product *= i;
//        
//        return product;
//    }
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0...20, please");
        }

        if ((n == 0 || n == 1)) {
            return 1;
        }

        return n * getFactorial(n - 1);

    }

}
