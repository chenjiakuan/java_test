package oop;

public class singleEgg {
    public static void main(String[] args) {
        Bank b1=Bank.getInstance();
        Bank b2=Bank.getInstance();
        System.out.println(b1==b2);
    }




}

class Bank{

    private Bank(){

    }

    private static Bank instance=new Bank();

    public static Bank getInstance() {
        return instance;
    }
}

