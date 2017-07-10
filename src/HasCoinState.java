//お金投入
/**
 *
 * @author c16318
 */
public class HasCoinState implements State{
    //商品数
    private  static int item = 5;
    
    private static HasCoinState singleton = new HasCoinState();
    
    HasCoinState(){
        
    }
    
    public static State getInstance(){
        return singleton;
    }
    //お金を入れる
    public void doPutCoin(Context context){
        context.massage("すでに入っています。");
    }
    //ガチャを回す
    public void doDrowGacha(Context context){
        context.massage("ガチャを回しました。商品口へ");
        //商品を減らす
        item--;
         //商品が0だったらSoldOutState　へ
        if(item == 0){
            context.changeState(SoldOutState.getInstance());
        }
        //NoCoinState　へ
        else{
            context.changeState(NoCoinState.getInstance());
        }
    }
    
    public String toString(){
        return "[お金投入済み]";
    }

}
