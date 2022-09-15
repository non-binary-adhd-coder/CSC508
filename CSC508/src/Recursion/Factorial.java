/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.*;

/**
 *
 * @author hidayah
 */
public class Factorial {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // Factorial fact = new Factorial();

        String num;
        int n;
        System.out.println("Enter value n :");
        n = scan.nextInt();
        //System.out.println(n + "! = " + factorial(n));
        System.out.println(mystery(n));
    }

    //Recursive method for finding factorial of a number
    public static int factorial(int num) {
        if (num == 0) // base case
        {
            return 1;
        } else {
            return num = num * factorial(num - 1);  // general case
        }

    }

    /*public static int rFibNum(int a, int b, int n) {
        if (n == 1) {
            return a;
        } else if (n == 2) {
            return b;
        } else {
            return rFibNum(a, b, n - 1) + rFibNum(a, b, n - 2);
        }

    }
    Or */
    public static int fib(int n) {
        if (n == 1) // base case
        {
            return 0;
        } else if (n == 2) // base case
        {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2); // general case
        }
    }

    public void mystery(int n) {
        if ((n >= 0) && (n <= 10)) {
            if (n % 2 == 0) {
                mystery(n + 2);
            } else {
                mystery(n - 2);
            }
            System.out.print(n + " ");
        }
    }
}
