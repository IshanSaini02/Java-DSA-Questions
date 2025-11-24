package NestedLoops;

import java.util.Scanner;

public class PrintFibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0, b =1;
        int nextWord = 0;

        for(int i = 1; i <= num; i++){
            System.out.println(a + nextWord);
            nextWord += a;
            a = b;
            b = nextWord;
        }
    }
}
