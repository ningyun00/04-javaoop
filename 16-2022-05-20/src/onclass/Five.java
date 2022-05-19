package onclass;

import java.sql.*;
import java.util.Scanner;

/**
 * Description:5.使用 Scanner 接收用户输入的 id,根据 id 查询出数据，并且打印
 * package: onclass <br/>
 * ClassName: Five <br/>
 * date: 2022-05-20 下午 12:30:04 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Five {
    /**
     * @Description:
     * @Class: Five
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {/**主程序*/
        Scanner scanner = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/lessen1", "root", "root");
        Statement connectionStatement = connection.createStatement();
        System.out.println("请输入ID:");
        String mysql = "SELECT * FROM `Student` WHERE sID = " + scanner.next();
        ResultSet resultSet = connectionStatement.executeQuery(mysql);
        while (resultSet.next()) {
            int ID = resultSet.getInt(1);
            String name = resultSet.getString(2);
            int age = resultSet.getInt(3);
            String sex = resultSet.getString(4);
            System.out.println(ID + "\t" + name + "\t" + age + "\t" + sex);
        }
    }
}