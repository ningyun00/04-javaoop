package onclass.one.dao;

import onclass.one.entity.Products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * ClassName: DaoProducts <br/>
 * date: 2022-05-23 上午 11:53:10 <br/>
 * author: 寜 <br/>
 */
public class ProductsDao {
    static Connection connection = BaseDao.connect();//连接对象
    static PreparedStatement preparedStatement = null;//准备语句
    static ResultSet resultSet = null;//结果集

    /**
     * 添加商品
     */
    public static int add(Products products) {
        int row = 0;
        try {//异常块
            preparedStatement = connection.prepareStatement("INSERT INTO products VALUES(NULL,?,?,?)");
            preparedStatement.setString(1, products.getName());
            preparedStatement.setInt(2, products.getPrice());
            preparedStatement.setString(3, products.getRemark());
            row = preparedStatement.executeUpdate();
        } catch (Exception exception) {//异常类型 捕获异常
            exception.printStackTrace();
        } finally {
            BaseDao.close(null, preparedStatement, connection);
        }
        return row;
    }

    /**
     * 根据商品编号删除
     */
    public static int del(int id) {
        int row = 0;
        try {//异常块
            preparedStatement = connection.prepareStatement("DELETE FROM products WHERE id = ?");
            preparedStatement.setInt(1, id);
            row = preparedStatement.executeUpdate();
        } catch (SQLException exception) {//异常类型 捕获异常
            System.out.println("商品编号:" + id + " 不存在");
        } finally {//结束异常执行
            BaseDao.close(null, preparedStatement, connection);
        }
        return row;
    }

    /**
     * 根据商品编号进行修改
     */
    public static int update(int id, Products products) {
        int row = 0;
        try {//异常块
            preparedStatement = connection.prepareStatement("UPDATE products SET NAME = ?,price = ?,remark = ? WHERE id = ?");
            preparedStatement.setString(1, products.getName());
            preparedStatement.setInt(2, products.getPrice());
            preparedStatement.setString(3, products.getRemark());
            preparedStatement.setInt(4, id);
            row = preparedStatement.executeUpdate();
        } catch (SQLException exception) {//异常类型 捕获异常
            exception.printStackTrace();
        } finally {//结束异常执行
            BaseDao.close(null, preparedStatement, connection);
        }
        return row;
    }

    /**
     * 查询所有商品
     */
    public static List<Products> selectAll() {
        List<Products> productsList = new ArrayList<>();
        try {//异常块
            preparedStatement = connection.prepareStatement("SELECT * FROM products");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                productsList.add(new Products(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getString(4)));
            }
        } catch (SQLException exception) {//异常类型 捕获异常
            exception.printStackTrace();
        } finally {//结束异常执行
            BaseDao.close(resultSet, preparedStatement, connection);
        }
        return productsList;
    }

    /**
     * 根据ID查询指定商品
     */
    public static Products selectID(int id) {
        Products products = null;
        try {//异常块
            preparedStatement = connection.prepareStatement("SELECT * FROM products WHERE id = ?");
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                products = new Products(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getString(4));
            }
        } catch (SQLException exception) {//异常类型 捕获异常
            exception.printStackTrace();
        } finally {//结束异常执行
            BaseDao.close(resultSet, preparedStatement, connection);
        }
        return products;
    }

    /**
     * 根据商品名称模糊查询
     */
    public static List<Products> selectName(String name) {
        List<Products> productsList = new ArrayList<>();
        try {//异常块
            preparedStatement = connection.prepareStatement("SELECT * FROM products WHERE NAME LIKE ?");
            preparedStatement.setString(1, name + "%");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                productsList.add(new Products(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getString(4)));
            }
        } catch (SQLException exception) {//异常类型 捕获异常
            exception.printStackTrace();
        } finally {//结束异常执行
            BaseDao.close(resultSet, preparedStatement, connection);
        }
        return productsList;
    }

}