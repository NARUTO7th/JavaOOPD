//package chapter3;

/**
 *
 * @author pisces
 * 
 */
public class YangHuiTriangleClass {

    public static final int N = 10;

    /*public static void main(String args[]) {
        int[][] data = new int[N][N];     //创建具有10个引用型变量的一维数组

        //创建data中每个元素引用的一维数组


        data[0][0] = 1;                  //计算第1行的数值

        for (int i = 1; i < N; i++) {
            data[i][0] = 1;               //每行的第一个1
            //计算中间的数值
            if(i > 1){
               for(int j = 1;j < i;j++){
                   data[i][j] = data[i-1][j-1] + data[i-1][j];
               }
            }

            data[i][i] = 1;              //每行的最后一个1
        }

        //输出“杨辉三角形”
        for(int i = 0;i < data.length;i++){
            for(int j = 0;j < i + 1;j++){
                System.out.print (" " + data[i][j]);
            }
            System.out.println ();
        }
    }*/
}
