package ConditionalsAndLoops;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        int countDigit = 1;

        while (digit%2 == 0){
            digit = sc.nextInt();
            countDigit++;
        }
        System.out.println(countDigit);
    }
}
