package connection;
import java.sql.*;

public abstract class AbstractConnection {

    public abstract String getDriver();
    public abstract String getUser();
    public abstract String getPassword();
    public abstract String getUrl();

    public Connection open(){
        Connection conn = null;
        try {
            Class.forName(getDriver());
            conn = DriverManager.getConnection(getUrl(),getUser(), getPassword());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return conn;
    }

    public void close(Connection conn){
        if (null != conn) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }

    public void close(Statement statement){
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void close(PreparedStatement preparedStatement){
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void close(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
