package lab06;

public class Lab06 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {10,20,30,40,50};
        
        int[] res = Arrays_1D.sumTwoArrays(arr1, arr2);
        
        Arrays_1D.printArr(res);
    }
    
}
