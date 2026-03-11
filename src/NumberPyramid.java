package src;

public class NumberPyramid {
    static void first() {
            int k=1;
            int m=4;
            for(int i=0;i<m;i++) {
                for (int j=1;j<=m-i;j++){
                    System.out.print(k);
                    System.out.print(" ");
                    k++;
                }
                System.out.println("");
            }
        }
        
    static void second() {
            int k=3;
            int m=4;
            for (int i=0;i<m;i++){
                for (int j=1;j<=i+1;j++){
                    System.out.print(k);
                    System.out.print(" ");
                    k = k+3;
                }
                System.out.println("");
            }
            
        }    
    public static void main(String[] args) {
        
        
        System.out.println("Inverted Pyrmaid Here");
        first();
        System.out.println("Pyrmaid Here");
        second();
    }
}

