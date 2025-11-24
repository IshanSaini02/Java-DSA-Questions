package Day1;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}

// Sum of First N Natural Numbers
// Input: 5
// Output: 15
// ✨ Encourages cumulative addition and variable usage.
