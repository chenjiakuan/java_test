package com.kaikeba.xinzhike;

public class Student {
    public String name;
    public String introduce(){
        return String.format("大家好，我是%s,很高兴认识大家！",name);
    }
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int fact(int n){
        return n==1?1:n*fact(n-1);
    }
}

class Person{
    String name;
    private int age;

    public void setAge(int age) {
        if (age <=100 && age>0) {
            this.age = age;

        }
        else {
            System.out.println("您输入的名字不符合要求！");
            this.age=18;
        }
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
