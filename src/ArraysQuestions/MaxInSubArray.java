package ArraysQuestions;

import java.util.Scanner;

public class MaxInSubArray {
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
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum += arr[j];
                if(sum > ans) ans = sum;
            }
        }
        System.out.println(ans);
    }
}
