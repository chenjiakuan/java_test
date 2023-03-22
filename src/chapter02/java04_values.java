package chapter02;

public class java04_values {
    public static void main(String[] args) {
        String name="陈家宽";
        if (name == null) {
            System.out.println(name);
        }
        else {
            System.out.println("名字不是空的");
        }
        // TODO 逻辑运算符
        /*
        TODO & 与运算 true&true=True
        TODO && 短路与运算 False&&***=False
        TODO | 或运算 true|False=True
        TODO || 短路或运算 true||***=True


         */
        boolean p=(9>9)|(10>9);
        System.out.println(p);

        // TODO 三元运算符 变量=（条件表达式）？（任意表达式1）：（任意表达式2）
        // 如果条件表达式为True，那么执行任意表达式1，否则执行任意表达式2
        int num1=(9>8)?(10):(23);
        System.out.println(num1);
    }
}
