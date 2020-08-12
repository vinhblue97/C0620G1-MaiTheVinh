package inherit.bai_tap.point_moveable_point;

public class Main {
    public static void main(String[] args){
//        Test Point
        Point point = new Point();
        point.setXY(3.5f,6.3f);;
        point.toString();
//        Test MoveablePoint
        MoveablePoint move = new MoveablePoint(3.5f,5.4f,1.2f,6.3f);
        move.move();
        move.move();
        move.move();
        move.move();
    }
}
