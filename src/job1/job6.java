package job1;

import com.kaikeba.xinzhike.Student;

import java.sql.SQLOutput;

public class job6 {
    public static void main(String[] args) {
        Student student1=new Student();
        System.out.println(student1.add(12,23));

    }
}

class Car{
    String color;
    Double price;
    void speedup(){
        System.out.println("售价"+price+"的"+color+"汽车正在加速");
    }
}
