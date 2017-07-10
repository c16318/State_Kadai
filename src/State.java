
/**
 *
 * @author matsu
 */
public interface  State {
    //お金を入れる
    public abstract void doPutCoin(Context context);
    
    //ガチャを回す
    public abstract void doDrowGacha(Context context);

}
