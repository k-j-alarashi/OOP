package lab05;

public class Lab05 {
    public static void main(String[] args) {
       int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        Arrays_2D.printArr(arr);
        System.out.println(Arrays_2D.search(arr, 3));
    }
    
}
