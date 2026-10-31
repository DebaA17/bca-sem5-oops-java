class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println(getName() + ": " + i);
    }
}

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        NumberThread first = new NumberThread();
        NumberThread second = new NumberThread();
        first.start();
        second.start();
        first.join();
        second.join();
    }
}
