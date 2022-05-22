package onclass.two.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Description:
 * ClassName: InterDao <br/>
 * date: 2022-05-23 下午 02:47:42 <br/>
 * author: 寜 <br/>
 */
public interface InterDao {
    String forName = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://127.0.0.1:3306/commodity";
    String user = "root";
    String password = "root";

    Connection setConnection();

    void setClose(ResultSet resultSet, Statement statement, Connection connection);
}
