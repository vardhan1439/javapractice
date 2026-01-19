package src;

import java.util.Scanner;

public class SwapTwoStrings {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String:");
        String s1 = sc.nextLine();
        System.out.println("Enter Second String:");
        String s2 = sc.nextLine();
        String cs=s1+s2;
        s2=cs.substring(0, s1.length());
        s1=cs.substring(s2.length());
        System.out.println("First String is in s2: "+s2);
        System.out.println("Second String is in s1: "+s1);
        sc.close();
    }
}
