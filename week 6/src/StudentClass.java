package src;

/**
 * 
 * @author pisces
 **/


public class StudentClass {

    private int No;
    private String name;
    private String subject;

    
    public StudentClass() {
    }

    // 再定义一个构造函数
    public StudentClass(int No,String name,String subject){
        this.No = No;
        this.name = name;
        this.subject = subject;
    }

    // 设置变量、获取变量的函数

    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // 定义成员方法 setStudent
    public void setStudent(int No,String name,String subject){
        this.No = No;
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "No.   " + No + "  Name : " + name + "  Subject: " + subject + "\n";
    }
}
