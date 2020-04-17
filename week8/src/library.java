public class library {
    private String itemName;
    private String itemNo;

    library(String name, String no){
        this.itemName = name;
        this.itemNo = no;
    }

    String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    @Override
    public String toString(){
        return this.getClass ().getSimpleName () + " "+ this.getItemName () +" "+ this.getItemNo ();
    }
}
