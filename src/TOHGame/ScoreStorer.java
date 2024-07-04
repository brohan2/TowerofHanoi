package TOHGame;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ScoreStorer {

    public static void insertScore(ScoreManager sc){
        try{
            Connection c;
           DBConnection obj = new DBConnection();
            c= obj.CDB();

           String query = "insert into scoreboard (name,timetaken) values(?,?)";

            PreparedStatement pt = c.prepareStatement(query);

            pt.setString(1,sc.getName());
            pt.setFloat(2,sc.getTimer());

            pt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
