package NestedLoops;
import java.util.Scanner;

public class PrintCharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
         char ch = 'A';

        for (int i = 1; i <= num; i++){
            for(int j = 0; j < i; j++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
}

// A
// BB
// CCC
// DDDD