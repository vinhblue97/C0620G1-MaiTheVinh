package array;

import vinhArray.Splice;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập số phẩn tử của mảng: ");
            int arrayLength = sc.nextInt();
            int[] arr = new int[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                System.out.print("Nhập phần tử arr[" + i + "] của mảng: ");
                arr[i] = sc.nextInt();
            }
            System.out.print("Nhập giá trị phần tử muốn xóa: ");
            int deleteElement = sc.nextInt();
            Splice delete = new Splice(arr, deleteElement);
            arr = delete.Spice(arr,deleteElement);
            System.out.print("Mảng sau khi xóa: ");
            for (int i = 0; i < arrayLength; i++) {
                System.out.print(arr[i] + ",");
            }
            System.out.println("");
        }
    }

}
