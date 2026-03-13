package src;

import java.util.ArrayList;

public class ArrayListPractice {
    
    public static void main (String[] args) {
        
        ArrayList<String> a = new ArrayList<String>();
        a.add("apple");
        a.add("banana");
        a.add("cherry");
        a.add("mango");
        a.add("apple");
        System.out.println(a);
        a.remove("apple");
        System.out.println(a);
        if (a.contains("orange")){
            System.out.println("Orange is Present");
        }
        else{
            System.out.println("Organe is not present");
        }
        System.out.println("Array List Size is: "+a.size());
        
        for(int i=0;i<a.size();i++){
            System.out.println("Index is: "+i);
            System.out.println("Element in index "+i+" is: "+a.get(i));
        }
    }
}