package NestedLoops;

import java.util.Scanner;

public class PrintContinuousCharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char ch = 'A';
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++) {
                System.out.print((char) (ch + j));
            }
            System.out.println();
            ch++;
        }
    }
}


// A
// BC
// CDE
// DEFG
// EFGHI