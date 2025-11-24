package Functions;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class PlaceValueChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = determineSecondLastDigit(num);
        if(ans){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
    static boolean determineSecondLastDigit(int n){
        int digit = (n/10)%10;
        return digit == 0;
    }
}
