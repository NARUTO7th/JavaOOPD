package textbook;

import javax.xml.soap.Text;

public class TestLessonClass {
    public static void main(String[] args) {
        TextbookClass[] t = new TextbookClass[3];
        for(int i = 0;i < 3;i++){
            t[i] = new TextbookClass ("bookName0" + i,01);
        }
        LessonClass lc = new LessonClass ("computerScience",t);
        System.out.println (lc);
    }
}
