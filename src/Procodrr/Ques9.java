package Procodrr;

import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int oddSum = 0;
        for (int i = 1; i <= num; i +=2){
            oddSum+=i;
        }
        System.out.println(oddSum);




//        int lastOdd = (num % 2 == 0) ? num - 1 : num;
//        int count = (lastOdd + 1) / 2;
//        int sum = count * count;
//        System.out.println(sum);

    }
}

// Find the sum of all odd numbers up to N
// Input: 10
// Output: 25 (1 + 3 + 5 + 7 + 9)
// ✨ Combines looping with conditional accumulation.