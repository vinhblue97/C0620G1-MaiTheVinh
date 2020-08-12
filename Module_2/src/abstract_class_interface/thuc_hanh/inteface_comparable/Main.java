package abstract_class_interface.thuc_hanh.inteface_comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[2] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[0] = new ComparableCircle(3.5, "red", false);
        
        System.out.println("Pre-sort");
        for(ComparableCircle circle : circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);

        System.out.println("After sort");
        for(ComparableCircle circle : circles){
            System.out.println(circle);
        }
    }   
}
