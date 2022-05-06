package onclass.home_one;
/**学生类*/
public class Person {
    /*作业一：
放假了，同学们准备回家。
回家可以选择三种交通工具：汽车、火车、飞机。请用面向对象编程设计，方法重载实现
回家的三种方式。
分析:以上描述中有学员、汽车、火车、飞机可以做为对象
1.可以分别设计 Person(学员类)、AirPlan(飞机)、Bus(汽车)、Train(火车)4 个类
学员类有 name 属性。三种交通工具类分别有一个共同的属性：时速 speed。
注意:请使用属性的封装(私有化属性，提供的 get 和 set 方法)。
2.学员回家(goHome)则是一种行为，可以设计为学员类的方法
利用方法重载实现三种回家的方式
坐汽车回家的方式:goHome(Bus bus),输出信息:"菜 10 坐时速 120 公里每小时汽车
回家" 坐火车回家的方式:goHome(Train train),输出信息:"菜 10 坐时速 180 公里每小时
火车回家"坐飞机回家的方式:goHome(AirPlan plan),输出信息:"菜 10 坐时速 320 公里每小时
飞机回家"
3. 编写测试类，创建汽车、火车、飞机对象，设置各时速属性，
创建学员对象，给学员类的姓名赋值，分别调用三种回家的方法。*/
    private String name;//姓名

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void goHome(Bus bus) {
        System.out.println(getName() + "坐时速" + bus.getSpeed() + "公里每小时汽车回家");
    }

    public void goHome(AirPlan airPlan) {
        System.out.println(getName() + "坐时速" + airPlan.getSpeed() + "公里每小时飞机回家");
    }

    public void goHome(Train train) {
        System.out.println(getName() + "坐时速" + train.getSpeed() + "公里每小时火车回家");
    }
}
