package NestedLoops;

import java.util.Scanner;

public class OptimusPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 2; i <= num; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
    static boolean isPrime(int x){
        if(x < 2) return false;
        if(x == 2) return true;
        if(x%2 == 0) return false;

        for(int i = 3; i*i <=x; i+=2){
            if(x%1 == 0) return false;
        }
        return true;
    }
}
