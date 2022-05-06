package underclass.human;

public class Person {
    /*【练习题三】构造方法：
编写 Java 程序，用于显示人的姓名和年龄。
定义一个人类（Person），该类中应该有两个私有属性，姓名（name）和年龄（age）。定义
构造方法，用来初始化数据成员。再定义显示（display）方法，将姓名和年龄打印出来。
在 main 方法中创建人类的实例，然后将信息显示。*/
    /**姓名*/
    private String name;//姓名
    /**年龄*/
    private int age;//年龄
    public Person(){}
    /**name:姓名 age:年龄*/
    public Person(String name,int age){this.name = name;this.age = age;}
    public void display(){
        System.out.println("姓名："+this.name+"年龄："+this.age);
    }
}
