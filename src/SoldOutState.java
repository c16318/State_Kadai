/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16318
 */
public class SoldOutState implements State{
    private static SoldOutState singleton = new SoldOutState();
    
    SoldOutState(){
        
    }
    
    public static State getInstance(){
        return singleton;
    }
    public void doPutCoin(Context context){
        context.massage("売り切れです。お金返却。");
    }
    public void doDrowGacha(Context context){
        context.massage("売り切れです。");
    }
    
    public String toString(){
        return "[売り切れ]";
    }
}
