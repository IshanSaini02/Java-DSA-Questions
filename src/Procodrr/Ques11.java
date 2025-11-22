package Procodrr;

import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i*i <= num; i++) {
            int square = i*i;

            if(square%2 ==0){
                System.out.print(square + " ");
            }
        }
    }
}

// Print only the numbers that are both even and perfect squares
// Input: 1 to 20
// Output: 4 16
// ✨ Encourages combining two conditions within one loop.
