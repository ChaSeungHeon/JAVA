package final_Project;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnectMovie{
    private static final String URL = "jdbc:mysql://localhost/sillamovieDB?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
