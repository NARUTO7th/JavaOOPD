//package chapter3;

import java.util.*;

/**
 * 
 * @author pisces
 *
 */
public class ArraysClassDemo {

    /*public static void main(String[] args) {
        int length, key, index;
        int[] array1, array2;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");  //输入数组长度
        length = in.nextInt();
        array1 = new int[length];

        for (int i = 0; i < array1.length; i++) {      //产生length个随机数
            array1[i] = (int) (Math.random() * 1000);
        }
        array2 = Arrays.copyOf(array1, array1.length);
        for (int element : array1) {                  //显示原始的数组内容
            System.out.printf("%6d", element);
        }
        System.out.println();
        Arrays.sort(array2);                          //将数组内容重新排序
        for (int element : array2) {                  //显示排序后的数组内容
            System.out.printf("%6d", element);
        }
        System.out.println();

        System.out.print("Enter a key: ");            //输入希望查找的数值
        key = in.nextInt();

        index = Arrays.binarySearch(array2, key);     //二分查找
        if (index >= 0) {                             //显示结果
            System.out.printf("%6d at %d after sorted.\n", key, index);
        } else {
            System.out.printf("%6d isn't exist.", key);
        }
    }*/
}
