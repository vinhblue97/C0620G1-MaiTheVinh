package array;

import java.util.Scanner;

public class SumDiagonalLine {
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
                System.out.print(array[index1][index2] + " ");
            }
            System.out.println("");
        }
        int sum1 = 0, sum2 =0;
        for (int index1 = 0; index1 < array.length; index1++) {
            for (int index2 = 0; index2 < array[index1].length; index2++) {
                if (index1 == index2) {
                    sum1 += array[index1][index2];
                }
                if (array[index2].length - index1 - 1 == index2){
                    sum2+=array[index1][index2];
                }
            }
        }
        System.out.println("Sum đường chéo thuận = " + sum1);
        System.out.print("Sum đường chéo nghịch = " + sum2);
    }
}
