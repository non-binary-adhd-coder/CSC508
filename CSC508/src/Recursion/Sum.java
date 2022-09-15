/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author hidayah
 */
import java.util.*;

public class Sum {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n;
        System.out.println("Enter value n :");
        n = scan.nextInt();
        System.out.println("Sum(" + n + ") = " + sum(n));

    }

    //Recursive method for finding factorial of a number
    public static int sum(int num) {
        if (num == 1) // base case
        {
            return num * num;
        } else {
            return num = (num * num) + sum(num - 1);  // general case
        }
    }
}
