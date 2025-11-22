package Procodrr;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        for(int i = 1; i <= num; i++){
//            System.out.print(i);
//        }
        int i = num;
        while (i <= num){
            System.out.print(i + " ");
            if(i==1) break;
            i--;

        }
    }
}

// Print number from N to 1 without changing the loop condition of question 1.
// Input: 5
// thinking creatively and manipulating logic within the loop.
