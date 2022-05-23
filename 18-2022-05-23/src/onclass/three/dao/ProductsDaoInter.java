package onclass.three.dao;

import onclass.three.entity.Products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * ClassName: ProductsDaoInter <br/>
 * date: 2022-05-24 上午 12:13:13 <br/>
 * author: 寜 <br/>
 */
public class ProductsDaoInter implements InterDao {
    static Connection connection = BaseDao.connect();
    static PreparedStatement preparedStatement = null;
    static ResultSet resultSet = null;
    static List<Products> productsList = null;
    static int row = 0;

    @Override
    public int add(Products products) {//添加
        row = 0;
        try {//异常块
            preparedStatement = connection.prepareStatement("INSERT INTO products VALUES(NULL,?,?,?)");
            preparedStatement.setString(1, products.getName());
            preparedStatement.setInt(2, products.getPrice());
            preparedStatement.setString(3, products.getRemark());
            row = preparedStatement.executeUpdate();
        } catch (SQLException exception) {//异常类型 捕获异常
            exception.printStackTrace();
        } finally {
            BaseDao.close(null, preparedStatement, connection);
        }
        return row;
    }

    @Override
    public int del(Products products) {//根据ID删除商品
        row = 0;
        try {//异常块
            preparedStatement = connection.prepareStatement("DELETE FROM products WHERE id = ?");
            preparedStatement.setInt(1, products.getId());
            row = preparedStatement.executeUpdate();
        } catch (SQLException exception) {//异常类型 捕获异常
            System.out.println("商品编号" + products.getId() + "不存在");
        } finally {//结束异常执行
            BaseDao.close(null, preparedStatement, connection);
        }
        return row;
    }

    @Override
    public int update(Products products) {
        row = 0;
        try {//异常块
            preparedStatement = connection.prepareStatement("UPDATE products SET NAME = ?,price = ?,remark = ? WHERE id = ?");
            preparedStatement.setString(1, products.getName());
            preparedStatement.setInt(2, products.getPrice());
            preparedStatement.setString(3, products.getRemark());
            preparedStatement.setInt(4, products.getId());
            row = preparedStatement.executeUpdate();
        } catch (SQLException exception) {//异常类型 捕获异常
            System.out.println("商品编号" + products.getId() + "无法修改");
        } finally {//结束异常执行
            BaseDao.close(null, preparedStatement, connection);
        }
        return row;
    }

    @Override
    public List<Products> select() {
        productsList = new ArrayList<>();
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
    //精确查询
    @Override
    public Products select(String name) {
        Products products = null;
        try {//异常块
            preparedStatement = connection.prepareStatement("SELECT * FROM products WHERE name = ?");
            preparedStatement.setString(1, name);
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

    @Override
    public List<Products> selectName(String name) {
        productsList = new ArrayList<>();
        try {//异常块
            preparedStatement = connection.prepareStatement("SELECT * FROM products WHERE name LIKE ?");
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