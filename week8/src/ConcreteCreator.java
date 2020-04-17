public class ConcreteCreator extends Creator {
    public library factoryMethod(String kind, String name, String no){
        switch(kind){
            case "书籍" :
                return new book(name, no);

            case "期刊" :
                return new magazine (name, no);

            case "报纸" :
                return new newspaper(name, no);

            default:
                return null;
        }
    }
}
