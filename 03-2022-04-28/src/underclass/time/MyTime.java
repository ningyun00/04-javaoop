package underclass.time;

public class MyTime {
    /*【练习题一】类的成员变量与方法、构造方法
在程序中，经常要对时间进行操作，但是并没有时间类型的数据。那么，我们可以自己实现
一个时间类，来满足程序中的需要。
定义名为 MyTime 的类，其中应有三个整型成员：时（hour），分（minute），秒（second），
为了保证数据的安全性，这三个成员变量应声明为私有。
为 MyTime 类定义构造方法，以方便创建对象时初始化成员变量。
再定义 diaplay 方法，用于将时间信息打印出来。
为 MyTime 类添加以下方法：
addSecond(int sec)
addMinute(int min)
addHour(int hou)
subSecond(int sec)
subMinute(int min)
subHour(int hou)
分别对时、分、秒进行加减运算。*/
    private int hour;//时
    private int minute;//分
    private int second;//秒
    /**构造方法*/
    public MyTime(){}
    public MyTime(int hour){this.hour = hour;}
    public MyTime(int hour,int minute){this.hour = hour;this.minute = minute;}
    public MyTime(int hour,int minute,int second){this.hour=hour;this.minute = minute;this.second = second;}

    /**方法*/
    public void display(){
        System.out.println(this.hour+"小时"+this.minute+"分钟"+this.second+"秒");
    }
    /**加秒*/
    public int addSecond(int sec) {
        return this.second += sec;
    }
    /**加分*/
    public int addMinute(int min){
        return this.minute += min;
    }
    /**加小时*/
    public int addHour(int hou){
        return this.hour += hou;
    }
    /**减秒*/
    public int subSecond(int sec) {
        return this.second -= sec;
    }
    /**减分*/
    public int subMinute(int min) {
        return this.minute -= min;
    }
    /**减小时*/
    public int subHour(int hor) {
        return this.hour -= hor;
    }
}
