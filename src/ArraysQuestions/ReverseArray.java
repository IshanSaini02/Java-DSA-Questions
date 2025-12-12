package ArraysQuestions;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        ReverseArray(arr);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
    static void ReverseArray(int arr[]){
        int i = 0, j = arr.length - 1;
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
}
