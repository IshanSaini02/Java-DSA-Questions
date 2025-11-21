package ConditionalsAndLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReversedigitsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        int reverseDigit = 0;
        while (digit != 0){
            reverseDigit = reverseDigit * 10 + digit%10;
            digit/=10;
        }
        System.out.println(reverseDigit);
    }
}
