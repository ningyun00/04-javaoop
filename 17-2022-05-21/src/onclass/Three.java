package onclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Description:二.使用 jdbc 的批处理进行以下操作
 * 7.使用批处理，添加 100 条数据
 * 8.使用批处理，删除 100 条记
 * ClassName: Three <br/>
 * date: 2022-05-21 下午 02:00:17 <br/>
 * author: 寜 <br/>
 */
public class Three {
    static Connection connection = null;
    static PreparedStatement preparedStatement = null;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/scott", "root", "root");
//        addHundred(100);
        delHundred(100);
        preparedStatement.close();
        connection.close();
    }

    public static void addHundred(int number) throws SQLException {
        preparedStatement = connection.prepareStatement("INSERT INTO Student VALUES(NULL,?,?,?,?)");
        for (int i = 1; i <= number; i++) {
            preparedStatement.setString(1, "张三" + i);
            preparedStatement.setInt(2, 100);
            preparedStatement.setString(3, "男");
            preparedStatement.setFloat(4, 100 + i);
            if (preparedStatement.executeUpdate() > 0) System.out.println("添加成功");
            else System.out.println("添加失败");
        }
    }
    public static void delHundred(int number) throws SQLException {
        preparedStatement = connection.prepareStatement("DELETE FROM Student WHERE id = ?");
        for (int i = 1; i <= number; i++) {
            preparedStatement.setInt(1, i);
            if (preparedStatement.executeUpdate() > 0) System.out.println("删除成功");
            else System.out.println("删除失败");
        }
    }
}