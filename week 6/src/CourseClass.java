package src;

/**
 * 
 * @author pisces
 **/


public class CourseClass {

    private int cNo;
    private String cName;
    private int credit;

    
    public CourseClass() {
        
    }
    
    // 定义一个带参数的构造函数
    public CourseClass(int o,String a,int c){
        this.cNo = o;
        this.cName = a;
        this.credit = c;
    }
    // 添加设置变量、获取变量的函数

    public int getcNo() {
        return cNo;
    }

    public void setcNo(int cNo) {
        this.cNo = cNo;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    // 定义成员方法 setCourse
    public void setCourse(int o,String a,int c){
        this.cNo = o;
        this.cName = a;
        this.credit = c;
    }
    @Override
    public String toString() {
        return "No.  " + cNo + "  Course name : " + cName + "  Credit: " + credit + "\n";
    }
}
