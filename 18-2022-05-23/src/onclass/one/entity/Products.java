package onclass.one.entity;

/**
 * Description: //商品表
 * ClassName: Products <br/>
 * date: 2022-05-23 上午 11:24:45 <br/>
 * author: 寜 <br/>
 */
public class Products {
    private int id;//商品编号
    private String name;//商品名称
    private int price;//商品价格
    private String remark;//商品备注

    public Products() {
    }

    public Products(String name, int price, String remark) {
        this.name = name;
        this.price = price;
        this.remark = remark;
    }

    public Products(int id, String name, int price, String remark) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", remark='" + remark + '\'' +
                '}';
    }
}