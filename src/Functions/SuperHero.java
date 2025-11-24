package Functions;

import java.util.Scanner;

public class SuperHero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(ModifyName(name));

    }
    static String ModifyName(String name){
        return name + " is a Super Hero";
    }
}
