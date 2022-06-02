package merchandisemanagement.dao.table;

import merchandisemanagement.dao.DatabaseDao;
import merchandisemanagement.dao.Inter.InterAdministratorDao;
import merchandisemanagement.entity.Administrator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdministratorInterDao implements InterAdministratorDao {
    private static Connection connection = DatabaseDao.connect();
    private static PreparedStatement preparedStatement = null;
    private static ResultSet resultSet = null;
    private static Administrator administrator = null;
    private static java.util.Date date = new java.util.Date();
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static int row = 0;

    @Override
    public int add(Administrator administrator) {
        row = 0;
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO administrator VALUES(NULL,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, administrator.getAAccount());//账号
            preparedStatement.setString(2, administrator.getAPassword());//密码
            preparedStatement.setInt(3, administrator.getAOffice());//职务
            preparedStatement.setFloat(4, administrator.getAWages());//工资
            preparedStatement.setFloat(5, administrator.getABonus());//奖金
            if (administrator.getATime() != null) {
                date = administrator.getATime();
            }
            preparedStatement.setString(6, format.format(date));//入职时间
            preparedStatement.setString(7, administrator.getAEndTime());//离职时间
            preparedStatement.setString(8, administrator.getAName());//姓名
            preparedStatement.setString(9, administrator.getASex());//性别
            preparedStatement.setString(10, administrator.getANumber());//电话号码
            preparedStatement.setString(11, administrator.getAAddress());//住址
            preparedStatement.setInt(12, administrator.getAUser());//管理用户
            preparedStatement.setString(13, administrator.getARemark());//地址
            row = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("管理员添加错误");
            e.printStackTrace();
        } finally {
            DatabaseDao.close(null, preparedStatement, connection);
        }
        return row;
    }

    @Override
    public int del(int AID) {
        row = 0;
        try {
            preparedStatement = connection.prepareStatement("DELETE FROM administrator WHERE AID = ?");
            preparedStatement.setInt(1, AID);
            row = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("删除失败");
            e.printStackTrace();
        } finally {
            DatabaseDao.close(null, preparedStatement, connection);
        }
        return row;
    }

    @Override
    public int revise(Administrator administrator) {
        row = 0;
        try {
            String sql = ("UPDATE administrator SET AAccount = ?,APassword = ?,AOffice = ?,AWages = ?,ABonus = ?,ATime = ?,AEndTime = ?,AName = ?,ASex = ?,ANumber = ?,AAddress = ?,AUser = ?,ARemark = ? WHERE AID = ?");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, administrator.getAAccount());//账号
            preparedStatement.setString(2, administrator.getAPassword());//密码
            preparedStatement.setInt(3, administrator.getAOffice());//职务
            preparedStatement.setFloat(4, administrator.getAWages());//工资
            preparedStatement.setFloat(5, administrator.getABonus());//奖金
            if (administrator.getATime() != null) {
                date = administrator.getATime();
            }
            preparedStatement.setString(6, format.format(date));//入职时间
            preparedStatement.setString(7, administrator.getAEndTime());//离职时间
            preparedStatement.setString(8, administrator.getAName());//姓名
            preparedStatement.setString(9, administrator.getASex());//性别
            preparedStatement.setString(10, administrator.getANumber());//电话号码
            preparedStatement.setString(11, administrator.getAAddress());//住址
            preparedStatement.setInt(12, administrator.getAUser());//管理用户
            preparedStatement.setString(13, administrator.getARemark());//地址
            preparedStatement.setInt(14, administrator.getAID());//地址
            row = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("修改失败");
            e.printStackTrace();
        } finally {
            DatabaseDao.close(null, preparedStatement, connection);
        }
        return row;
    }

    @Override
    public Administrator select(int AID) {
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM administrator WHERE AID = ?");
            preparedStatement.setInt(1, AID);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int ID = resultSet.getInt(1);
                String AAccount = resultSet.getString(2);
                String APassword = resultSet.getString(3);
                int AOffice = resultSet.getInt(4);
                float AWages = resultSet.getFloat(5);
                float ABonus = resultSet.getFloat(6);
                Date ATime = resultSet.getDate(7);
                String AEndTime = resultSet.getString(8);
                String AName = resultSet.getString(9);
                String ASex = resultSet.getString(10);
                String ANumber = resultSet.getString(11);
                String AAddress = resultSet.getString(12);
                int AUser = resultSet.getInt(13);
                String ARemark = resultSet.getString(14);
                administrator = new Administrator(ID, AAccount, APassword, AOffice, AWages, ABonus, ATime, AEndTime, AName, ASex, ANumber, AAddress, AUser, ARemark);
            }
        } catch (Exception e) {
            System.out.println("查询错误");
            e.printStackTrace();
        } finally {
            DatabaseDao.close(resultSet, preparedStatement, connection);
        }
        return administrator;
    }

    @Override
    public List<Administrator> select() {
        List<Administrator> administratorList = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM administrator");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int ID = resultSet.getInt(1);
                String AAccount = resultSet.getString(2);
                String APassword = resultSet.getString(3);
                int AOffice = resultSet.getInt(4);
                float AWages = resultSet.getFloat(5);
                float ABonus = resultSet.getFloat(6);
                Date ATime = resultSet.getDate(7);
                String AEndTime = resultSet.getString(8);
                String AName = resultSet.getString(9);
                String ASex = resultSet.getString(10);
                String ANumber = resultSet.getString(11);
                String AAddress = resultSet.getString(12);
                int AUser = resultSet.getInt(13);
                String ARemark = resultSet.getString(14);
                administratorList.add(new Administrator(ID, AAccount, APassword, AOffice, AWages, ABonus, ATime, AEndTime, AName, ASex, ANumber, AAddress, AUser, ARemark));
            }
        } catch (Exception e) {
            System.out.println("查询错误");
            e.printStackTrace();
        } finally {
            DatabaseDao.close(resultSet, preparedStatement, connection);
        }
        return administratorList;
    }
}
