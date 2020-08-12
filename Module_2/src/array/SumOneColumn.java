package array;

import java.util.Scanner;

public class SumOneColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];
        for (int index1 = 0; index1 < array.length; index1++) {
            for (int index2 = 0; index2 < array[index1].length; index2++) {
                System.out.print("Nhập phần tử array[" + index1 + "][" + index2 + "]= ");
                array[index1][index2] = sc.nextInt();
            }
        }
        for (int index1 = 0; index1 < array.length; index1++) {
            for (int index2 = 0; index2 < array[index1].length; index2++) {
                System.out.print(array[index1][index2]+" ");
            }
            System.out.println("");
        }
        int sum = 0;
        System.out.print("Nhập số thứ tự cột: ");
        int column = sc.nextInt();
        for (int index = 0; index < array.length; index++) {
            sum += array[index][column];
        }
        System.out.print("Sum = " + sum);
    }
}
