package array;

public class FindMax {
    public static void main(String[] args){
        int[][] array = {{1,2,3},{4,2,6},{2,9,1}};
        int max = array[0][0];
        for (int index1 = 0; index1 < array.length;index1++){
            for (int index2 = 0; index2<array[index1].length;index2++){
                if (array[index1][index2]>max){
                    max = array[index1][index2];
                }
            }
        }
        System.out.print("Max = "+max);
    }
}
