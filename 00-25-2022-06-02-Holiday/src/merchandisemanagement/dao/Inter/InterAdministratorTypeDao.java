package merchandisemanagement.dao.Inter;

import merchandisemanagement.entity.AdministratorType;

import java.util.List;

public interface InterAdministratorTypeDao {
    //添加职务
    public abstract int add(AdministratorType administratorType);

    //删除职务
    public abstract int del(int ATID);

    //修改职务
    public abstract int revise(AdministratorType administratorType);

    //查询自己
    public abstract AdministratorType select(int ATID);

    public abstract List<AdministratorType> select();
}
