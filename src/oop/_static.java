package oop;

public class _static {
    public static void main(String[] args) {
//        Chinese c1=new Chinese(12,"cjk");
//        Chinese c2=new Chinese(13,"cjj");
//        System.out.println(Chinese.getCountry());
//        System.out.println(Chinese.country);
//        System.out.println(c1.country);
        Account a1=new Account();
        Account a2=new Account();
        System.out.println(a1);
        System.out.println(a2);


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

class Account{
    public int id;
    public String pass;

    private double balance;

    private static double interestRate=0.3;
    private static double minbalance=1;

    private static int init=1001;
    public Account(){
        this.id=init;
        init++;

    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", pass='" + pass + '\'' +
                ", balance=" + balance +
                '}';
    }
}
