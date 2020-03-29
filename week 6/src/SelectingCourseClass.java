package src;

/**
 * 
 * @author pisces
 **/


public class SelectingCourseClass {
	
    private  CourseClass course;
    private  StudentClass[] student;
    private  int maxNum;
	private  int curNum;

    public SelectingCourseClass() {
    }
    
    // 为一个班级统一选课，定义带参数的构造函数，
    public SelectingCourseClass(CourseClass courseClass,StudentClass[] studentClasses,int maxNum,int curNum){
        this.course = courseClass;
        this.student = studentClasses;
        this.maxNum = maxNum;
        this.curNum = curNum;
    }

    public void setCourse(CourseClass course) {
        this.course = course;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public void setStudent(StudentClass[] student) {
        this.student = student;
    }

    public CourseClass getCourse() {
        return course;
    }

    public void setCurNum(int curNum) {
        this.curNum = curNum;
    }

    public StudentClass[] getStudent() {
        return student;
    }

    public int getCurNum() {
        return curNum;
    }

    public int getMaxNum() {
        return maxNum;
    }

    // 从选课的所有学生当中，按序号获取一名学生的信息
    public StudentClass getAt(int i){
        return this.student[i];
    }

    // 给Course添加Student的成员方法
    public void addStu(StudentClass s){
        if(curNum < maxNum){
            student[curNum ++] = s;
        }
    }

    @Override
    public String toString() {
        String str = "";
        str += course;
        for (int i = 0; i < curNum; i++) {
            str += student[i];
        }
        return str;
    }
}
