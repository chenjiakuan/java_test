package oop;

public class _static {
    public static void main(String[] args) {
        Chinese c1=new Chinese(12,"cjk");
        Chinese c2=new Chinese(13,"cjj");
        System.out.println(Chinese.getCountry());
        System.out.println(Chinese.country);
        System.out.println(c1.country);


    }

}

class Chinese{
    static String country="china";
    int age;
    String name;

    public Chinese(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Chinese.country = country;
    }
}
