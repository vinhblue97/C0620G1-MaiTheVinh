import java.util.Arrays;

public class Test {

    public static int[] findElement(int[] arr, int element) {
        int size = 0;
        int[] result = new int[size];
        int index = 0;
        int i = 0;
        while (index < arr.length) {
            if (arr[index] == element) {
                result = Arrays.copyOf(result, ++size);
                result[i] = index;
                i++;
            }
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 4, 9, 4, 6, 2, 4};
        int[] result = findElement(array, 4);
        for (int e : result) {
            System.out.println(e);
        }
    }
}