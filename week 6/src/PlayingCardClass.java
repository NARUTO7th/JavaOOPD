package src;

import javax.smartcardio.Card;

/**
 * 
 * @author pisces
 *
 */
public class PlayingCardClass {

	// 定义54张牌

    private CardClass[] pCard = new CardClass[54];

	// 给54张牌赋值
    //先按黑桃，红桃，方块，梅花，再按点数构成嵌套循环为数组中每个CardClass实例，最后添加小王，大王。
    public PlayingCardClass() {
        int index = 0;
        for(int i = 0;i < 4;i++){
            for(int j = 1;j < 14;j++){
                this.pCard[index] = new CardClass (i,j);
                index++;
            }
        }
        this.pCard[52] = new CardClass (4,0);
        this.pCard[53] = new CardClass (4,1);
        /*for(int i = 0;i < 54;i++){
            System.out.println (this.pCard[i]);
        }*/
    }

    // 取牌
    public CardClass getAt(int index) {
        return this.pCard[index];
    }

    // 洗牌 （用Math.random()函数
    //利用random()函数，取0-53之间的整数，当取到整数与当前for循环得到的index不相同，就对该整数对应
    //标的元素与index对应下标的元素调换，来打乱整套牌。
    public void shuffle() {
        int ran;
        CardClass cc;
        for(int i = 0;i < 54;i++){
            ran = (int) (Math.random () * 53);
            if(ran != i){
                cc = this.pCard[ran];
                this.pCard[ran] = this.pCard[i];
                this.pCard[i] = cc;
            }
        }
    }

    // 覆盖Object成员方法，显示54张牌
    @Override
    public String toString() {
        StringBuffer re = new StringBuffer ();
        //String re = "";
        for(int i = 0;i < 54;i++){
            re.append (this.pCard[i].toString () + "\n");
            //re.concat (this.pCard[i].toString () + "\n");
        }
        return re.toString ();
    }
}
