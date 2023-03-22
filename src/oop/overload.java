package oop;

public class overload {
    public static void main(String[] args) {
        Anal a1 = new Anal();
        a1.setLegs(10);
        a1.setName("guagua");
        System.out.println(a1.getName());
    }
}

class Anal {

    private String name;
    private int legs;

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }
}
