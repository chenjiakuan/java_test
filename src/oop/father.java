package oop;

public class father {
    int age;
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showage(){
        System.out.println(this.age);
    }
}
class Son extends father{
    int age=17;
    public void show(){
        System.out.println(super.age);
    }
    @Override
    public void showage() {
        super.showage();
        System.out.println("jsh");
    }
}
