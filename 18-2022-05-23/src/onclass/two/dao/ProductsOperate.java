package onclass.two.dao;

import onclass.two.entity.Products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * ClassName: ProductsOperate <br/>
 * date: 2022-05-23 下午 03:23:42 <br/>
 * author: 寜 <br/>
 */
public class ProductsOperate extends ProductsDaoInter {
    static ProductsDaoInter productsDaoInter = new ProductsOperate();
    static Connection connection = productsDaoInter.setConnection();
    static PreparedStatement preparedStatement = null;
    static ResultSet resultSet = null;
    static int row = 0;

    /**
     * 添加
     */
    public static int add(Products products) {
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO products VALUES(NULL,?,?,?)");
            preparedStatement.setString(1, products.getName());
            preparedStatement.setInt(2, products.getPrice());
            preparedStatement.setString(3, products.getRemark());
            row = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            productsDaoInter.setClose(null, preparedStatement, connection);
        }
        return row;
    }

    /**
     * 根据id删除
     */
    public static int del(int id) {
        row = 0;
        try {//异常块
            preparedStatement = connection.prepareStatement("DELETE FROM products WHERE id = ?");
            preparedStatement.setInt(1, id);
            row = preparedStatement.executeUpdate();
        } catch (SQLException exception) {//异常类型 捕获异常
            System.out.println("商品编号" + id + "不存在");
        } finally {//结束异常执行
            productsDaoInter.setClose(null, preparedStatement, connection);
        }
        return row;
    }

    /**
     * 根据商品编号经行修改
     */
    public static int update(int id, Products products) {
        row = 0;
        try {//异常块
            preparedStatement = connection.prepareStatement("UPDATE products SET NAME = ?,price = ?,remark = ? WHERE id = ?");
            preparedStatement.setString(1, products.getName());
            preparedStatement.setInt(2, products.getPrice());
            preparedStatement.setString(3, products.getRemark());
            preparedStatement.setInt(4, id);
            row = preparedStatement.executeUpdate();
        } catch (SQLException exception) {//异常类型 捕获异常
            System.out.println("商品编号"+id+"无法修改");
        } finally {//结束异常执行
            productsDaoInter.setClose(null, preparedStatement, connection);
        }
        return row;
    }

    /**
     * 查询所有商品
     */
    public static List<Products> select() {
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
            productsDaoInter.setClose(resultSet, preparedStatement, connection);
        }
        return productsList;
    }

    /**
     * 根据商品名称查询商品
     */
    public static List<Products> select(String name) {
        List<Products> productsList = new ArrayList<>();
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
            productsDaoInter.setClose(resultSet, preparedStatement, connection);
        }
        return productsList;
    }
}