//package chapter3;

/**
 * 
 * @author pisces
 *
 */
public class SelectSortClass {

    public static final int ARRAY_MAX_LENGTH = 10; 	// 数组元素个数

    
    /*public static void main(String[] args) {
        int[] data = new int[ARRAY_MAX_LENGTH];    	// 创建data数组

        enterArray(data);
        printArray(data);

        sort(data);                      			// 调用Sort方法排序

        printArray(data);
    }*/

    public static void enterArray(int[] data) {
        // 产生data.length个随机整数
    	for(int i = 0;i < data.length;i++){
    	    data[i] = (int)(Math.random ()*1000);
        }
    }

    public static void printArray(int[] data) {
        System.out.println();             
        // 用for-each 语句输出排序结果
        for(int d : data){
            System.out.printf ("%5d",d);
        }
    }

    public static void sort(int[] data) { //选择排序
        int index,temp;

        for (int i = 0; i < data.length - 1; i++) {
            index = i;
            // 从第i个元素查最大值的位置，更新index
            for(int j = i + 1;j < data.length;j++){
                if(data[j] < data[index]) index = j;
            }
            
            // 第i个元素并非最大值时，与最大值交换位置
            if(data[i] != data[index]){
                temp = data[index];
                data[index] = data[i];
                data[i] = temp;
            }
        }
    }
}
