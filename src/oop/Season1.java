package oop;

public class Season1 {
    public static void main(String[] args) {
        System.out.println(Season2.autumn.getClass());
        System.out.println(Season2.winter.getClass().getSuperclass());
    }
}

enum Season2 {
    spring("春天", "春暖花开"),
    summer("夏天", "热死了"),

    autumn("秋天", "秋高气爽"),

    winter("冬天", "冻死了");

    private final String name;
    private final String month;

    private Season2(String name, String month) {
        this.name = name;
        this.month = month;

    }

    public String getName() {
        return name;
    }

    public String getMonth() {
        return month;
    }



}

