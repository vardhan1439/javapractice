package src;
//import java.util.ArrayList;

import java.util.Scanner;

public class Palindrome {

    public String reverse (String s) {
        String s1="";
        for (int i=s.length()-1;i>=0;i--) {
            s1 = s1+s.charAt(i);
        }
        return s1;
    }

    public boolean palindromecheck(String os) {

        String rs = reverse(os);
        if(os.equals(rs)){
            return true;
        }else{
            return false;
        }
    }

    public static void main (String[] args){

        Palindrome pd = new Palindrome();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input string: ");
        String os = sc.nextLine();
        sc.close();
        if(pd.palindromecheck(os)){
            System.out.println("Entered String "+os+" is a Palindrome!!!");
        }
        else{
                        System.out.println("Entered String "+os+" is not a Palindrome!!!");
        }
    }

}
