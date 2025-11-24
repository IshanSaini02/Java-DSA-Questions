package Functions;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(binaryToDecimal(num));

    }
    static long binaryToDecimal(long binaryNum){
        long decimal = 0;
        int base = 1;
        while (binaryNum > 0){
            long lastDigit = binaryNum%10;
            decimal +=  (lastDigit * base);
            base *= 2;
            binaryNum/=10;
        }
        return decimal;
    }
}
