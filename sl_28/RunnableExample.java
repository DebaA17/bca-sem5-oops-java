class NumberTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println(Thread.currentThread().getName() + ": " + i);
    }
}

public class RunnableExample {
    public static void main(String[] args) throws InterruptedException {
        Thread first = new Thread(new NumberTask(), "First");
        Thread second = new Thread(new NumberTask(), "Second");
        first.start();
        second.start();
        first.join();
        second.join();
    }
}
