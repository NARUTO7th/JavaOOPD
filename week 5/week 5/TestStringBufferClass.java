//package chaper4;
import java.io.*;

/**
 * 
 * @author pisces
 *
 */
public class TestStringBufferClass {

    public static String statement = new String("This is a *** example.");

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (;;) {
            System.out.print("\n> ");
            // 从键盘输入一行文本
            String text = in.readLine();
            // 用if语句设置结束输入的装置，用户输入为“q"或"quit"则结束输入
            if((text.compareTo("q") == 0) || (text.compareTo("quit") == 0)) break;

            // 创建StringBuffer对象
            StringBuffer buffer = new StringBuffer(text);
            // 替换关键词
            text.replace(10,12,"Java");
            // 显示结果
            System.out.println (text);
        }
    }
}
