package vinhArray;

public class FindMind {

    public FindMind(int[][] array) {

    }

    public int FindMind(int[][] array) {
        int min = array[0][0];
        for (int index1 = 0; index1 < array.length; index1++) {
            for (int index2 = 0; index2 < array[index1].length; index2++) {
                if (array[index1][index2] < min) {
                    min = array[index1][index2];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {

    }

}
