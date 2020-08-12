package inherit.thuc_hanh;

import abstract_class_interface.bai_tap.interface_colorable.Colorable;

public class Shape implements Colorable {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;

    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        return "A shape with color of "+this.color+" and "+(filled?"Filled":"not filled");
    }

    @Override
    public void howToColor() {

    }

    public void resize(double percent) {
    }
}