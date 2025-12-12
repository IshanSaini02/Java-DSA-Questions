package NestedLoops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int temp = N;
        int countDigit = (int) Math.log10(N) + 1;

        int sum = 0;
        while (temp > 0){
            int digit = temp%10;
            sum+= (int)Math.pow(digit, countDigit);
            temp/=10;
        }
        if(N == sum) System.out.println(N + " is a Armstrong Number.");
        else System.out.println(N + " is a Armstrong Number.");






//        for (int num = 1; num <= N; num++) {
//            int sum = 0;
//            int temp = num;
//
//            while (temp > 0) {
//                int digit = temp % 10;
//                sum += digit * digit * digit;
//                temp /= 10;
//            }
//
//            if (sum == num) {
//                System.out.println(num);
//            }
//        }
    }
}



//  https://www.geeksforgeeks.org/dsa/logic-building-problems/

//   https://www.geeksforgeeks.org/jobs?tab_type=featured