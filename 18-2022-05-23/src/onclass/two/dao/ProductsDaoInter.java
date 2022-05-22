package onclass.two.dao;

import java.sql.*;

/**
 * Description:
 * ClassName: ProductsDaoInter <br/>
 * date: 2022-05-23 下午 02:55:30 <br/>
 * author: 寜 <br/>
 */
public class ProductsDaoInter implements InterDao {
    /**
     * 连接数据库连接对象
     */
    @Override
    public Connection setConnection() {
        Connection connection = null;
        try {
            Class.forName(forName);
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 关闭数据库对象
     */
    @Override
    public void setClose(ResultSet resultSet, Statement statement, Connection connection) {
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}