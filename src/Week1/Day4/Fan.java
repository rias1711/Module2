package Week1.Day4;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Fan(){
    }

    public String toString() {
        if (isOn()) {
          return ("Fan is on. Speed: " + getSpeed() + ", color: " + getColor() + ", radius: " + getRadius());
        } else {
           return ("Fan is off. Color: " + getColor() + ", radius: " + getRadius());
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setOn(false);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println(fan2.toString());
    }
}
