package onclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Description:3.使用 jdbc 删除 Student 表中女学生的信息，
 * package: onclass <br/>
 * ClassName: Three <br/>
 * date: 2022-05-20 下午 12:09:03 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Three {
    /**
     * @Description:
     * @Class: Three
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {/**主程序*/
        Class.forName("com.mysql.cj.jdbc.Driver");
        Statement statement = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/lessen1", "root", "root").createStatement();
        if (statement.executeUpdate("DELETE FROM Student WHERE sSex = '女'") > 0) System.out.println("删除成功");
        else System.out.println("删除失败");
        statement.close();
    }
}