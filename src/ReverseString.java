package src;

import java.util.Scanner;

public class ReverseString {

    public static String reverseString(String s) {
        String rs = new String();
        for (int i=s.length()-1;i>=0;i--) {
            rs = rs+s.charAt(i);
        }
        return rs;
    }
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        System.out.println("Enter Input String:" );
        String os = ms.nextLine();
        System.out.println("Entered String: "+os);
        System.out.println("Reversed String: "+reverseString(os));
        ms.close();
    }
}
