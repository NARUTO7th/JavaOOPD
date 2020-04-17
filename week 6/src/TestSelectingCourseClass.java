package src;

/**
 * 
 * @author pisces
 **/


public class TestSelectingCourseClass {

    public static  final int NUM = 100;

    public static void main(String[] args) {
    	
    	// 定义 SelectingCourseClass类 实例变量 sCourse;
    	SelectingCourseClass sCourse;
    	
        // 定义并初始化 CourseClass类 实例变量 course （cNo:1, cName:Java programming, credit:3);
        CourseClass course = new CourseClass (1,"Java programing",3);
        // 创建 StudentClass类 数组 s （数组大小用NUM）
        StudentClass[] s = new StudentClass[NUM];
    	// 为数组 s 的每一个元素创建对象，并初始化（No：从100 递增，name：name+序号，subject:Computer）
        for(int i = 0;i < 100;i++){
            s[i] = new StudentClass (i + 100,"name" + (i +100),"Computer");
        }
    	
        // 为sCourse创建对象
        sCourse = new SelectingCourseClass(course, s, 100, 10);
        
        // 在sCourse，添加学生信息（No: 200, name: name_last, subject: Computer)
        sCourse.addStu (new StudentClass (200,"name_last","Computer"));
        System.out.println(sCourse);

    }
}
