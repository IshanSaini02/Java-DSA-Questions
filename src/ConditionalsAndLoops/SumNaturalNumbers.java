package ConditionalsAndLoops;

import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        long sumNaturalNum = (long) num * (num + 1)/2;
        System.out.println(sumNaturalNum);
    }
}
