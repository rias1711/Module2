package Week1.Day4;

import java.util.Date;

public class StopWatch {
    private double startTime = new Date().getTime();
    private double endTime = new Date().getTime();

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public StopWatch(){
    }

    public double start() {
        return this.getStartTime();
    }
    public double stop() {
        return this.getEndTime();
    }

    public static void main(String[] args) {

    }
}
