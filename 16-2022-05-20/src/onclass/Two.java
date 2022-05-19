package onclass;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Description:2.使用 jdbc 修改 Student 表中一条或多条信息；
 * package: onclass <br/>
 * ClassName: Two <br/>
 * date: 2022-05-20 下午 12:00:23 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Two {
    /**
     * @Description:
     * @Class: Two
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {/**主程序*/
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/lessen1", "root", "root");
        Statement statement = connection.createStatement();
        String mysql = "UPDATE Student SET sName = '小樱' WHERE sID = 2";
        int ret = statement.executeUpdate(mysql);
        if (ret > 0) System.out.println("修改成功");
        else System.out.println("修改失败");
        statement.close();
        connection.close();
    }
}