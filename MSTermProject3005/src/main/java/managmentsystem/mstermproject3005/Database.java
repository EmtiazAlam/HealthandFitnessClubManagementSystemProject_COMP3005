package managmentsystem.mstermproject3005;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    public static Connection connectDb(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ManagementSystemProject", "postgres", "postgres");
            return connect;
        } catch (Exception e){e.printStackTrace();}
        return null;
    }
}