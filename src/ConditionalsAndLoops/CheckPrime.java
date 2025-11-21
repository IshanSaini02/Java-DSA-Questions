package ConditionalsAndLoops;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();

        for(int i = 2; i <= digit-1; i++){
            if(digit%2 == 1){
                System.out.println(digit + " is a prime number");
                break;
            }else {
                System.out.println(digit + " is not a prime number");
                break;
            }
        }
    }
}
