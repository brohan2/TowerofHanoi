package TOHGame;
import javax.swing.*;

public class ScoreBoardActualViewer extends ScoreBoardViewer{
    ScoreBoardActualViewer() {
        JFrame f;

        f = new JFrame();

        JTable jt = new JTable(data, column);
        jt.setBounds(0, 0, 700, 1000);
        jt.setEnabled(false);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(750, 1000);
        f.setVisible(true);

    }
}