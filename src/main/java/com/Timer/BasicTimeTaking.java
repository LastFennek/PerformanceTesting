package main.java.com.Timer;

public class BasicTimeTaking implements TimeTaking {
    private long start;
    private long time;

    @Override
    public void startTimer() {
        start = System.nanoTime();
    }

    @Override
    public void endTimer() {
        time = System.nanoTime()-start;
        System.out.println("Time: "+time/1000000);
    }

    @Override
    public void endTimer(int times) {
        time = System.nanoTime()-start;
        System.out.println("Average: "+(time/1000000)/times+"\tTotal: "+(time/1000000));
    }
}
