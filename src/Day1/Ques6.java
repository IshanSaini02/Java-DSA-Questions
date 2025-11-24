package Day1;

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int evenSum = 0;

        for (int i = 1; i <= num ; i++) {
            if(i%2 == 0){
                evenSum+=i;
            }
        }
        System.out.println(evenSum);
    }

}


// Sum of All Even Numbers up to N
// Input: 10
// Output: 30 (2+4+6+8+10)
// ✨ Combines loops + condition + accumulation.