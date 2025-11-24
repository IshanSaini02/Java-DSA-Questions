package Day2;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(checkPNZ(a));
    }
    static String checkPNZ(int a){
        if(a >=1){
            return "Positive";
        } else if (a<0) {
            return "Negative";
        }else {
            return "Zero";
        }
    }
}


// Check if a Number is Positive, Negative, or Zero
// Input: -9
// Output: Negative
// ✨ Practices multi-branch conditions and comparison operators.
