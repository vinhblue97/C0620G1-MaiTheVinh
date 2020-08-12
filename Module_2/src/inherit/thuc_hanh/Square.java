package inherit.thuc_hanh;

import abstract_class_interface.bai_tap.interface_colorable.Colorable;

public class Square extends Rectangle implements Colorable {
    private double side;

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setWidth(double width){
        setSide(width);
    }

    @Override
    public void setLength(double length){
        setLength(side);
    }
    @Override
    public String toString(){
        return "A Square with side = "+this.side+", which is a subclass of "+super.toString();
    }
}
