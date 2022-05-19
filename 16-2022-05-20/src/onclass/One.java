package onclass;

import java.sql.*;

/**
 * Description:在 MySql 中新建 lessen1 数据库，库中新建 Student 表,有编号、姓名、年龄、姓别三个字
 * 段，输入一定得信息
 * 1.使用 jdbc 在表中插入一条记录（“小红”，12，‘女’）
 * 2.使用 jdbc 修改 Student 表中一条或多条信息；
 * 3.使用 jdbc 删除 Student 表中女学生的信息，
 * 4. 使用 jdbc 查询 Student 表中的所有记录
 * 5.使用 Scanner 接收用户输入的 id,根据 id 查询出数据，并且打印
 * package: onclass <br/>
 * ClassName: One <br/>
 * date: 2022-05-20 上午 09:57:26 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class One {
    /**
     * @Description:
     * @Class: One
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {/**主程序*/
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/lessen1", "root", "root");
        Statement statement = connection.createStatement();
        String mysql = "INSERT INTO Student VALUES(NULL,'小红',12,'女')";
        int executeUpdate = statement.executeUpdate(mysql);
        if (executeUpdate > 0)
            System.out.println("添加成功");
        else
            System.out.println("添加失败");
        statement.close();
        connection.close();
    }
}