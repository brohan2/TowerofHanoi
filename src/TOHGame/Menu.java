package TOHGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
        JButton play = new JButton("PLAY");
        JButton score = new JButton("Score Board");
        JButton Credits = new JButton("Credits");
    Menu(){
        play.setBounds(250,100,200,50);
        score.setBounds(250,250,200,50);
        Credits.setBounds(250,400,200,50);
        play.addActionListener(this);
        score.addActionListener(this);
        Credits.addActionListener(this);


        this.add(play);
        this.add(score);
        this.add(Credits);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750,1000);
        this.setLayout(null);





        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==play){
            new BlocksSelector();
        }
        if(e.getSource()==score){
        new ScoreBoardActualViewer();
        }
    }
}
