package Procodrr;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = 1;

        for(int i = 1; i <= num; i++){
            factorial*=i;
        }
        System.out.println(factorial);
    }
}

// Product (Factorial) of N
// Input: 5
// Output: 120
// ✨ Reinforces loop control with multiplication logic.
