//package chapter3;

import java.util.Scanner;
/**
*
*@ClassName: AddressClass
*@Description:
*@author david
*@data 2020/3/13
*@version 1.0
*/
public class AddressClass {

    public static void main(String[] arg) {

        String data = "我嗨李四各位哦给李四复位后发我肥沃李四放我访问后李樊红伟四分嚄嚄嚄范围李四佛为红包蓝色配个好玩李四";
        String name = "李四";

        int index = 0;
        int ex = 0;
        while(true){
            if(data.indexOf(name) < 0) break;
            ex = data.indexOf(name);

            System.out.println(index + ex);
            index = name.length() + ex + index;
            data = data.substring(name.length() + ex);
        }


    	/*String name = null;
    	int age = 0;
    	String tel = null;
    	String address = null;
    	String post = null;
    	
        //创建Scanner类对象
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter your name:");
        // 输入姓名
        name = scan.next ();
        System.out.printf("Enter your age:");
        // 输入年龄
        age = scan.nextInt ();
        System.out.printf("Enter your telephone number:");
        // 输入电话号码
        tel = scan.next ();
        System.out.printf("Enter your address:");
        // 输入通信地址
        address = scan.next ();
        System.out.printf("Enter your post number:");
        // 输入邮政编码
        post = scan.next();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Tel:  " + tel);
        System.out.println("Addr: " + address);
        System.out.println("post: " + post);
        
        //关闭Scanner
        scan.close ();*/
    }
}
