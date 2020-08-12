package array;

public class concatArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {7, 8, 9, 10, 1};
        int[] array3 = new int[array1.length + array2.length];
        int index2 = 0;
        for (int index1 = 0; index1 < array1.length + array2.length; index1++) {
            if (index1 > 4) {
                array3[index1] = array2[index2];
                index2++;
            } else {
                array3[index1] = array1[index1];
            }
        }
        for (int element:array3){
            System.out.print(element+",");
        }

    }
}
