//package chapter3;

/**
 *
 * @author pisces
 * 
 */
public class MagicMatrixClass {

    public static final int N = 5;

    /*public static void main(String[] args) {
    	// 初始化放置魔方阵的二维数组m
        int[][] m = new int[N][N];
        
        int i, j, number;

        i = 0;
        // 给j赋值
        j = 2;
        // 将1放置在第1行的中间
        m[i][j] = 1;

        *//*
        * @ @ 1 @ @
        * @ @ @ @ @
        * @ @ @ @ @
        * @ @ @ @ @
        * @ @ @ @ @
        * *//*
        
        for (number = 2; number <= N * N; number++) {  	// 从2~N*N按下列规则放置
        	
            if (m[(i - 1 + N) % N][(j + 1) % N] == 0) {         							// 判断右上方是否为空
            	// 计算右上方位置
                i = (i - 1 + N) % N;
                j = (j + 1) % N;        				
            } else {
            	// 计算正下方位置
                i = (i + 1) % N;  
                // j不变
            }
            // 将当前数值放置在m[i][j]
            m[i][j] = number;
        }

        // 输出魔方阵
        for(int r = 0;r < m.length;r++){
            for(int v = 0;v < m[r].length;v++){
                System.out.printf ("%3d", m[r][v]);
            }
            System.out.println ();
        }

    }*/
}
