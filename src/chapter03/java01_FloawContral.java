package chapter03;

public class java01_FloawContral {
    public static void main(String[] args) {
        // TODO java流程控制
        /*
        1，顺序执行
        2，分支执行
        3，重复执行
         */

        // TODO 分支执行

//        int num1=10;
//        if (num1>10){
//            System.out.println(num1+10);
//        }
//        else {
//            System.out.println(num1+11);
//        }
//        String str1="cjk";
//        int num1=11;
//        if (str1==null) {
//            System.out.println("cj");
//        } else if (num1==10) {
//            System.out.println("第二部");
//        }
//        System.out.println("第三步");

        int num1=10;
        switch (num1){
            case 10:{
                System.out.println(num1);
            }
            break;
            case 11:{
                System.out.println(11);
            }
            default:{
                System.out.println(12);
            }
        }


    }
}
