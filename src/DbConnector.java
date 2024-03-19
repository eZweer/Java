import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {
    private static String url = "jdbc:mysql://127.0.0.1:3306/crm?useJDBCCompliantTimezoneShift=True&useLegacyDatetimeCode=false";
    private static String user = "root";
    private static String pw = "";
    private static Connection con;
    public DbConnector(){

    }

    public DbConnector(String url, String user, String pw){
        this.url = url;
        this.user = user;
        this.pw = pw;
    }

    private static void connect() {
        try {
            con = DriverManager.getConnection(url, user, pw);
       
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    private static closeConnecion()
    {

    }
}

