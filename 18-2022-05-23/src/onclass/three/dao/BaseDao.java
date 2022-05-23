package onclass.three.dao;

import java.sql.*;

/**
 * Description:
 * ClassName: BaseDao <br/>
 * date: 2022-05-24 上午 12:09:19 <br/>
 * author: 寜 <br/>
 */
public class BaseDao {
    static Connection connection = null;
    static String forName = "com.mysql.cj.jdbc.Driver";
    static String url = "jdbc:mysql://127.0.0.1:3306/commodity";
    static String user = "root";
    static String password = "root";

    /**
     * 连接
     */
    public static Connection connect() {
        try {//异常块
            Class.forName(forName);
            connection = DriverManager.getConnection(url, user, password);
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