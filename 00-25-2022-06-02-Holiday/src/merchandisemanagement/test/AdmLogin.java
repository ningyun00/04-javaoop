package merchandisemanagement.test;

import merchandisemanagement.dao.DatabaseDao;
import merchandisemanagement.dao.table.AdministratorInterDao;
import merchandisemanagement.dao.table.AdministratorTypeInterDao;
import merchandisemanagement.dao.table.CommunityTableInterDao;
import merchandisemanagement.dao.table.CommunityTypeInterDao;
import merchandisemanagement.entity.Administrator;
import merchandisemanagement.entity.AdministratorType;
import merchandisemanagement.entity.CommunityTable;
import merchandisemanagement.entity.CommunityType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AdmLogin {
    static Scanner scanner = new Scanner(System.in);
    static AdministratorInterDao administratorInterDao = new AdministratorInterDao();
    static CommunityTableInterDao communityTableInterDao = new CommunityTableInterDao();
    static CommunityTypeInterDao communityTypeInterDao = new CommunityTypeInterDao();
    static AdministratorTypeInterDao administratorTypeInterDao = new AdministratorTypeInterDao();

    public static int select(String AAccount, String APassword) {
        Connection connection = DatabaseDao.connect();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        int row = 0;
        try {
            preparedStatement = connection.prepareStatement("SELECT AAccount,APassword FROM administrator WHERE AAccount = ? AND APassword = ?");
            preparedStatement.setString(1, AAccount);
            preparedStatement.setString(2, APassword);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                if (AAccount.equals(resultSet.getString(1)) && APassword.equals(resultSet.getString(2))) {
                    row = 1;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("登录处错误");
            e.printStackTrace();
        } finally {
            DatabaseDao.close(resultSet, preparedStatement, connection);
        }
        return row;
    }

    public static void choose() {
        try {
            System.out.println("==============主界面=============");
            System.out.println("\t\t\t1.添加商品");
            System.out.println("\t\t\t2.添加商品类型");
            System.out.println("\t\t\t3.添加管理员");
            System.out.println("\t\t\t4.添加管理员职务");
            System.out.println("\t\t\t5.更多操作");
            System.out.println("\t\t\t6.返回登录界面");
            System.out.println("\t\t\t7.退出系统");
            System.out.println("=============主界面=============");
            String row = scanner.next();
            if (row.equals("1")) {
                addCommodity();
            }
            if (row.equals("2")) {
                addType();
            }
            if (row.equals("3")) {
                addAdministrator();
            }
            if (row.equals("4")) {
                addAdministratorType();
            }
            if (row.equals("5")) {
                while (true) {
                    moreActions();
                }
            }
            if (row.equals("6")) {
                Test.main();
            }
            if (row.equals("7")) {
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.println("选择处错误");
            e.printStackTrace();
        }
    }

    public static void moreActions() throws InterruptedException {
        System.out.println("==================更多操作================");
        System.out.println("\t\t\t\t1.修改商品");
        System.out.println("\t\t\t\t2.删除商品");
        System.out.println("\t\t\t\t3.查询商品");
        System.out.println("\t\t\t\t4.删除管理员");
        System.out.println("\t\t\t\t5.查询管理员");
        System.out.println("\t\t\t\t6.删除管理职务");
        System.out.println("\t\t\t\t7.查询管理员职务");
        System.out.println("\t\t\t\t8.返回主界面");
        System.out.println("\t\t\t\t9.退出系统");
        System.out.println("==================更多操作==============");
        String I = scanner.next();
        if (I.equals("1")) {

        }
        if (I.equals("2")) {

        }
        if (I.equals("3")) {
            System.out.println("正在查询商品请稍等。。。");
            List<CommunityTable> communityTableList = communityTableInterDao.select();
            for (CommunityTable communityTable : communityTableList) {
                System.out.println(communityTable);
            }
            System.out.println("查询完毕请等待。。。");
            TimeUnit.SECONDS.sleep(5);//延时五秒后执行
        }
        if (I.equals("4")) {

        }
        if (I.equals("5")) {
            System.out.println("正在查询管理员。。。");
            List<Administrator> administratorList = administratorInterDao.select();
            for (Administrator administrator : administratorList) {
                System.out.println(administrator);
            }
            System.out.println("查询完毕请等待。。。");
            TimeUnit.SECONDS.sleep(5);//延时五秒后执行
        }
        if (I.equals("6")) {

        }
        if (I.equals("7")) {

        }
        if (I.equals("8")) {
            choose();
        }
        if (I.equals("9")) {
            System.exit(0);
        }
    }

    public static void addAdministratorType() {
        System.out.println("请输入管理员职务：");
        String ATName = scanner.next();
        System.out.println("请输入管理员职务工资：");
        float ATPrice = scanner.nextFloat();
        System.out.println("请输入管理员职务备注：");
        String ATRemark = scanner.next();
        if (administratorTypeInterDao.add(new AdministratorType(ATName, ATPrice, ATRemark)) > 0) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    public static void addAdministrator() {
        System.out.print("请输入管理员账号：");
        String AAccount = scanner.next();
        System.out.print("请输入管理员密码：");
        String APassword = scanner.next();
        System.out.print("请选择管理员职务编号：");
        System.out.print(administratorTypeInterDao.select());
        int AOffice = scanner.nextInt();
        System.out.print("请输入工资：");
        float AWages = scanner.nextFloat();
        System.out.print("请输入奖金：");
        float ABonus = scanner.nextFloat();
        Date ATime = new Date();
        System.out.print("请输入姓名：");
        String AName = scanner.next();
        System.out.print("请输入性别：");
        String ASex = scanner.next();
        System.out.print("请输入电话号码：");
        String ANumber = scanner.next();
        System.out.print("请输入住址：");
        String AAddress = scanner.next();
        System.out.print("请输入管理用户：");
        int AUser = 1;
        System.out.print("请输入备注");
        String ARemark = scanner.next();
        if (administratorInterDao.add(new Administrator(AAccount, APassword, AOffice, AWages, ABonus, ATime, null, AName, ASex, ANumber, AAddress, AUser, ARemark)) > 0) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    public static void addType() {
        System.out.println("请输入类型名称：");
        String TName = scanner.next();
        System.out.println("请输入商品类型备注：");
        String TRemark = scanner.next();
        if (communityTypeInterDao.add(new CommunityType(TName, TRemark)) > 0) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    public static void addCommodity() {
        System.out.print("请输入商品名称：");
        String CNAmE = scanner.next();
        System.out.print("请选择商品类型编号：");
        System.out.println(communityTypeInterDao.select());
        int CTID = scanner.nextInt();
        System.out.print("请输入商品的录入价格：");
        float CINPutPrice = scanner.nextFloat();
        Date CTime = new Date();
        System.out.print("请输入商品原价：");
        float CPrice = scanner.nextFloat();
        System.out.print("请输入商品的现价：");
        float CCurrENT = scanner.nextFloat();
        System.out.print("请输入商品的备注：");
        String CRemark = scanner.next();
        if (communityTableInterDao.add(new CommunityTable(CNAmE, CTID, CINPutPrice, CTime, CPrice, CCurrENT, CRemark)) > 0) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }
}
