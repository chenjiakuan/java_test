package oop;

import java.io.File;

public class equals {
    public static void main(String[] args) {
        String s1=new String("cjk");
        String s2=new String("cjk");
        System.out.println(s2==s1);

        System.out.println(s2.equals(s1));
        System.out.println(s2);
        Person p1=new Person();
        System.out.println(p1);
        System.out.println(p1.toString());

        File f1=new File("D://cjk");
        System.out.println(f1.toString());
    }
}
