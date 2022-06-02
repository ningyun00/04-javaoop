package merchandisemanagement.entity;

public class AdministratorType {
    private int ATID;
    private String ATName;
    private float ATPrice;
    private String ATRemark;

    public AdministratorType() {
    }

    public AdministratorType(String ATName, float ATPrice, String ATRemark) {
        this.ATName = ATName;
        this.ATPrice = ATPrice;
        this.ATRemark = ATRemark;
    }

    public AdministratorType(int ATID, String ATName, float ATPrice, String ATRemark) {
        this.ATID = ATID;
        this.ATName = ATName;
        this.ATPrice = ATPrice;
        this.ATRemark = ATRemark;
    }

    public int getATID() {
        return ATID;
    }

    public void setATID(int ATID) {
        this.ATID = ATID;
    }

    public String getATName() {
        return ATName;
    }

    public void setATName(String ATName) {
        this.ATName = ATName;
    }

    public float getATPrice() {
        return ATPrice;
    }

    public void setATPrice(float ATPrice) {
        this.ATPrice = ATPrice;
    }

    public String getATRemark() {
        return ATRemark;
    }

    public void setATRemark(String ATRemark) {
        this.ATRemark = ATRemark;
    }

    @Override
    public String toString() {
        return "管理员职务{\n" +
                "职务编号 =" + ATID +
                ", 职务名称 ='" + ATName + '\'' +
                ", 职务工资 =" + ATPrice +
                ", 职务备注 ='" + ATRemark + '\'' + "\n" +
                '}';
    }
}
