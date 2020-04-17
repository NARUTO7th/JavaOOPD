
//package chapter3;

/**
 *
 * @author pisces
 * 
 */
import java.util.*;

public class VotingClass {

    public static final int N = 20;  // 候选人数 

    /*public static void main(String[] agrs) {
        int[] v = new int[N];
        
        enterVotes(v);
        
        printVotes(v);
        
        System.out.println("Winner is NO." + statistics(v));
    }*/

    public static void enterVotes(int[] v) {

        Scanner in = new Scanner(System.in);
        int vote;

        System.out.println("Enter voter NO.:");
        // 编写投票程序
        // 学生输入候选人编码，以示投票
        // index（下标表达式）为候选人编码的数组元素储存该候选人的投票数
        /*********************  Begin  *********************/
        vote = in.nextInt ();
        v[vote]++;


        /*********************  End  *********************/
    }

    public static void printVotes(int[] v) {
        System.out.print("( ");
        for (int i = 0; i < N; i++) {
        /*********************  Begin  *********************/
            System.out.printf ("NO. %2d candidate has %3d\n", i, v[i]);
        /*********************  End  *********************/
    	}
        System.out.print(" )");
    }

    public static int statistics(int[] v) {
    	/*********************  Begin  *********************/
        // 根据学生的投票情况决定学生会主席的获胜人选
    	// 函数有返回值
        int voter = 0;
        int vi = 0;
        for (int i = 0; i < N; i++){
            if(voter < v[i]){
                voter = v[i];
                vi = i;
            }
        }
        return vi + 1;
        /*********************  End  *********************/
    }
}
