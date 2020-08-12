package inherit.bai_tap.point_moveable_point;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
        this(0.0f,0.0f);
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {

        return new float[]{xSpeed,ySpeed};
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "), speed = (" + xSpeed + "," + ySpeed + ")";
    }

    public MoveablePoint move() {
        float x = super.getX() + xSpeed;
        super.setX(x);
        float y = super.getY() + ySpeed;
        super.setY(y);
        return this;
    }
}
