package TOHGame;

import javax.swing.*;
import java.awt.*;

public class ScoreBoardViewer extends ScoreBoard{

    String column[]={"Ranking ","Name","TIME"};
    String data[][]= new String[100][100];

ScoreBoardViewer(){




for(int j=0;j<i;j++){
String r=String.valueOf(ranking[j]);
        data[j][0]=r;
}
for(int j=0;j<i;j++){
    data[j][1]=name[j];
}
for(int j=0;j<i;j++){
String t = String.valueOf(timetaken[j]);
    data[j][2]=t;
}

for(int j=0;j<4;j++){
    for(int k=0;k<4;k++){
        System.out.println(data[j][k]);
    }
}

}
}
