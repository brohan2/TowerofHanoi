package TOHGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class node2{
    int top;
    int size;
    int arr[];
    node2(int siz){
        this.top=-1;
        this.size=siz;
        this.arr=new int[siz];
    }

}

public class Soper2 extends Game1 implements ActionListener {
    JButton vsbtn = new JButton();

    Soper2(){

        node2 obj =new node2(4);
        if (obj.top == -1) {
            pop1.setEnabled(false);
            pop2.setEnabled(false);
            pop3.setEnabled(false);
        }
        pop1.addActionListener(this);
        pop2.addActionListener(this);
        pop3.addActionListener(this);
        push1.addActionListener(this);
        push2.addActionListener(this);
        push3.addActionListener(this);
        startgame.addActionListener(this);
        restart.addActionListener(this);
    }

    int pop(node2 t,int tnum){
        int val = 0;
        if(t.top==-1){
            switch (tnum){
                case 1:
                    pop1.setEnabled(false);
                    break;
                case 2:
                    pop2.setEnabled(false);
                    break;
                case 3:
                    pop3.setEnabled(false);
                    break;
            }
        }
        else{
            val = t.arr[t.top];
            t.top--;
        }
        pop1.setEnabled(false);
        pop2.setEnabled(false);
        pop3.setEnabled(false);

        if(val==1){
            sbnt.setBounds(50,100,60,50);
        }
        if(val==2){

            mbnt.setBounds(50,150,80,50);
        }
        if(val==3){
            lbnt.setBounds(50,200,100,50);
        }
        if(val==4){
            vsbtn.setBounds(50,50,40,20);
        }
        push1.setEnabled(true);
        push2.setEnabled(true);
        push3.setEnabled(true);
        return val;
    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
