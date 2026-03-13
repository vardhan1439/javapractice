package src;

import java.util.ArrayList;

public class CollectionsPractice {

    public static void main (String[] args) {
        int a[]= {4,5,5,5,6,6,9,4};
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<a.length;i++) {
            int k=1;
            if(al.contains(a[i])){
                continue;
            }
            else{
                al.add(a[i]);
                for(int j=i+1;j<a.length;j++){
                    if(a[i]==a[j]){
                        k=k+1;
                    }
                }
            }
            System.out.println(a[i]+" is present "+k+" times");
            if(k==1){
                System.out.println(a[i]+" is a unique number");
            }
        }
    }
}
