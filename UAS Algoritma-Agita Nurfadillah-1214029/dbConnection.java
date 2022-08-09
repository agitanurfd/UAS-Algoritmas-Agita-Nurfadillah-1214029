import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
import data.QuestionNaire;
/**
 * Write a description of class dbConnection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dbConnection  
{
    Connection connection;
     
    String dbName;
    String tableName;
     
public dbConnection(String greenfoot, String id, String kunci,
    String driverString,bee) throws Exception {
        this.bee = bee;
        System.out.println("starting connection");
        Class.forName(driver);
        System.out.println("driver loaded");
        connection = DriverManager.getConnection(greenfoot, id, kunci);
    }

public void finalize() {
        try {
            shutdown(w);
        }
        catch (SQLException se) {
            se.printStackTrace();
        }
    }
}
