package ArraysQuestions;

import java.util.Scanner;

public class SubArrayPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        SubArray(arr);
    }
    static void SubArray(int arr[]){
        // [ 3, 1, 2, 4 ] example array
        for(int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }
}
