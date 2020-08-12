package inherit.bai_tap.draw_class_point_2d_3d;

public class Point2D {
    private float x;
    private float y;

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Point2D(){
        this(0.0f,0.0f);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        return new float[] {x, y};
    }

    public String toString(){
        return "("+this.getX()+","+this.getY()+")";
    }

}
