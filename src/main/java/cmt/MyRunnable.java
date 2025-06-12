package cmt;

public class MyRunnable implements Runnable{
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " step -> " + i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){}
        }
    }

    public static void main(String[] args) {
        new Thread(new MyRunnable("Thread-A")).start();
        new Thread(new MyRunnable("Thread-B")).start();
    }
}
