package onclass;

import java.sql.*;

/**
 * Description: 2.使用预编译对象删除 Student 表中 id 为 2 的信息
 * 3.使用预编译对象将"大胖"的名字修改为"壮壮"
 * 4.使用预编译对象查询 Student 表中 id 为 1 的记录
 * 5.使用预编译对象查询 Student 表中的所有记录
 * 6.使用预编译对象查询 Student 表中名字以"小"开头的记录
 * ClassName: Two <br/>
 * date: 2022-05-21 上午 11:46:55 <br/>
 * author: 寜 <br/>
 */
public class Two {
    /**
     * Description:
     * Class: Two
     */
    static Connection connection = null;
    static PreparedStatement preparedStatement = null;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/scott", "root", "root");
        select("小");
        preparedStatement.close();
        connection.close();
    }

    private static void del(int id) throws SQLException {//删除
        preparedStatement = connection.prepareStatement("DELETE FROM Student WHERE id = ?");
        preparedStatement.setInt(1, id);
        if (preparedStatement.executeUpdate() > 0) System.out.println("删除成功");
        else System.out.println("删除失败");
    }

    private static void revise(String formerName, String afterName) throws SQLException {//修改
        preparedStatement = connection.prepareStatement("UPDATE Student SET NAME = ? WHERE NAME = ?");
        preparedStatement.setString(1, afterName);
        preparedStatement.setString(2, formerName);
        if (preparedStatement.executeUpdate() > 0) System.out.println("修改成功");
        else System.out.println("修改失败");
    }

    private static void select(int id) throws SQLException {//查询
        preparedStatement = connection.prepareStatement("SELECT * FROM Student WHERE id LIKE ?");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3) + "\t" + resultSet.getString(4) + "\t" + resultSet.getFloat(5));
        }
        resultSet.close();
    }

    private static void select() throws SQLException {//查询
        preparedStatement = connection.prepareStatement("SELECT * FROM Student");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3) + "\t" + resultSet.getString(4) + "\t" + resultSet.getFloat(5));
        }
        resultSet.close();
    }

    private static void select(String name) throws SQLException {//查询
        preparedStatement = connection.prepareStatement("SELECT * FROM Student WHERE name LIKE ?");
        preparedStatement.setString(1,name+"%");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3) + "\t" + resultSet.getString(4) + "\t" + resultSet.getFloat(5));
        }
        resultSet.close();
    }
}