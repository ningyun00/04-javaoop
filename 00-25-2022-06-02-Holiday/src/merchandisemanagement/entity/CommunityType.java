package merchandisemanagement.entity;

public class CommunityType {
    private int TID;
    private String TName;
    private String TRemark;

    public CommunityType() {
    }

    public CommunityType(String TName, String TRemark) {
        this.TName = TName;
        this.TRemark = TRemark;
    }

    public CommunityType(int TID, String TName, String TRemark) {
        this.TID = TID;
        this.TName = TName;
        this.TRemark = TRemark;
    }

    public int getTID() {
        return TID;
    }

    public void setTID(int TID) {
        this.TID = TID;
    }

    public String getTName() {
        return TName;
    }

    public void setTName(String TName) {
        this.TName = TName;
    }

    public String getTRemark() {
        return TRemark;
    }

    public void setTRemark(String TRemark) {
        this.TRemark = TRemark;
    }

    @Override
    public String toString() {
        return "商品类型:{" +
                "类型编号 =" + TID +
                ",类型名称 ='" + TName + '\'' +
                ", 类型备注 ='" + TRemark + '\'' +
                '}' + "\n";
    }
}
