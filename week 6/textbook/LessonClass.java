package textbook;

public class LessonClass {
    private String lessonName;
    private TextbookClass[] textbookClasses;

    public LessonClass(String lessonName,TextbookClass[] textbookClasses){
        this.lessonName = lessonName;
        this.textbookClasses = textbookClasses;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public TextbookClass[] getTextbookClasses() {
        return textbookClasses;
    }

    public void setTextbookClasses(TextbookClass[] textbookClasses) {
        this.textbookClasses = textbookClasses;
    }

    @Override
    public String toString(){
        String s = "";
        for(int i = 0;i < this.textbookClasses.length;i++){
            s += this.textbookClasses[i].toString ();
        }
        return s;
    }
}
