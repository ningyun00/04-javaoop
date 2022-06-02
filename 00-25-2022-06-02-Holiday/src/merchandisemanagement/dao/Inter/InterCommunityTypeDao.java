package merchandisemanagement.dao.Inter;

import merchandisemanagement.entity.CommunityTable;
import merchandisemanagement.entity.CommunityType;

import java.util.List;

public interface InterCommunityTypeDao {
    //类型
    public abstract int add(CommunityType communityType);

    //删除类型
    public abstract int del(int ID);

    //修改
    public abstract int revise(CommunityType communityType);

    //查询类型
    public abstract List<CommunityType> select();

    //查询指定类型
    public abstract CommunityType select(int ID);
}
