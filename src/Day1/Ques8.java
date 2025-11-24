package Day1;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            if(i%3 == 0 && i%5 == 0){
                System.out.print(i + " ");
            }
        }
    }
}


// Print all numbers divisible by 3 and 5 up to N
// Input: 30
// Output: 15 30
// ✨ Reinforces conditional checks inside loops.
