package TOHGame;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    Connection c;
    public Connection CDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user ="root";
            String pass = "Rohan@21mysqll";
            String url="jdbc:mysql://localhost:3306/TOHscore";

            c= DriverManager.getConnection(url,user,pass);
        }catch (Exception e){
            e.printStackTrace();
        }
      return c;
    }
}
