package src;

public class MultiDimensionalArray{

    public void printElements() {

        int a[][] = {{1,2,3},{4,5,6}};
        System.out.println("Array Length: "+ a.length);

        for(int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.println(a[i][j]);
            }
        }
    }

    public int printSmallestElement() {

        int a[][] = {{4,7,3},{9,5,6},{1,8,2}};
        int s =a[0][0];

        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){

                int val = a[i][j];
                if (val < s) {
                    s= val;
                }
            }
        }

        return s;
    }

    public int printLargestElement() {

        int a[][] = {{4,7,3},{9,5,6},{1,8,2}};
        int s =a[0][0];

        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){

                int val = a[i][j];
                if (val > s) {
                    s= val;
                }
            }
        }

        return s;
    }

    public int printMinElementColumnMaxElement() {

        int a[][] = {{4,7,3},{9,5,6},{8,2,1}};
        int s =a[0][0];
        int minColIndex = 0;

        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){

                int val = a[i][j];
                if (val < s) {
                    s= val;
                    minColIndex = j;
                }
            }
        }

        System.out.println("Minimum element is in column: "+minColIndex);

        int maxElement = a[0][minColIndex];

        for (int k=0;k<3;k++){
            if (a[k][minColIndex]>maxElement){
                maxElement = a[k][minColIndex];
            }

        }

        return maxElement;
    }

    public static void main (String[] args) {

        MultiDimensionalArray m = new MultiDimensionalArray();
        //System.out.println(m.printSmallestElement());
        //System.out.println(m.printLargestElement()); 
        System.out.println(m.printMinElementColumnMaxElement());       
    }
}