package TOHGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class node{
    int top;
    int size;
    int arr[];
    node(int siz){
        this.top=-1;
        this.size=siz;
        this.arr=new int[siz];
    }

}
class Soper extends Game1 implements ActionListener{
ScoreManager sm;
String nam;
    Timer timer = new Timer(10, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            reftime= reftime+10;
            millisec =reftime%1000;
            sec=(reftime/1000)%60;
            min = (reftime/60000)%60;
            sec_str = String.format("%02d",sec);
            min_str = String.format("%02d",min);
            mill_str = String.format("%02d",millisec);

            timelabel.setText(min_str+":"+sec_str+":"+mill_str);
        }
    });



    Soper() {
        node obj = new node(3);
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

    int pop(node t, int tnum) {
        int val=-1;
        if (t.top == -1) {
            switch (tnum) {
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
        else {
            val = t.arr[t.top];
            t.top--;
//            if (t.top == -1) {
//                switch (tnum) {
//                    case 1:
//                        pop1.setEnabled(false);
//                        break;
//                    case 2:
//                        pop2.setEnabled(false);
//                        break;
//                    case 3:
//                        pop3.setEnabled(false);
//                        break;
//
//                }
//
//            }
//            switch (tnum) {
//                case 1:
//                    push1.setEnabled(true);
//                    break;
//                case 2:
//                    push2.setEnabled(true);
//                    break;
//                case 3:
//                    push3.setEnabled(true);
//                    break;
//
//            }

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

        push1.setEnabled(true);
        push2.setEnabled(true);
        push3.setEnabled(true);
        return val;
    }


    void push(int val, node t, int tnum) {

        if (t.top == t.size - 1) {
            //do oper
            switch (tnum) {
                case 1:
                    push1.setEnabled(false);
                    break;
                case 2:
                    push2.setEnabled(false);
                    break;
                case 3:
                    push3.setEnabled(false);
                    break;
            }
        }
        else {
            t.top++;
            t.arr[t.top] = val;
            if (t.top == t.size - 1) {
                //do oper
                switch (tnum) {
                    case 1:
                        push1.setEnabled(false);
                        break;
                    case 2:
                        push2.setEnabled(false);
                        break;
                    case 3:
                        push3.setEnabled(false);
                        break;
                }
            }
            switch (tnum) {
                case 1:
                    pop1.setEnabled(true);
                    break;
                case 2:
                    pop2.setEnabled(true);
                    break;
                case 3:
                    pop3.setEnabled(true);
                    break;

            }

        }
        push1.setEnabled(false);
        push2.setEnabled(false);
        push3.setEnabled(false);
    }
    node t1 = new node(3);
    node t2 = new node(3);
    node t3 = new node(3);
    int val;
    public void actionPerformed(ActionEvent e) {
        //Winner Winner Chicken Dinner




        if (e.getSource() == startgame) {

            if(started==false){
                started=true;

                timer.start();
            }


            this.push(3, t1, 1);
            this.push(2, t1, 1);
            this.push(1, t1, 1);
//            push2.setEnabled(false);
//            push3.setEnabled(false);
//            System.out.println(t1.top);
            lbnt.setBounds(140,300,100,50);
            mbnt.setBounds(150,250,80,50);
            sbnt.setBounds(160,200,60,50);
            lbnt.setVisible(true);
            mbnt.setVisible(true);
            sbnt.setVisible(true);
//            push1.setEnabled(true);
//            push2.setEnabled(true);
//            push3.setEnabled(true);
            startgame.setEnabled(false);


        }

//         ######## POP1 ########
        if (e.getSource() == pop1) {
            val = pop(t1,1);
            System.out.println(val);
//            if(t2.top!=-1){
//
//            if(val>t2.arr[t2.top]){
//                push2.setEnabled(false);
//            }
//            }
//            if(t3.top!=-1){
//
//            if(val>t3.arr[t3.top]){
//                push3.setEnabled(false);
//            }
//            }
        }

//        ########### PUSH1 ############
        if(e.getSource()==push1){


            int newtop = t1.top;
            if(t1.top==-1){
                push(val,t1,1);
            }
            else if(t1.arr[t1.top]>val) {

                push(val, t1, 1);
            }
            else{
                System.out.println("Wrong PUSH");
                JOptionPane.showMessageDialog(null,"Wrong PUSH","Invalid Move",JOptionPane.WARNING_MESSAGE);
                return;
            }
//got down here
            if(t3.top!=-1){
                pop3.setEnabled(true);
            }
            if(t2.top!=-1){
                pop2.setEnabled(true);
            }

            if(newtop==-1){
                if(val==1){
                    sbnt.setBounds(140,300,60,50);
                }
                else if(val==2){
                    mbnt.setBounds(140,300,80,50);
                }
                else if(val==3){

                    lbnt.setBounds(140,300,100,50);
                }
            }
            if(newtop==0){
                if(val==1){
                    sbnt.setBounds(150,250,60,50);
                }
                else if(val==2){
                    mbnt.setBounds(150,250,80,50);
                }
                else if(val==3){

                    lbnt.setBounds(150,250,100,50);
                }
            }  if(newtop==1){
                if(val==1){
                    sbnt.setBounds(160,200,60,50);
                }
                else if(val==2){
                    mbnt.setBounds(160,200,80,50);
                }
                else if(val==3){

                    lbnt.setBounds(160,200,100,50);
                }
            }


        }

//   ########## POP 2 ###########
        if (e.getSource() == pop2) {
            val = pop(t2,2);
            System.out.println(val);
//            if(t1.top!=-1){
//                if(val>t1.arr[t1.top]){
//                    push1.setEnabled(false);
//                }
//            }
//         if(t3.top!=-1){
//             System.out.println(t3.arr[t3.top]);
//             if(val>t3.arr[t3.top]){
//                 push3.setEnabled(false);
//             }
//         }

        }
//########## PUSH2 PRESS #############
        if(e.getSource()==push2){

            int newtop = t2.top;

            if(t2.top==-1){

                push(val,t2,2);
            }
            else if(t2.arr[t2.top]>val) {

                push(val, t2, 2);
            }
            else{
                System.out.println("Wrong PUSH");
                JOptionPane.showMessageDialog(null, "Wrong PUSH", "Invalid Move", JOptionPane.WARNING_MESSAGE);
                return;
            }
//get down here
            if(t1.top!=-1){
                pop1.setEnabled(true);
            }
            if(t3.top!=-1){
                pop3.setEnabled(true);
            }

            if(newtop==-1){
                if(val==1){
                    sbnt.setBounds(280,300,60,50);
                }
                else if(val==2){
                    mbnt.setBounds(280,300,80,50);
                }
                else if(val==3){

                    lbnt.setBounds(280,300,100,50);
                }
            }
            if(newtop==0){
                if(val==1){
                    sbnt.setBounds(290,250,60,50);
                }
                else if(val==2){
                    mbnt.setBounds(290,250,80,50);
                }
                else if(val==3){

                    lbnt.setBounds(290,250,100,50);
                }
            }  if(newtop==1){
                if(val==1){
                    sbnt.setBounds(300,200,60,50);
                }
                else if(val==2){
                    mbnt.setBounds(300,200,80,50);
                }
                else if(val==3){

                    lbnt.setBounds(300,200,100,50);
                }
            }



        }


        //################ POP 3 PRESS ##################
        if (e.getSource() == pop3) {
            val = pop(t3,3);
            System.out.println(val);
//if(t1.top!=-1){
//
//    if(val>t1.arr[t1.top]){
//        push1.setEnabled(false);
//    }
//}
//if(t2.top!=-1){
//    if(val>t2.arr[t2.top]){
//        push2.setEnabled(false);
//    }
//}

        }

        //############## PUSH3 PRESS ###################

        if(e.getSource()==push3){

            int newtop=t3.top;
            if(t3.top==-1){

                push(val,t3,3);
            }
            else if(t3.arr[t3.top]>val  ){
                push(val,t3,3);
            }
            else{
                System.out.println("Wrong PUSH");
                JOptionPane.showMessageDialog(null,"Wrong PUSH","Invalid Move",JOptionPane.WARNING_MESSAGE);
                return;
            }
//get down here
            if(t1.top!=-1){
                pop1.setEnabled(true);
            }
            if(t2.top!=-1){
                pop2.setEnabled(true);
            }

            if(newtop==-1){
                if(val==1){
                    sbnt.setBounds(420,300,60,50);
                }
                else if(val==2){
                    mbnt.setBounds(420,300,80,50);
                }
                else if(val==3){

                    lbnt.setBounds(420,300,100,50);
                }
            }
            if(newtop==0){
                if(val==1){
                    sbnt.setBounds(430,250,60,50);
                }
                else if(val==2){
                    mbnt.setBounds(430,250,80,50);
                }
                else if(val==3){

                    lbnt.setBounds(430,250,100,50);
                }
            }  if(newtop==1){
                if(val==1){
                    sbnt.setBounds(440,200,60,50);
                }
                else if(val==2){
                    mbnt.setBounds(440,200,80,50);
                }
                else if(val==3){

                    lbnt.setBounds(440,200,100,50);
                }
            }



        }

//    if(e.getSource()==restart){
//        this.pop(t1,1);
//        this.pop(t1,1);
//        this.pop(t1,1);
//        this.pop(t2,2);
//        this.pop(t2,2);
//        this.pop(t2,2);
//        this.pop(t3,3);
//        this.pop(t3,3);
//        this.pop(t3,3);
//
//        this.push(3, t1, 1);
//        this.push(2, t1, 1);
//        this.push(1, t1, 1);
//
//
//    }
    if(e.getSource()==push3){
        System.out.println("The top is"+t3.top);
        if(t3.top==2){
            if(started==true){
                timer.stop();
            }
            sm = new ScoreManager(nam,reftime);
            ScoreStorer.insertScore(sm);
            JOptionPane.showMessageDialog(null, "WINNER WINNER CHICKEN DINNER", "WINNER MESSAGE", JOptionPane.PLAIN_MESSAGE);
            pop3.setEnabled(false);

        }

    }

    }


}






class gamedone extends Soper {
    gamedone(String name) {

        System.out.println("Game is running");
//        System.out.println(name);
        nam = name;
    }

}


