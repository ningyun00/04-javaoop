package underclass.pigs;

/**
 * 猪类
 * @author 寜
 */
public class pig {
    private String color;//颜色
    private int weight;//重量
    public pig(){}
    public pig(String color,int weight){
        this.color = color;
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public int getWeight() {
        return weight;
    }
}
