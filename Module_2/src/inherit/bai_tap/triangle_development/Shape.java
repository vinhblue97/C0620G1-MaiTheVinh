package inherit.bai_tap.triangle_development;

public class Shape {
    private String color;

    public Shape(){
        this("blue");    }

    public Shape(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "A shape with color: "+ color;
    }
}
