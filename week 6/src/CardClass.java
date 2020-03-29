package src;

/**
 * 
 * @author pisces
 *
 */
public class CardClass {

	// 定义一张牌的变量
    private int kind;
    private int value;
	
	public CardClass() {
		
    }
    // 定义带参数的构造函数
    public CardClass(int k, int v){
	    this.kind = k;
	    this.value = v;
    }
    
    // 设置变量、获取变量的函数

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        CardClass c = (CardClass) obj;
        if (kind == c.kind && value == c.value) {
            return true;
        }
        return false;
    }

    // 覆盖Object成员方法，显示根据牌的变量显示牌面
    @Override
    public String toString() {
        String str;
        int k = this.kind;
        int v = this.value;
        switch (k) {
            case 0:
                switch(v){
                    case 1:
                        str = "黑桃 A";
                        break;
                    case 11:
                        str = "黑桃 J";
                        break;
                    case 12:
                        str = "黑桃 Q";
                        break;
                    case 13:
                        str = "黑桃 K";
                        break;
                    default:
                        str = "黑桃 " + this.value;
                }
                break;
            case 1:
                switch(v){
                    case 1:
                        str = "红桃 A";
                        break;
                    case 11:
                        str = "红桃 J";
                        break;
                    case 12:
                        str = "红桃 Q";
                        break;
                    case 13:
                        str = "红桃 K";
                        break;
                    default:
                        str = "红桃 " + this.value;
                }
                break;
            case 2:
                switch(v){
                    case 1:
                        str = "方块 A";
                        break;
                    case 11:
                        str = "方块 J";
                        break;
                    case 12:
                        str = "方块 Q";
                        break;
                    case 13:
                        str = "方块 K";
                        break;
                    default:
                        str = "方块 " + this.value;
                }
                break;
            case 3:
                switch(v){
                    case 1:
                        str = "梅花 A";
                        break;
                    case 11:
                        str = "梅花 J";
                        break;
                    case 12:
                        str = "梅花 Q";
                        break;
                    case 13:
                        str = "梅花 K";
                        break;
                    default:
                        str = "梅花 " + this.value;
                }
                break;
            case 4:
                if(value == 0){
                    str = "大王 ";
                }else str = "小王";
                break;
            default:
                str = "";
        }
        return str;
    }
}
