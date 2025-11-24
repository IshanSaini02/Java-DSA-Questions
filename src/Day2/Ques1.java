package Day2;

public class Ques1 {
    public static void main(String[] args) {
        System.out.println(findMax(10, 20, 5));
    }
    static int findMax(int a, int b, int c){
        int max;
        if (a >= b && a >= c){
            max = a;
        } else if (b >= c) {
            max = b;
        }else {
            max = c;
        }
        return max;
    }
}


// Find the Maximum of Three Numbers
// Input: 10 20 5
// Output: 20
// ✨ Teaches nested or chained conditional logic and comparative reasoning.
