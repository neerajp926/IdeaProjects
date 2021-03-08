package com.company;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
      Scanner scanner = new Scanner(System.in);
    while(true){

        System.out.println("Enter number(100-10000: ");
        int input_number = scanner.nextInt();
        if(input_number > 100 && input_number < 10_000)
            break;
        System.out.println("Enter a correct value");
    }

    }
}
