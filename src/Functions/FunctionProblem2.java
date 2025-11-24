package Functions;

import java.util.Scanner;

public class FunctionProblem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        fun(n,m);

    }
    public static void fun(int n, int m){
        System.out.println(n + m);
    }
}
