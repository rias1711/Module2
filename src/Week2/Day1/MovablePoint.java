package Week2.Day1;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {}

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed, float x, float y) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
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
        xSpeed = getxSpeed();
        ySpeed = getySpeed();
    }

    public float[] getSpeed() {
        float[] array = new float[2];
        array[0] = getxSpeed();
        array[1] = getySpeed();
        return array;
    }

    public void move(){
        setX(this.getX() + getxSpeed());
        setY(this.getY() + getySpeed());
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + "), speed = (" + getxSpeed() + ", " + getySpeed() + "), kế thừa của " + super.toString();
    }


    public static void main(String[] args) {
        MovablePoint point = new MovablePoint();
        System.out.println(point);

        point = new MovablePoint(1.0f, 1.3f);
        point.move();
        System.out.println(point);

        point = new MovablePoint(2.3f, 1.4f, 0.2f, 0.4f);
        point.move();
        System.out.println(point);
    }
}
