package merchandisemanagement.dao;

import java.sql.*;

public class DatabaseDao {
    static Connection connection = null;
    static String forName = "com.mysql.cj.jdbc.Driver";
    static String database = "community";
    static String url = "jdbc:mysql://127.0.0.1:3306/" + database;
    static String user = "root";
    static String password = "root";

    public DatabaseDao() {
    }

    public static Connection connect() {
        try {
            Class.forName(forName);
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println("连接处错误");
            e.printStackTrace();
        }
        return connection;
    }

    public static void close(ResultSet resultSet, Statement statement, Connection connection) {
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (Exception e) {
            System.out.println("关闭错误");
            e.printStackTrace();
        }
    }
}
