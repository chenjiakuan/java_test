package array;

import java.util.Arrays;

public class twoarry {
    public static void main(String[] args) {
//        int[]  array1=new int[3];
//        array1[0]=10;
//        array1[1]=12;
//        array1[2]=11;
//
//        //TODO：数组元素调用
//        for (int i = 0; i < 3; i++) {
//            System.out.println(array1[i]);
//
//        }
//        System.out.println(array1);
//        int [][] arr2=new int[3][3];
//        System.out.println(arr2);
//        System.out.println(arr2[1].length);
//        int [][] arr1= {{1,2,3,3},{2,3,4,5},{4,3,2}};
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                System.out.print(arr1[i][j]+"\t");
//
//            }
//            System.out.println();

//        }
//        int[][] arr1 = new int[3][];
//        arr1[0]=new int[3];
//        arr1[1]=new int[2];
        int [] arr1=new int[]{1,2,3};
        int [] arr2=new int[]{1,2,3};
        boolean a=Arrays.equals(arr1,arr2);
        System.out.println(a);
        System.out.println(arr2==arr1);

        


    }
}
