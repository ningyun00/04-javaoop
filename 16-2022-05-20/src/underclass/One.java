package underclass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

/**
 * Description:新建表 User,有编号，姓名，密码，money 四个字段，输入一定得信息
 * 1.JDBC 实现增，删 byid ，改，查
 * 2、写一个程序，将所有用户信息全部查出，并将这些数据全部写入到 e:/users.txt 文件中
 * 去。要求格式如下：
 * 1 小李 456 558.0
 * 2 小红 789 11300.
 * package: underclass <br/>
 * ClassName: One <br/>
 * date: 2022-05-20 下午 01:40:40 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class One {
    /**
     * @Description:
     * @Class: One
     */
    static Connection connection = null;
    static Statement statement = null;

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {/**主程序*/
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/lessen1", "root", "root");
        statement = connection.createStatement();
        //1.
//        System.out.println(add("INSERT INTO USER VALUES(NULL,'寜','1008611',200)"));//增
//        System.out.println(del("DELETE FROM USER WHERE uID = 2"));//删
//        System.out.println(update("UPDATE USER SET uName = '小寜' WHERE uID = 1"));//改

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("a.txt"));
        select("SELECT * FROM USER",bufferedWriter);//查
        //2.
        statement.close();
        connection.close();
    }

    public static String add(String string) throws SQLException {
        if (statement.executeUpdate(string) > 0)
            return "添加成功";
        else
            return "添加失败";
    }

    public static String del(String string) throws SQLException {
        if (statement.executeUpdate(string) > 0)
            return "删除成功";
        else
            return "删除失败";
    }

    public static String update(String string) throws SQLException {
        if (statement.executeUpdate(string) > 0)
            return "修改成功";
        else
            return "修改失败";
    }

    public static void select(String string, BufferedWriter bufferedWriter) throws SQLException, IOException {
        //查 写
        ResultSet resultSet = statement.executeQuery(string);
        while (resultSet.next()) {
            int ID = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String password = resultSet.getString(3);
            float money = resultSet.getFloat(4);
            bufferedWriter.write((ID + "\t" + name + "\t" + password + "\t" + money));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        System.out.println("写入成功");
        resultSet.close();
    }
}