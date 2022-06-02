package merchandisemanagement.dao.table;

import merchandisemanagement.dao.DatabaseDao;
import merchandisemanagement.dao.Inter.InterCommunityTypeDao;
import merchandisemanagement.entity.CommunityType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CommunityTypeInterDao implements InterCommunityTypeDao {
    private static Connection connection = DatabaseDao.connect();
    private static PreparedStatement preparedStatement = null;
    private static ResultSet resultSet = null;
    private static int row = 0;

    @Override
    public int add(CommunityType communityType) {
        row = 0;
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO `communitytype` VALUES(NULL,?,?)");
            preparedStatement.setString(1, communityType.getTName());
            preparedStatement.setString(2, communityType.getTRemark());
            row = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("商品类型添加错误");
            e.printStackTrace();
        } finally {
            DatabaseDao.close(null, preparedStatement, connection);
        }
        return row;
    }

    @Override
    public int del(int ID) {
        row = 0;
        try {
            preparedStatement = connection.prepareStatement("DELETE FROM communitytype WHERE TID = ?");
            preparedStatement.setInt(1, ID);
            row = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("商品类型删除错误");
            e.printStackTrace();
        } finally {
            DatabaseDao.close(null, preparedStatement, connection);
        }
        return 0;
    }

    @Override
    public int revise(CommunityType communityType) {
        row = 0;
        try {
            preparedStatement = connection.prepareStatement("UPDATE communitytype SET TName = ?,TRemark = ? WHERE TID = ?");
            preparedStatement.setString(1, communityType.getTName());
            preparedStatement.setString(2, communityType.getTRemark());
            preparedStatement.setInt(3, communityType.getTID());
            row = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("商品类型修改错误");
            e.printStackTrace();
        } finally {
            DatabaseDao.close(null, preparedStatement, connection);
        }
        return row;
    }

    @Override
    public List<CommunityType> select() {
        List<CommunityType> communityTypeList = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM communitytype");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String remark = resultSet.getString(3);
                communityTypeList.add(new CommunityType(id, name, remark));
            }
        } catch (Exception e) {
            System.out.println("查询所有错误");
            e.printStackTrace();
        } finally {
            DatabaseDao.close(resultSet, preparedStatement, connection);
        }
        return communityTypeList;
    }

    @Override
    public CommunityType select(int ID) {
        return null;
    }
}
