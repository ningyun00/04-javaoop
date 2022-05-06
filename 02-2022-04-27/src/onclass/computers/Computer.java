package onclass.computers;

import java.sql.SQLOutput;

public class Computer {
    /*练习三:
1) 创建一个计算机类:Computer
2) 创建三个字段:name:计算机名,type:计算机品牌,size:尺寸
3) 创建一个构造函数为三个字段赋初始值
4) 添加一个 ShowData 方法打印各字段值
5) 创建一个计算机对象，调用其 ShowData()*/
    private String name;
    private String type;
    private String size;

    public Computer() {
    }

    public Computer(String name, String type, String size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }
    public void ShowData(){
        System.out.println(this.name+this.type+this.size);
    }
}
