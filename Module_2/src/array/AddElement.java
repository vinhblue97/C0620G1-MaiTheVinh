package array;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập số phẩn tử của mảng: ");
            int arrayLength = sc.nextInt();
            int[] arr = new int[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                System.out.print("Nhập phần tử arr[" + (i + 1) + "] của mảng: ");
                arr[i] = sc.nextInt();
            }
            System.out.print("Nhập giá trị phần tử muốn thêm: ");
            int addElement = sc.nextInt();
            System.out.print("Nhập vị trí phần tử muốn thêm: ");
            int index = sc.nextInt();
            for (int i = arrayLength - 1; i >= 0; i--) {
                if (i != index) {
                    arr[i] = arr[i - 1];
                } else {
                    arr[i] = addElement;
                    break;
                }
            }
            arr[arrayLength - 1] = 0;
            System.out.print("Mảng sau khi thêm: ");
            for (int i = 0; i < arrayLength; i++) {
                System.out.print(arr[i] + ",");
            }
            System.out.println("");
        }
    }
}
