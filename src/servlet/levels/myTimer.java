package servlet.levels;

public class myTimer {
    private long start = 0;

    public myTimer(){
        start =  System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return System.currentTimeMillis()-start;
    }
}
