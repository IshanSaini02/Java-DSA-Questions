package ConditionalsAndLoops;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if(marks > 90){
            System.out.println("Excellent");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("Good");
        }else if(marks > 70 && marks <= 80){
            System.out.println("Fair");
        }else if(marks > 60 && marks <= 70){
            System.out.println("Meets Expectations");
        }else if(marks <= 60){
            System.out.println("Below Expectations");
        }

//        switch (marks/10){
//            case 10:
//            case 9:
//                System.out.println("Excellent");
//                break;
//            case 8:
//                System.out.println("Good");
//                break;
//            case 7:
//                System.out.println("Fair");
//                break;
//            case 6:
//                System.out.println("Meets Expectations");
//                break;
//            default:
//                System.out.println("Below Expectations");
//                break;
//        }
    }
}
