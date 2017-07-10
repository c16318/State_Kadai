
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author matsu
 */

/**
 *
 * @author c16318
 */
public class GachaFrame extends Frame implements ActionListener,Context{
    private TextField textClock = new TextField(60);
    private TextArea textScreen = new TextArea(10,60);
    private Button buttonCoin = new Button("100円投入");
    private Button buttonDrow = new Button("回す");
    private Button buttonExit = new Button("終了");

    private State state = NoCoinState.getInstance();
    
    public GachaFrame(String title){
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        //textClock配置 
        add(textClock,BorderLayout.NORTH);
        textClock.setEditable(false);
        //textScreen
        add(textScreen,BorderLayout.CENTER);
        textScreen.setEditable(false);
        //パネルにボタンを格納
        Panel panel = new Panel();
        panel.add(buttonCoin);
        panel.add(buttonDrow);
        panel.add(buttonExit);
        //パネルを配置
        add(panel,BorderLayout.SOUTH);
        //表示
        pack();
        this.setVisible(true);
        //リスナーの設定
        buttonCoin.addActionListener(this);
        buttonDrow.addActionListener(this);
        buttonExit.addActionListener(this);
    }
    
    //ボタンが押されたらここへくる
    public void actionPerformed(ActionEvent e){
        System.out.println(e.toString());
        if(e.getSource() == buttonCoin){
            state.doPutCoin(this);
        }
        else if(e.getSource() == buttonDrow){
            state.doDrowGacha(this);
        }
        else if(e.getSource() == buttonExit){
            System.exit(0);
        }
        else{
            System.out.println("?");
        }
    }

    
    //状態変化
    public void changeState(State state){
        System.out.println(this.state + "から" + state + "へ状態が変化しました。");
        this.state = state;
    }
    
    //メッセージ
    public void massage(String msg){
        textScreen.append(msg + "\n");
    }

}


