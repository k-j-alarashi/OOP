package lab07;

import java.util.Scanner;

public class Arrays_2D {

    public static void printArr(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print("arr[" + row + "][" + col + "] = " + arr[row][col] + "     ");
            }
            System.out.println();
        }
        System.out.println("============================");
    }

    public static void inputArrElements(int[][] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Elements : ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }

        }
    }

    public static int[][] sumTwoArrays(int[][] arr1, int[][] arr2) {
        if (arr1.length != arr2.length || arr1[0].length != arr2[0].length) {
            return null;
        }

        int[][] res = new int[arr1.length][arr1[0].length];
        for (int row = 0; row < res.length; row++) {
            for (int col = 0; col < res[row].length; col++) {
                res[row][col] = arr1[row][col] + arr2[row][col];
            }
        }
        return res;
    }

    public static boolean search(int[][] arr, int s) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == s) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] copyTo1DArray(int[][] arr) {
        int[] res = new int[arr.length * arr[0].length];
        int i = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                res[i] = arr[row][col];
                i++;
            }
        }
        return res;
    }
}
