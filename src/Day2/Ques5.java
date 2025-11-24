package Day2;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println(checkWhichTriangle(a, b, c));
    }
    static String checkWhichTriangle(int sideA, int sideB, int sideC){
        if(sideA*sideA + sideB*sideB == sideC*sideC || sideB*sideB + sideC*sideC == sideA*sideA || sideC*sideC + sideA*sideA == sideB*sideB){
            return "Right-Angled";
        }else if(sideA == sideB && sideA == sideC){
            return "Equilateral";
        } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
            return "Isosceles";
        }else {
            return "Scalene";
        }
    }
}

// Check Triangle Type Using Sides and Angles
// Input: Sides = 3, 4, 5
// Output: Right-Angled Triangle
// ✨ Combines geometric reasoning + Pythagoras theorem check.

// Example Logic:

// If a² + b² = c² → Right-angled
// Else if all sides equal → Equilateral
// Else if any two equal → Isosceles
// Else → Scalene