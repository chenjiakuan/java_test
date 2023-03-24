package thread;

class Sale implements Runnable {

    int ticket = 10000;
    Object obj = new Object();

    //    synchronized
    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticket > 0) {
                    System.out.print(Thread.currentThread().getName() + "卖出了一张票");
                    ticket -= 1;
                    System.out.println("此时还有" + ticket + "张票未卖出！");

                } else {
                    break;
                }
            }
        }

    }
}

class Sale1 implements Runnable {

    int ticket = 10000;
    Object obj = new Object();
    boolean isFlag = true;

    //    synchronized
    @Override
    public void run() {
        while (isFlag) {
            show();
        }
    }

    public synchronized void show() {
        if (ticket > 0) {
            System.out.print(Thread.currentThread().getName() + "卖出了一张票");
            ticket -= 1;
            System.out.println("此时还有" + ticket + "张票未卖出！");
        } else {
            isFlag = false;
        }
    }
}

public class thread_safe {
    public static void main(String[] args) {
        Sale1 sale = new Sale1();
        Thread t1 = new Thread(sale);
        Thread t2 = new Thread(sale);
        Thread t3 = new Thread(sale);

        t1.setName("thread_1");
        t2.setName("thread_2");
        t3.setName("thread_3");
        t1.start();
        t2.start();
        t3.start();


    }
}
