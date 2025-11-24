package Day2;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().toLowerCase().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        }else {
            System.out.println("Consonant");
        }

    }
}


// Check if a Character is a Vowel or Consonant
// Input: e
// Output: Vowel
// ✨ Combines logical OR (||) operator and string comparisons.
