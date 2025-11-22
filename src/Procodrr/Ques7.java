package Procodrr;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print(i*i + " ");
        }
    }
}

// Print Squares of Numbers from 1 to N
// Input: 5
// Output: 1 4 9 16 25
// ✨ Introduces arithmetic pattern generation.
