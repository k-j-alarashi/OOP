package lab06;

import java.util.Scanner;

public class Arrays_1D {

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
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

    public static boolean update(int[] arr, int index, int newElement) {
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                arr[i] = newElement;
                return true;
            }
        }
        return false;
    }

    public static boolean delete(int[] arr, int index) {
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                arr[i] = 0;
                return true;
            }
        }
        return false;
    }

    public static int[] sumTwoArrays(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr1[i] + arr2[i];
        }
        return res;
    }

    public static int[] mulTwoArrays(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr1[i] * arr2[i];
        }
        return res;
    }

    public static int maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
