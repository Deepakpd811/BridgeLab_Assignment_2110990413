// 2. Add Two Numbers
// Write a program that takes two numbers as input from the user and prints
// their sum.

import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int add = n+m;
        System.out.println(add);
    }
}
