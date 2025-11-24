package Functions;

import java.util.Scanner;

public class CountFrequencyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int digit = sc.nextInt();
        System.out.println(countFreqDigit(num, digit));
    }
    static int countFreqDigit(long num, int digitFind){
        int count = 0;
        while (num > 0){
            long dig = num%10;
            if(dig == digitFind){
                count++;
            }
            num/=10;
        }
        return count;
    }

}
