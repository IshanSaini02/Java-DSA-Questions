package Day1;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 2; i <= num; i++){
            if(i%2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}

// Print all even number from 1 to N.
// Input: 10
// Output: 2 4 6 8 10
// Introduces conditional checks inside loops.
