package thread;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        Printnum printnum = new Printnum();
        printnum.start();

        Print print=new Print();
        Thread t1=new Thread(print);
        t1.start();


        for (int i = 0; i < 10000; i++) {
            if (i % 2 == 0) {
//                arr[i]=i;
                System.out.println(Thread.currentThread().getName() + i + "******");
            }
        }
    }
}


class Printnum extends Thread {
//    int arr[]=new int[100];

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            if (i % 2 == 0) {
//                arr[i]=i;
                System.out.println(i + "  " + Thread.currentThread().getName()+"thread");
            }
        }

//        System.out.println(Arrays.toString(arr));
    }
}

class Print implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            if (i % 2 == 0) {
//                arr[i]=i;
                System.out.println(i + "  " + Thread.currentThread().getName()+"runnable");
            }
        }
    }
}
