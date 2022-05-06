package underclass.calculator;

public class Number {
    /*【练习题二】构造方法
编写 Java 程序，模拟简单的计算器。
定义名为 Number 的类，其中有两个整型数据成员 n1 和 n2，应声明为私有。编写构造方法，
赋予 n1 和 n2 初始值，再为该类定义加（addition）、减（subtration）、乘（multiplication）、
除（division）等公有成员方法，分别对两个成员变量执行加、减、乘、除的运算。
在 main 方法中创建 Number 类的对象，调用各个方法，并显示计算结果。*/
    private  int number_one;
    private int number_two;
    public Number(){}
    public Number(int number_one,int number_two){this.number_one = number_one;this.number_two = number_two;}
    /**加*/
    public int addition(){return this.number_one+this.number_two;}
    /**减*/
    public int subtraction(){return this.number_one-this.number_two;}
    /**乘*/
    public int multiplication(){return this.number_one*this.number_two;}
    /**除*/
    public int division(){
        int zroe = 0;
        if(this.number_two==0){
            System.out.print("被除数不能为");
        }else{
           zroe = this.number_one / this.number_two;
        }
        return zroe;
    }
}
