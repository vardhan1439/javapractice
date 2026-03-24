package src;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountDigits {

    public int CountDigitsInNumber(int n) {
        // Handle negative numbers by taking the absolute value
        n = Math.abs(n);
        
        // A Set only stores unique elements
        Set<Integer> uniqueDigits = new HashSet<>();

        // If the input is 0, the loop won't run, so we handle it or use a do-while
        if (n == 0) return 1;

        while (n > 0) {
            int digit = n % 10;     // Get the last digit
            uniqueDigits.add(digit); // Add to set (duplicates are ignored)
            n = n / 10;             // Remove the last digit
        }

        return uniqueDigits.size();
    }

    public static void main (String[] args) {

        CountDigits cd = new CountDigits();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Integer: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("the Unique number of digits in provided Integer "+num+" is: "+cd.CountDigitsInNumber(num));
    }

}