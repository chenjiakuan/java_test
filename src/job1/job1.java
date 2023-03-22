package job1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class job1 {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入姓名：");
//        String name= scanner.nextLine();
//        System.out.println("请输入成绩");
//        double grade= scanner.nextDouble();
//        System.out.println(name+grade);
//        int age=19;
//        String mes=(age>18)?"man":"woman";
//        System.out.println(mes);
//        DecimalFormat df =new DecimalFormat("**000,000.00");
//        double num=1223.343234;
//        String s= df.format(num);
//        System.out.println(s);
        Scanner scanner=new Scanner(System.in);
        double month_salary= scanner.nextDouble();
        double year_salary=month_salary*15;
        double day_salary=month_salary/22;
        DecimalFormat df=new DecimalFormat("000,000.00");
        String day_salary1= df.format(day_salary);
        System.out.println(month_salary);
        System.out.println(year_salary);
        System.out.println(day_salary1);


    }
}
