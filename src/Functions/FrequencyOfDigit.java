package Functions;

import java.util.Scanner;

public class FrequencyOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int find = sc.nextInt();
        System.out.println(frequencyofDigit(num, find));

    }
    static int frequencyofDigit(long n, int m){
        int count = 0;
        while(n > 0){
            long digit = n%10;
            if(digit == m){
                count++;
            }
            n/=10;
        }
        return count;
    }
}
