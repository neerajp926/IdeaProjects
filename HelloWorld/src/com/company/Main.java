package com.company;
import java.util.Scanner;
public class Main {

    public static String decimalToBin(int decimal){
        int decimalNum = decimal;
        String binary_num = Integer.toBinaryString(decimalNum);
        binary_num = binary_num.replace("0b", "");
        System.out.println("Decimal to Binary no is: "+ binary_num);
        return binary_num;
    }
    public static String binToDec(int binary){
        int binaryNum = binary;
        String dec_num = Integer.toBinaryString(binaryNum);
        dec_num = dec_num.replace("0b", "");
        System.out.println("Binary to Decimal no is: "+ dec_num);
        return dec_num;
    }
    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        boolean dividendNegative = dividend < 0;
        boolean divisorNegative = divisor < 0;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int n = 32;
        int P = 0;
        int A = dividend;
        int B = divisor;
        for (int i = 0; i < n; i++) {
            P = P << 1;
            P = P | (A & (1 << 31)) >>> 31;
            A = A << 1;
            P = P - B;
            if (P < 0) {
                A = A & ~(1);
                P = P + B;
            } else
                A = A | 1;
        }

        int result = A;
        if (dividendNegative != divisorNegative) {
            result = result - result - result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter dividend");
        Scanner input1 = new Scanner(System.in);
        String dividend = input1.nextLine();
        int b = Integer.parseInt(dividend);
        decimalToBin(b);
        System.out.println("Enter divisor");
        Scanner input2 = new Scanner(System.in);
        String divisor = input2.nextLine();
        int bc = Integer.parseInt(divisor);
        decimalToBin(bc);

        int result = divide(b, bc);
        System.out.println(result);
        git clone git@github.com:mongodb-university/atlas_starter_java.git
    }
}