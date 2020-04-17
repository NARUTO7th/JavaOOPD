//package chapter3;

/**
 *
 * @author pisces
 * 
 */
import java.util.*;

public class Palindrome {

    /*public static void main(String[] args) {
        String str;
        // 定义 Scanner in
        Scanner in = new Scanner (System.in);

        System.out.print("Enter a string: ");
        str = in.nextLine();
        System.out.println("You've entered string:  " + str);
        
        // 调用isPalindrome()方法判str是否为回文
        // 输出判断结果
        if(isPalindrome (str)){
            System.out.println ("This word is palindrome.");
        }else System.out.println ("This word isn't palindrome.");
    }*/
    
    // 判断str是否为回文
    public static boolean isPalindrome(String str) 
    {
        // 得出字符串长度，存到变量
    	int len = str.length ();
    	// 从字符串的左端开始，比较相对称的两个字符

        for(int i = 0;i < len/2;i++){
            if(str.charAt (i) != str.charAt (len-1-i)) return false;
        }
        return true;
    }
}	
