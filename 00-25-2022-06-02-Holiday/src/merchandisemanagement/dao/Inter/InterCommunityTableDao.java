package merchandisemanagement.dao.Inter;

import merchandisemanagement.entity.CommunityTable;

import java.util.List;

public interface InterCommunityTableDao {
    //添加商品
    public abstract int add(CommunityTable communityTable);

    //删除商品
    public abstract int del(int ID);

    //改变商品
    public abstract int revise(CommunityTable communityTable);

    //查询所有商品
    public abstract List<CommunityTable> select();

    //查询指定单条商品
    public abstract CommunityTable select(int ID);
}
