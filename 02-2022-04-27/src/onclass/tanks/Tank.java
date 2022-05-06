package onclass.tanks;
/**坦克信息*/
public class Tank {
    /*练习二:
1） 定义一个 Tank 类(坦克类)，为其定义 x（横坐标），y（纵坐标），dir（方向：值可以
是上下左右），Type（类型）4 个字段，其访问修饰符均为公有；
2） 为 Tank 类定义一个构造方法实现 4 个字段的初始化
3） 为 Tank 类定义一个 ShowData 方法，控制台打印 4 个字段值
4） 创建一个 Tank 对象，横坐标为 10，纵坐标为 50，方向为右，类型为重型坦克，并通过
调用对象的 ShowData()方法打印 Tank 信息*/
    public int X;//横坐标
    public int Y;//纵坐标
    public String dir;//方向
    public String type;//坦克类型

    public Tank() {
    }
    /**构造方法
     * 横坐标,纵坐标,方向,坦克类型
     */
    public Tank(int X, int Y, String dir, String type) {
        this.X = X;
        this.Y = Y;
        this.dir = dir;
        this.type = type;
    }
    public void ShowData(){
        System.out.println("横坐标为:"+X+"纵坐标为"+Y+"方向为："+dir+"类型："+type);
    }
}
