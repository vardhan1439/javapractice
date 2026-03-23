package src;

public class SentenseReverse {

    public String reverse (String s) {
        String s1="";
        for (int i=s.length()-1;i>=0;i--) {
            s1 = s1+s.charAt(i);
        }
        return s1;
    }

    public static void main (String[] args){

        SentenseReverse sr = new SentenseReverse();
        System.out.println(sr.reverse("Phani Jayavardhan"));
    }

}