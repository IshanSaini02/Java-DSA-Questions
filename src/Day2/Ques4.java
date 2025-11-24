package Day2;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Uppercase");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        }else if(ch >= '0' && ch <= '9'){
            System.out.println("Digit");
        }else {
            System.out.println("Special Character");
        }
    }
}


// Check if a Character is Uppercase, Lowercase, Digit, or Special Character
// Input: A
// Output: Uppercase Letter
// ✨ Teaches use of character code ranges (charCodeAt) and compound logical conditions.
// 🔍 Concepts: ASCII range checks, compound && and || operators.

