package TOHGame;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScoreBoard {
    int i=0;
    int ranking[]=new int[100];
    String name[]= new String[100];
    float timetaken[]= new float[100];
    Connection c;
  ScoreBoard(){
      try{
          DBConnection obj = new DBConnection();
          c = obj.CDB();

          String q ="select name,timetaken, ROW_NUMBER() over(order by timetaken) ranking from scoreboard;";

          Statement stm = c.createStatement();

          ResultSet set = stm.executeQuery(q);

          while(set.next()){
        name[i] =set.getString(1);
        timetaken[i] = set.getFloat(2);
        ranking[i] = set.getInt(3);

        i++;
          }
      }
 catch (Exception e){
          e.printStackTrace();
 }

  }
}
