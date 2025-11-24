package Functions;

import java.util.Scanner;

public class CalculatenCr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), r = sc.nextInt();
        System.out.println(getValueInBase(n, r));
    }

    public static long getFactorialValue(int value){
        long base = 1;
        for (int i = 1; i <= value; i++){
            base*=i;
        }
        return base;
    }

    public static long getValueInBase(int n, int r){
        return getFactorialValue(n)/(getFactorialValue(r) * getFactorialValue(n-r));
    }
}
