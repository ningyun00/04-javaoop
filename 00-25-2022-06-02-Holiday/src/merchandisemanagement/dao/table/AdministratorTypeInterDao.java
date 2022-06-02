package merchandisemanagement.dao.table;

import merchandisemanagement.dao.DatabaseDao;
import merchandisemanagement.dao.Inter.InterAdministratorTypeDao;
import merchandisemanagement.entity.Administrator;
import merchandisemanagement.entity.AdministratorType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class AdministratorTypeInterDao implements InterAdministratorTypeDao {
    private static Connection connection = DatabaseDao.connect();
    private static PreparedStatement preparedStatement = null;
    private static ResultSet resultSet = null;
    private static AdministratorType administratorType = null;
    private static int row = 0;

    @Override
    public int add(AdministratorType administratorType) {
        row = 0;
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO administratortype VALUES(NULL,?,?,?)");
            preparedStatement.setString(1, administratorType.getATName());
            preparedStatement.setFloat(2, administratorType.getATPrice());
            preparedStatement.setString(3, administratorType.getATRemark());
            row = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("管理员类型添加错误");
            e.printStackTrace();
        } finally {
            DatabaseDao.close(null, preparedStatement, connection);
        }
        return row;
    }

    @Override
    public int del(int ATID) {
        row = 0;
        try {
            preparedStatement = connection.prepareStatement("DELETE FROM `administratortype` WHERE ATID  = ?");
            preparedStatement.setInt(1, ATID);
            row = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("管理员类型删除错误");
            e.printStackTrace();
        } finally {
            DatabaseDao.close(null, preparedStatement, connection);
        }
        return row;
    }

    @Override
    public int revise(AdministratorType administratorType) {
        row = 0;
        try {
            preparedStatement = connection.prepareStatement("UPDATE `administratortype` SET ATName = ?,ATPrice = ?,ATRemark = ? WHERE ATID = ?");
            preparedStatement.setString(1, administratorType.getATName());
            preparedStatement.setFloat(2, administratorType.getATPrice());
            preparedStatement.setString(3, administratorType.getATRemark());
            preparedStatement.setInt(4, administratorType.getATID());
            row = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("管理员类型修改错误");
            e.printStackTrace();
        } finally {
            DatabaseDao.close(null, preparedStatement, connection);
        }
        return 0;
    }

    @Override
    public AdministratorType select(int ATID) {
        administratorType = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM `administratortype` WHERE ATID = ?");
            preparedStatement.setInt(1, ATID);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                administratorType = new AdministratorType(resultSet.getInt(1), resultSet.getString(2), resultSet.getFloat(3), resultSet.getString(4));
            }
        } catch (Exception e) {
            System.out.println("管理员类型查询错误");
            e.printStackTrace();
        } finally {
            DatabaseDao.close(resultSet, preparedStatement, connection);
        }
        return administratorType;
    }

    @Override
    public List<AdministratorType> select() {
        List<AdministratorType> administratorTypeList = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM `administratortype`");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                administratorTypeList.add(new AdministratorType(resultSet.getInt(1), resultSet.getString(2), resultSet.getFloat(3), resultSet.getString(4)));
            }
        } catch (Exception e) {
            System.out.println("管理员类型查询所有错误");
            e.printStackTrace();
        } finally {
            DatabaseDao.close(resultSet, preparedStatement, connection);
        }
        return administratorTypeList;
    }
}
