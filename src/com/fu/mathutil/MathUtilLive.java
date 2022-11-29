/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author acer
 */
public class MathUtilLive {

    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println("expected 5! = 120; actual: " + result);
//        // throw new IllegalArgumentException
//        long result2 = MathUtil.getFactorial(-5);
        System.out.println("expected 6! = 720; actual: " + MathUtil.getFactorial(6));
        System.out.println("expected 0! = 1; actual: " + MathUtil.getFactorial(0));
        // Adding more codes, and uploading to the server
        // 12:10PM 29/11/2022
        System.out.println("expected 1! = 1; actual: " + MathUtil.getFactorial(0));
        System.out.println("expected 3! = 6; actual: " + MathUtil.getFactorial(3));

        // software testing: ước lượng xem giá trị trả về của hàm gì là gì
        // expected value: 120, if expected = actual -> good program
    }

}
