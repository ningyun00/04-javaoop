package onclass.human;
/**人类*/
public class Human {
    /*1、写一个人类，类中有属性：姓名，年龄。有方法：
            （一）无参，无返回方法：跑步，要求要此方法中输出“**人正在跑步”。
            （二）无参，有返回方法：toString（介绍方法），要求返回“**人的年龄是：**”。
    写一个测试类，生成一个小红的人对象，年龄*/
    public String name;
    public int age;
    /**跑步*/
    public void Running(){
        System.out.println(name+"人正在跑步");
    }
    /**介绍方法*/
    public String toString(){
        return name+"人的年龄是："+age;
    }
}
