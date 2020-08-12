package inherit.bai_tap.draw_class_point_2d_3d;

public class Main {
    public static void main(String[] args){
//        Test Point2D
        Point2D point2D = new Point2D(3.1f,6.2f);
        point2D.setXY(3.7f,6.2f);
        point2D.getXY();
        point2D.toString();
//        Test Point3D
        Point3D point3D = new Point3D();
        point3D.setXYZ(1.4f,6.2f,9.4f);
        float[] arr = point3D.getXYZ();
        point3D.toString();
    }
}
