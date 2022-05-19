package onclass;

import java.sql.*;

/**
 * Description:4. 使用 jdbc 查询 Student 表中的所有记录
 * package: onclass <br/>
 * ClassName: Four <br/>
 * date: 2022-05-20 下午 12:20:06 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Four {
    /**
     * @Description:
     * @Class: Four
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {/**主程序*/
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/lessen1", "root", "root");
        Statement statement = connection.createStatement();
        String mysql = "SELECT * FROM Student";
        ResultSet resultSet = statement.executeQuery(mysql);
        while (resultSet.next()) {
            int ID = resultSet.getInt(1);
            String name = resultSet.getString(2);
            int age = resultSet.getInt(3);
            String sex = resultSet.getString(4);
            System.out.println(ID+"\t"+name+"\t"+age+"\t"+sex);
        }
        connection.close();
        statement.close();
    }
}