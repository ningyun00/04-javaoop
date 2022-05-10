package phone;

import java.util.Objects;

/**
 * Description:
 * package: phone <br/>
 * ClassName: Commodity <br/>
 * date: 2022-05-17 下午 10:21:06 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Commodity {
    /**
     * @Description:
     * @Class: Commodity
     */
    private String name;//品牌
    private String color;//颜色
    private int price;//价格
    private int number;//数量

    public Commodity(String name, String color, int price, int number) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commodity commodity = (Commodity) o;
        return price == commodity.price && number == commodity.number && name.equals(commodity.name) && color.equals(commodity.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, price, number);
    }

    @Override
    public String toString() {
        return "手机类型：{" +
                "品牌：'" + name + '\'' +
                "手机颜色：'" + color + '\'' +
                "手机价格：" + price +
                "库存数量：" + number +
                '}'+"\n";
    }
}