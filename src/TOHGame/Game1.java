package TOHGame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game1  {


    int reftime =0;
    int millisec =0;
    int sec=0;
    int min=0;

    boolean started =false;
    String sec_str = String.format("%02d",sec);
    String min_str = String.format("%02d",min);
    String mill_str = String.format("%02d",millisec);
    JLabel timelabel = new JLabel();
    JFrame frame = new JFrame();



    JPanel panel = new JPanel();

//    JLabel label1 = n

    JButton lbnt = new JButton();
    JButton mbnt = new JButton();
    JButton sbnt = new JButton();
    JButton vsbnt = new JButton();
    JButton startgame = new JButton("START GAME");
    JButton restart = new JButton("Restart GAME");
    JButton push1 = new JButton("PUSH");
    JButton push2 = new JButton("PUSH");
    JButton push3 = new JButton("PUSH");
    JButton pop1 = new JButton("POP");
    JButton pop2 = new JButton("POP");
    JButton pop3 = new JButton("POP");


    Graph g = new Graph();

    Game1(){
        Border border = BorderFactory.createLineBorder(Color.green,3);



        timelabel.setText(min_str+":"+sec_str+":"+mill_str);
        timelabel.setBounds(200,500,250,125);
        timelabel.setFont(new Font("Verdana",Font.BOLD,35));
//        timelabel.setBorder(BorderFactory.createBevelBorder(1));
        timelabel.setOpaque(true);
        timelabel.setHorizontalAlignment(JTextField.CENTER);


        lbnt.setBounds(140,300,100,50);
        mbnt.setBounds(150,250,80,50);
        sbnt.setBounds(160,200,60,50);

        lbnt.setEnabled(false);
        mbnt.setEnabled(false);
        sbnt.setEnabled(false);
        vsbnt.setEnabled(false);

        lbnt.setVisible(false);
        mbnt.setVisible(false);
        sbnt.setVisible(false);
        vsbnt.setVisible(false);


        lbnt.setBackground(Color.red);
        lbnt.setOpaque(true);
        mbnt.setBackground(Color.blue);
        mbnt.setOpaque(true);
        sbnt.setBackground(Color.green);
        sbnt.setOpaque(true);
        vsbnt.setBackground(Color.yellow);
        vsbnt.setOpaque(true);

        push1.setBounds(140,400,100,50);

        pop1.setBounds(140,450,100,50);


        push2.setBounds(280,400,100,50);


        pop2.setBounds(280,450,100,50);

        push3.setBounds(420,400,100,50);


        pop3.setBounds(420,450,100,50);

        startgame.setBounds(500,500,100,100);
        restart.setBounds(60,500,100,100);

        push1.setEnabled(false);
        push2.setEnabled(false);
        push3.setEnabled(false);

        panel.setBounds(125,0,600,600);
//        panel.setBackground(Color.gray);
//        panel.setLayout(new FlowLayout());
        frame.add(timelabel);
        frame.add(push1);
        frame.add(pop1);
        frame.add(pop2);
        frame.add(pop3);
        frame.add(push2);
        frame.add(push3);
        frame.add(startgame);frame.add(restart);
        frame.add(lbnt);
        frame.add(mbnt);
        frame.add(sbnt);
        frame.add(vsbnt);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,1000);
        frame.setLayout(new BorderLayout());
        panel.add(g);
        frame.add(panel);
        frame.setVisible(true);
    }



}
