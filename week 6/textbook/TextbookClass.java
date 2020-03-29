package textbook;

public class TextbookClass {
    private String tname;
    private int tno;


    public TextbookClass(String a,int o){
        this.tname = a;
        this.tno = o;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getTno() {
        return tno;
    }

    public void setTno(int tno) {
        this.tno = tno;
    }

    @Override
    public String toString(){
         return "CourseName: " + this.tname + " CourseNO." + this.tno + "\n";
    }
}
