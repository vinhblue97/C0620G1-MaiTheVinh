package array;
import vinhArray.FindMind;
public class findMin {
    public static void main(String[] args){
        int[][] array = {{9,2,3},{4,2,6},{2,9,4}};
        FindMind mMIn = new FindMind(array);
        int my = mMIn.FindMind(array);
        System.out.print("Min = "+my);
    }
}
