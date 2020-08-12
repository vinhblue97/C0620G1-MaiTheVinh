package class_object.bai_tap.StopWatch;

public class StopWatch {
    long start, stop;

    public StopWatch() {

    }

    private long startTime() {
        this.start = System.currentTimeMillis();
        return this.start;
    }

    public long getStartTime() {
        return startTime();
    }

    private long stopTime() {
        this.stop = System.currentTimeMillis();
        return this.stop;
    }

    public long getStopTime() {
        return stopTime();
    }

    public long getElapsedTime() {
        return this.stop - this.start;
    }
}


