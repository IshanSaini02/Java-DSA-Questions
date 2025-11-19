package VariableDataType;

import java.util.Scanner;

public class CelsiusToFahrenheit2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float myFloat = sc.nextFloat();
        float ans = ( myFloat * 9/5) + 32;
        System.out.printf("%.6f", ans);
    }
}
