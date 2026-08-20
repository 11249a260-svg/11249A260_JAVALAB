class Counter extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class TaskManager {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.start();
    }
}
