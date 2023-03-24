package thread;

class Printnu implements Runnable {
    private int num = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();
                if (num < 100) {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
                    System.out.println(Thread.currentThread().getName() + "打印" + num);
                    num += 1;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    break;
                }
            }
        }


    }
}

public class thread_communation {
    public static void main(String[] args) {
        Printnu print = new Printnu();
        Thread t1 = new Thread(print);
        Thread t2 = new Thread(print);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();


    }
}
