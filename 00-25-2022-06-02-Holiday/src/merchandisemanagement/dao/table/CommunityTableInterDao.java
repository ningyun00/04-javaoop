package merchandisemanagement.dao.table;

import merchandisemanagement.dao.DatabaseDao;
import merchandisemanagement.dao.Inter.InterCommunityTableDao;
import merchandisemanagement.entity.CommunityTable;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CommunityTableInterDao implements InterCommunityTableDao {
    private static Connection connection = DatabaseDao.connect();
    private static PreparedStatement preparedStatement = null;
    private static ResultSet resultSet = null;
    private static List<CommunityTable> communityTableList = null;
    private static int row = 0;
    private static java.util.Date date = new java.util.Date();
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public int add(CommunityTable communityTable) {
        row = 0;
        try {
            connection = DatabaseDao.connect();
            preparedStatement = connection.prepareStatement("INSERT INTO communitytable VALUES(NULL,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, communityTable.getCNAmE());
            preparedStatement.setInt(2, communityTable.getCTID());
            preparedStatement.setFloat(3, communityTable.getCINPutPrice());
            if (communityTable.getCTime() != null) {
                date = communityTable.getCTime();
            }
            preparedStatement.setString(4, format.format(date));
            preparedStatement.setFloat(5, communityTable.getCPrice());
            preparedStatement.setFloat(6, communityTable.getCCurrENT());
            preparedStatement.setString(7, communityTable.getCRemark());
            row = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("商品表添加错误");
            e.printStackTrace();
        } finally {
            DatabaseDao.close(null, preparedStatement, connection);
        }
        return row;
    }

    @Override
    public int del(int id) {
        row = 0;
        try {
            connection = DatabaseDao.connect();
            preparedStatement = connection.prepareStatement("DELETE FROM communitytable WHERE CID = ?");
            preparedStatement.setInt(1, id);
            row = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("商品表删除错误");
            e.printStackTrace();
        } finally {
            DatabaseDao.close(null, preparedStatement, connection);
        }
        return row;
    }

    @Override
    public int revise(CommunityTable communityTable) {
        try {
            connection = DatabaseDao.connect();
            preparedStatement = connection.prepareStatement("UPDATE communitytable SET CName = ?,CTID = ?,CInputPrice = ?,CTime = ?,CPrice =  ?,CCurrent = ?,CRemark = ? WHERE CID = ?");
            preparedStatement.setString(1, communityTable.getCNAmE());
            preparedStatement.setInt(2, communityTable.getCTID());
            preparedStatement.setFloat(3, communityTable.getCINPutPrice());
            if (communityTable.getCTime() != null) {
                date = communityTable.getCTime();
            }
            preparedStatement.setString(4, format.format(date));
            preparedStatement.setFloat(5, communityTable.getCPrice());
            preparedStatement.setFloat(6, communityTable.getCCurrENT());
            preparedStatement.setString(7, communityTable.getCRemark());
            preparedStatement.setInt(8, communityTable.getCID());
            row = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("商品表修改失败");
            e.printStackTrace();
        } finally {
            DatabaseDao.close(null, preparedStatement, connection);
        }
        return row;
    }

    @Override
    public List<CommunityTable> select() {
        List<CommunityTable> communityTableList = new ArrayList<>();
        try {
            connection = DatabaseDao.connect();
            preparedStatement = connection.prepareStatement("SELECT * FROM communitytable");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int Cid = resultSet.getInt(1);
                String Cname = resultSet.getString(2);
                int CTid = resultSet.getInt(3);
                float CInutPrice = resultSet.getInt(4);
                Date CTime = resultSet.getDate(5);
                float CPrice = resultSet.getInt(6);
                float CCurrent = resultSet.getInt(7);
                String CRemark = resultSet.getString(8);
                communityTableList.add(new CommunityTable(Cid, Cname, CTid, CInutPrice, CTime, CPrice, CCurrent, CRemark));
            }
        } catch (Exception e) {
            System.out.println("商品查询错误");
            e.printStackTrace();
        } finally {
            DatabaseDao.close(resultSet, preparedStatement, connection);
        }
        return communityTableList;
    }

    @Override
    public CommunityTable select(int ID) {
        CommunityTable communityTable = null;
        try {
            connection = DatabaseDao.connect();
            preparedStatement = connection.prepareStatement("SELECT * FROM communitytable");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int Cid = resultSet.getInt(1);
                String Cname = resultSet.getString(2);
                int CTid = resultSet.getInt(3);
                float CInutPrice = resultSet.getInt(4);
                Date CTime = resultSet.getDate(5);
                float CPrice = resultSet.getInt(6);
                float CCurrent = resultSet.getInt(7);
                String CRemark = resultSet.getString(8);
                communityTable = new CommunityTable(Cid, Cname, CTid, CInutPrice, CTime, CPrice, CCurrent, CRemark);
            }
        } catch (Exception e) {
            System.out.println("商品查询错误");
            e.printStackTrace();
        } finally {
            DatabaseDao.close(resultSet, preparedStatement, connection);
        }
        return communityTable;
    }
}
