package Week1.Day4;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public StopWatch(){
    }

    public LocalTime start() {
        startTime = LocalTime.now();
        return startTime;
    }
    public LocalTime stop() {
        endTime = LocalTime.now();
        return endTime;
    }

    public void getElapsedTime() {
        int ElapsedTime = ((endTime.getHour() - startTime.getHour()) * 3600 + (endTime.getMinute() - startTime.getMinute()) * 60 + (endTime.getSecond() - startTime.getSecond()));
        System.out.println("Sắp xếp mất: " + ElapsedTime);
    }

    public static long[] selectionSort(long[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    long temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        long[] array = new long[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] =(long) (Math.floor(Math.random()) * 100000);
        }

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(array);
        stopWatch.stop();
        stopWatch.getElapsedTime();
    }
}
