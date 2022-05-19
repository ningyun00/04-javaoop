package onclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Description:三.使用 jdbc 的事务处理进行以下操作
 * 9.小明转账 100 元给壮壮,系统先在小明账号上减少 100 元,再给壮壮账号增加 100 元. 但是转账过程中系统遇到异常,此时壮壮并没有收到小明转来的 100 元,而小明账号上已经
 * 减少了 100 元,这样的软件让小明很伤心. 请你设计一个程序防止这种情况发生
 * ClassName: Four <br/>
 * date: 2022-05-21 下午 02:15:33 <br/>
 * author: 寜 <br/>
 */
public class Four {
    static Connection connection = null;
    static PreparedStatement preparedStatement = null;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/scott", "root", "root");
        UserOneToUserTwoAndMoney("张三","李四",1000);
        preparedStatement.close();
        connection.close();
    }

    private static void UserOneToUserTwoAndMoney(String nameOne, String nameTwo, float money) throws SQLException {
        try {//异常块
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement("UPDATE Student SET money = money - ? WHERE NAME = ?");//一号用户
            preparedStatement.setFloat(1,money);
            preparedStatement.setString(2,nameOne);
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("UPDATE Student SET money = money + ? WHERE NAME = ?");//二号用户
            preparedStatement.setFloat(1,money);
            preparedStatement.setString(2, nameTwo);
            preparedStatement.executeUpdate();
            connection.commit();
            System.out.println("转账成功");
        } catch (Exception exception) {//异常类型 捕获异常
            connection.rollback();
            System.out.println("转账失败");
        }
    }
}