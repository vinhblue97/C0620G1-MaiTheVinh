package inherit.thuc_hanh;
import abstract_class_interface.bai_tap.interface_colorable.Colorable;
public class Rectangle extends Shape implements Colorable {
    private double width;
    private double length;

    public Rectangle(){

    }
    public Rectangle(double width, double length){
        this.width = 1.0;
        this.length = 1.0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString(){
        return "A Rectangle with width = "+this.width+ "and length ="+this.length+", which is a subclass of "+super.toString();
    }
}
