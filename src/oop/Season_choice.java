package oop;

public class Season_choice {
    public static void main(String[] args) {
        System.out.println(Season.autumn.getMonth());
        System.out.println(Season.autumn.getName());
        System.out.println(Season.spring.toString());
    }
}

class Season{


    private final String name;
    private final String month;
    private Season(String name,String month){
        this.name=name;
        this.month=month;

    }

    public String getName() {
        return name;
    }

    public String getMonth() {
        return month;
    }

    public static final Season spring =new Season("春天","春暖花开");
    public static final Season summer =new Season("夏天","热死了");

    public static final Season autumn =new Season("秋天","秋高气爽");

    public static final Season winter =new Season("冬天","冻死了");


    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", month='" + month + '\'' +
                '}';
    }
}
