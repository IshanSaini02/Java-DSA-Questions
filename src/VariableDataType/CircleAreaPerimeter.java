package VariableDataType;

import java.util.Scanner;

public class CircleAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int pi = 3;
        int area = pi * r * r;
        int perimeter = 2 * pi * r;
        System.out.println(area);
        System.out.println(perimeter);
    }
}
