package onclass.one.dao;

import java.sql.*;

/**
 * Description:
 * ClassName: Dao <br/>
 * date: 2022-05-23 上午 11:53:22 <br/>
 * author: 寜 <br/>
 */
public class BaseDao {
    /**
     * 连接
     */
    public static Connection connect() {
        Connection connection = null;
        try {//异常块
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/commodity", "root", "root");
        } catch (ClassNotFoundException | SQLException exception) {//异常类型 捕获异常
            exception.printStackTrace();
        }
        return connection;
    }

    /**
     * 关闭连接
     */
    public static void close(ResultSet resultSet, Statement statement, Connection connection) {
        try {//异常块
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (SQLException exception) {//异常类型 捕获异常
            exception.printStackTrace();
        }
    }
}