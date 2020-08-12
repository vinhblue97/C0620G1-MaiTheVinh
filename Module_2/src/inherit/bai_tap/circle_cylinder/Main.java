package inherit.bai_tap.circle_cylinder;

public class Main {
    public static void main(String[] args){
//        Test Circle
        Circle circle = new Circle(2.9,"red", true);

//        Test Cylinder
        Cylinder cylinder = new Cylinder(2.0,1.0,"blue",false);
        cylinder.getVolume();
    }
}
