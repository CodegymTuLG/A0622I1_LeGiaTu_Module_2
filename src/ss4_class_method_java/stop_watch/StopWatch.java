package ss4_class_method_java.stop_watch;

public class StopWatch {
    long startTime, endTime;

    public StopWatch() {

    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return this.startTime;
    }
    public long getEndTime() {
        return this.endTime;
    }
    public long start() {
        return this.startTime = System.currentTimeMillis();
    }
    public long stop() {
        return this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }

}
