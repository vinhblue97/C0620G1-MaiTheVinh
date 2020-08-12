package vinhArray;

public class Splice {
    public Splice(int[] array, int deleteElement) {

    }

    public int[] Spice(int[] array, int deleteElement) {
        int check = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == deleteElement) {
                check = 1;
            }
            if (check == 1) {
                array[i] = array[i + 1];
            }
        }
        array[array.length - 1] = 0;
        return array;
    }
}
