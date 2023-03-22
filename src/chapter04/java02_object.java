package chapter04;

public class java02_object {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Animal dog=new Animal();
        dog.name="小黑";
        dog.type="狗";
        dog.color="red";
        dog.run();


    }
}

class Animal{
    String type;
    String name;
    String color;

    void run(){
        System.out.println(type+" "+name+"跑开了");
    }
}
