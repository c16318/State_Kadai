/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16318
 */
public class NoCoinState implements State{
        private static NoCoinState singleton = new NoCoinState();
    
    NoCoinState(){
        
    }
    
    public static State getInstance(){
        return singleton;
    }
    public void doPutCoin(Context context){
        context.massage("お金が投入されました。");
        
        //HasCoinState へ
        context.changeState(HasCoinState.getInstance());
    }
    public void doDrowGacha(Context context){
        context.massage("お金を入れてください。");
    }
    
    public String toString(){
        return "[お金投入待ち]";
    }
}
