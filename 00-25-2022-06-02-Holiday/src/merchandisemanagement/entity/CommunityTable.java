package merchandisemanagement.entity;

import java.util.Date;

/**
 * 商品表
 */
public class CommunityTable {
    private int CID;//商品编号
    private String CNAmE;//商品名称
    private int CTID;//商品类型
    private float CINPutPrice;//商品录入价格
    private Date CTime;//商品录入时间
    private float CPrice;//商品原价
    private float CCurrENT;//商品现价
    private String CRemark;//商品备注

    public CommunityTable() {
    }

    public CommunityTable(int CID, String CNAmE, int CTID, float CINPutPrice, Date CTime, float CPrice, float CCurrENT, String CRemark) {
        this.CID = CID;
        this.CNAmE = CNAmE;
        this.CTID = CTID;
        this.CINPutPrice = CINPutPrice;
        this.CTime = CTime;
        this.CPrice = CPrice;
        this.CCurrENT = CCurrENT;
        this.CRemark = CRemark;
    }

    public CommunityTable(String CNAmE, int CTID, float CINPutPrice, Date CTime, float CPrice, float CCurrENT, String CRemark) {
        this.CNAmE = CNAmE;
        this.CTID = CTID;
        this.CINPutPrice = CINPutPrice;
        this.CTime = CTime;
        this.CPrice = CPrice;
        this.CCurrENT = CCurrENT;
        this.CRemark = CRemark;
    }

    public int getCID() {
        return CID;
    }

    public void setCID(int CID) {
        this.CID = CID;
    }

    public String getCNAmE() {
        return CNAmE;
    }

    public void setCNAmE(String CNAmE) {
        this.CNAmE = CNAmE;
    }

    public int getCTID() {
        return CTID;
    }

    public void setCTID(int CTID) {
        this.CTID = CTID;
    }

    public float getCINPutPrice() {
        return CINPutPrice;
    }

    public void setCINPutPrice(float CINPutPrice) {
        this.CINPutPrice = CINPutPrice;
    }

    public Date getCTime() {
        return CTime;
    }

    public void setCTime(Date CTime) {
        this.CTime = CTime;
    }

    public float getCPrice() {
        return CPrice;
    }

    public void setCPrice(float CPrice) {
        this.CPrice = CPrice;
    }

    public float getCCurrENT() {
        return CCurrENT;
    }

    public void setCCurrENT(float CCurrENT) {
        this.CCurrENT = CCurrENT;
    }

    public String getCRemark() {
        return CRemark;
    }

    public void setCRemark(String CRemark) {
        this.CRemark = CRemark;
    }

    @Override
    public String toString() {
        return "商品表{" +
                "商品编号=" + CID +
                ", 商品名称='" + CNAmE + '\'' +
                ", 商品类型=" + CTID +
                ", 商品录入价格=" + CINPutPrice +
                ", 商品录入时间=" + CTime +
                ", 商品原价=" + CPrice +
                ", 商品现价=" + CCurrENT +
                ", 商品备注k='" + CRemark + '\'' +
                '}';
    }
}
