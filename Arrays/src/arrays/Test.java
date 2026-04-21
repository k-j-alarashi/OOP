package arrays;

public class Test {
    public static void main(String[] args) {
        int[][] arr1 = 
        {
            {2,3},
            {4,5}
        };
        
        int [] r = Arrays_2D.copyTo1DArray(arr1);
        
        for (int i = 0; i < r.length; i++) {
            System.out.print("r["+i+"] = "+r[i]+"     ");
        }
        System.out.println("");
    }
    
}
