package VariableDataType;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempInCelsius = sc.nextInt();
        int ans = (tempInCelsius * 9/5) + 32;
        System.out.println(ans);
    }
}
