package Day1;

import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        for (int i = 1; i<= num; i++){
            System.out.print(i*i*i + " ");
        }
    }
}


// Print the cubes of numbers from 1 to N
// Input: 5
// Output: 1 8 27 64 125
// ✨ Extends arithmetic pattern logic beyond squares.
