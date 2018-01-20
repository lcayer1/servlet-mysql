package connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by user on 30.10.2016.
 */
public abstract class DbConnector {

    public static Connection getDbConnection() {
        Connection connection = null;
        String url = "jdbc:mysql://mysql:3306/lalala";
        String pass = "root";
        String user = "root";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
