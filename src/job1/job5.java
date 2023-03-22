package job1;

import java.text.DecimalFormat;
import java.util.Arrays;

public class job5 {
    public static void main(String[] args) {
//        int []nums=new int[5];
//        nums[0]=12;
//        System.out.println(nums[0]);
//        System.out.println(nums[1]);
//        for (int i = 0; i < 5; i++) {
//            System.out.println(nums[i]);
//
//        }
        int []nums={12,23,34,45,11,2};
        int num=90;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                int index = i;
                System.out.println(index);
                break;
            }
            System.out.println(-1);
        }
//        int num=0;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]>num){
//                num=nums[i];
//            }
//
//        }
//        int sum=0;
//        for (int i = 0; i < nums.length; i++) {
//            sum+=nums[i];
//        }
//        DecimalFormat df=new DecimalFormat("000.000");
//        System.out.println(sum);
//        System.out.println(df.format(sum/nums.length));
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length-i-1; j++) {
//                if (nums[j]>nums[j+1]){
//                    int temp=nums[j+1];
//                    nums[j+1]=nums[j];
//                    nums[j]=temp;
//                }
//
//            }
//
//        }
//        System.out.println(Arrays.toString(nums));


    }
}
