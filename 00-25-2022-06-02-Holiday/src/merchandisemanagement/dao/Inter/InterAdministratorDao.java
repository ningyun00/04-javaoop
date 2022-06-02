package merchandisemanagement.dao.Inter;

import merchandisemanagement.entity.Administrator;

import java.util.List;

public interface InterAdministratorDao {
    //添加管理员
    public abstract int add(Administrator administrator);

    //删除管理员
    public abstract int del(int AID);

    //修改管理员
    public abstract int revise(Administrator administrator);

    //查询自己
    public abstract Administrator select(int AID);

    public abstract List<Administrator> select();
}
