package class_object.bai_tap.Fan;

public class Main {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;

    public static String toString(Fan fan) {
        if (fan.isOn()) {
            return "Speed: " + fan.getSpeed() + "\n" +
                    "Color: " + fan.getColor() + "\n" +
                    "Radius: " + fan.getRadius() + "\n" +
                    "Fan is on";
        } else {
            return "Color: " + fan.getColor() + "\n" +
                    "Radius: " + fan.getRadius() + "\n" +
                    "Fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(Main.toString(fan1));
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(Main.toString(fan2));
    }
}

