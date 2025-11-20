package ConditionalsAndLoops;

import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();

        String n = Integer.toString(digit);

        for (int i = 0; i< n.length(); i++){
            System.out.println(n.charAt(i));
        }
    }
}
