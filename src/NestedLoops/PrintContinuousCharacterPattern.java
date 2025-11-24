package NestedLoops;

import java.util.Scanner;

public class PrintContinuousCharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        char ch = 'A';
//        for(int i = 1; i <= num; i++){
//            for(int j = 0; j < i; j++) {
//                System.out.print((char) (ch + j));
//            }
//            System.out.println();
//            ch++;
//        }

        for(int i = 1; i <= num; i++){
            char ch = (char)('A' + (i - 1));
            for (int j = 1; j <= i; j++){
                System.out.print(ch);
                ch++;
                if(ch > 'Z'){
                    ch = 'A';
                }
            }
            System.out.println();
        }
    }
}


// A
// BC
// CDE
// DEFG
// EFGHI