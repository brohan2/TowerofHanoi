package TOHGame;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BlocksSelector implements ChangeListener,ActionListener{
String name1;
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    JTextField field = new JTextField();
JButton btn = new JButton("Start it man");
    BlocksSelector(){
        frame = new JFrame("Slider Demo");

        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(3,6,3);

        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(1);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(1);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli",Font.PLAIN,15));
btn.setBounds(250,250,100,50);
        btn.addActionListener(this);

        slider.addChangeListener(this);
        label.setBounds(250,150,100,25);
        label.setText("Enter Name");
        field.setBounds(250,200,150,50);
        field.setBackground(Color.black);
        field.setCaretColor(Color.GREEN);
        field.setForeground(Color.blue);
        field.setFont(new Font("Consolas",Font.BOLD,30));


        panel.add(slider);
        frame.add(field);
        frame.add(btn);
        frame.add(panel);


//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
        frame.setVisible(true);
    }


    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource()==slider)
            System.out.println(slider.getValue());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            if(slider.getValue()==3){
                name1 = field.getText();
                new gamedone(name1);
            }
        }
    }
}
