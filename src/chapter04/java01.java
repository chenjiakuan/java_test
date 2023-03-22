package chapter04;

public class java01 {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.name="陈家宽";
        cat1.age=12;
        cat1.color="red";
        cat1.cooking();

    }
}

class Cat{
//            属性
    String name;
    int age;
    String color;

//            功能
    void cooking(){
        System.out.println("sjad");
        System.out.println("sahd");
        System.out.println(age);
        System.out.println(name);
    }
}

