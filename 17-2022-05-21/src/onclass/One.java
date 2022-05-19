package onclass;

import java.sql.*;

/**
 * Description:一.使用 jdbc 的预编译对象(PreparedStatement)进行以下操作操作:
 * 1.使用预编译对象在表中插入记录
 * （“小明”，19，‘男’，1000）
 * （“小美”，16，‘女’，1000）
 * （“大胖”，19，‘男’，1000）
 * （“石头”，17，‘男，’1000）
 * 2.使用预编译对象删除 Student 表中 id 为 2 的信息
 * 3.使用预编译对象将"大胖"的名字修改为"壮壮"
 * 4.使用预编译对象查询 Student 表中 id 为 1 的记录
 * 5.使用预编译对象查询 Student 表中的所有记录
 * 6.使用预编译对象查询 Student 表中名字以"小"开头的记录
 * ClassName: One <br/>
 * date: 2022-05-21 上午 11:14:49 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class One {
    /**
     * @Description:
     * @Class: One
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/scott", "root", "root");
        String sql = "INSERT INTO Student VALUES(NULL,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "小洋人");
        preparedStatement.setInt(2, 16);
        preparedStatement.setString(3, "女");
        preparedStatement.setInt(4, 1000);

        if (preparedStatement.executeUpdate() > 0) System.out.println("添加成功");
        else System.out.println("添加成功");

        preparedStatement.setString(1, "大石头");
        preparedStatement.setInt(2, 17);
        preparedStatement.setString(3, "男");
        preparedStatement.setInt(4, 1000);

        if (preparedStatement.executeUpdate() > 0) System.out.println("添加成功");
        else System.out.println("添加成功");

        preparedStatement.close();
        connection.close();
    }
}