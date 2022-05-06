package underclass.traffic;

public class Vehicles {
    /*【练习题四】
定义一个名为 Vehicles（交通工具）的基类，该类中应包含 String 类型的成员属性 brand
（商标）和 color（颜色），还应包含成员方法 run（行驶，在控制台显示“我已经开动了”）
和 showInfo（显示信息，在控制台显示商标和颜色），并编写构造方法初始化其成员属性*/
    /**商标*/
    private String brand = "无产地";
    /**颜色*/
    private String color = "白色";
    public Vehicles(){}
    public Vehicles(String brand,String color){this.brand=brand;this.color=color;}
    public void run(){
        System.out.println("我已经开动了");
    }
    public void showInfo(){
        System.out.println("商标："+this.brand+"\t颜色:"+this.color);
    }
}
