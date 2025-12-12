package VariableDataType;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        System.out.println("a = " + numA + "," + "b = " + numB);

        numA = numA + numB;
        numB = numA - numB;
        numA = numA - numB;

        System.out.println("a = " + numA + "," + "b = " + numB);
    }


}
