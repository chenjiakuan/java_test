package oop;

public class inter {
    public static void main(String[] args) {
        System.out.println(Fly.leg);
        plane p1=new plane();
        p1.fly();
    }

}

interface Fly{
    public static final int leg=2;

    public static final int max_speed=1000;

    void fly();

}

class plane implements Fly{
    public void fly(){
        System.out.println("我可以飞");
    }
}