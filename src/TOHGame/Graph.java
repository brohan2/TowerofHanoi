package TOHGame;

import javax.swing.*;
import java.awt.*;

public class Graph extends JPanel {
    Graph(){
        this.setPreferredSize(new Dimension(750,1000));
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.cyan);

//       g2d.drawRect(50,345,650,30);
        g2d.fillRect(50, 345, 550, 30);

//        g2d.drawRect(178,20,15,325);
        g2d.fillRect(183,95,15,250);
        g2d.fillRect(308,95,15,250);
        g2d.fillRect(447,95,15,250);
    }
}
