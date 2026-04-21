package lab06;

import java.util.Scanner;

public class Arrays_1D {

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = " + arr[i]+"     ");
        }
        System.out.println("\n=============================");
    }

    public static void inputArrElements(int[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    }

    public static boolean search(int[] arr, int s) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                return true;
            }
        }
        return false;
    }

    public static boolean update(int[] arr, int oldElement, int newElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement) {
                arr[i] = newElement;
                return true;
            }
        }
        return false;
    }

    // دالة الحذف من دون عملية (shifting) 
    public static boolean delete(int[] arr, int oldElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement) {
                arr[i] = 0;
                return true;
            }
        }
        return false;
    }

    public static int[] sumTwoArrays(int[] arr1, int[] arr2) {
        // شرط للتاكد من ان طول المصفوفتين متساويتين
        if (arr1.length == arr2.length) {
            int[] res = new int[arr1.length];
            for (int i = 0; i < res.length; i++) {
                res[i] = arr1[i] + arr2[i];
            }
            return res;
        }
        return null;
    }

    public static int[] mulTwoArrays(int[] arr1, int[] arr2) {
        // شرط للتاكد من ان طول المصفوفتين متساويتين
        if (arr1.length == arr2.length) {
            int[] res = new int[arr1.length];
            for (int i = 0; i < res.length; i++) {
                res[i] = arr1[i] * arr2[i];
            }
            return res;
        }
        return null;
    }

    public static int maxElement(int[] arr) {
        // شرط التأكد من ان المصفوفة غير فارغة
        // يتم طباعة عبارة وارجاع -1 
        // -1 ليس رقم في المصفوفة وانما يدل على ان المصفوفة فارغة
        if (arr.length == 0) {
            System.out.println("The Array is empty ...");
            return -1;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static void deleteWithShift(int[] arr , int index){
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];            
        }
        arr[arr.length-1] = 0;
    }
}
