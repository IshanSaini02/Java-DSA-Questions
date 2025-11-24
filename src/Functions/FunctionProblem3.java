package Functions;

import java.util.Scanner;

public class FunctionProblem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fun(n));

    }
    static int fun(int n){
        for (int i = 1; i <= 5; i++){
            n++;
        }
        return n;
    }
}
