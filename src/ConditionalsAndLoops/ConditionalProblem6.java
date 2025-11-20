package ConditionalsAndLoops;

import java.util.Scanner;

public class ConditionalProblem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if(a%2 == 1 && b%2 == 1){
            System.out.println("we are odd");
        }else {
            System.out.println("we are simple");
        }
    }
}
