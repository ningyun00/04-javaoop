package onclass.powder_two;

/**
 * 无名粉
 */
public class WuMingFen {
    /*作业二：构造方法与重载
为“无名的粉”写一个类：class WuMingFen 要求：
1.有三个属性：面码:String theMa 粉的分量(两)：int quantity
是否带汤：boolean likeSoup
2.写一个构造方法，以便于简化初始化过程，如：
WuMingFen f1 = new WuMingFen("牛肉",3,true);
3.重载构造方法，使得初始化过程可以多样化：
WuMingFen f2 = new WuMingFen("牛肉",2);
4.写一个普通方法：check()，将对象的三个属性打印在控制台上*/
    private String theMa;//面码
    private int quantity;//两
    private boolean likeSoup;//是否带汤

    /**
     * 三
     */
    public WuMingFen(String theMa, int quantity, boolean likeSoup) {
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSoup = likeSoup;
    }

    /**
     * 二
     */
    public WuMingFen(String theMa, int quantity) {
        this.theMa = theMa;
        this.quantity = quantity;
    }

    /**
     * 一
     */
    public WuMingFen(String theMa) {
        this.theMa = theMa;
    }

    /**
     * 零
     */
    public WuMingFen() {
    }

    public void check() {
        System.out.println(this.theMa + this.quantity + this.likeSoup);
    }
}
