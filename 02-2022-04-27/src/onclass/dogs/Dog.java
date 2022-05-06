package onclass.dogs;

public class Dog {
    /*练习四:
1) 创建一个狗类:Dog
2) 为狗类添加一个 name 私有字段和 sex 私有字段
3) 为 name 字段和 sex 字段分别提供属性验证(name:无校验,sex:只能是”公和母”)
4) 为 Dog 添加 ShowData 方法，打印名字和性别
5) 为 Dog 添加 YaRen 方法,实现狗咬人功能,YaRen(string str),如果 str 是一个”男人”，
输出“汪汪”,如果 str 是一个”女人”，输出“喔喔”，如果 str 是其它的输出”哇哇”
6) 测试：创建一个 Dog 类，为其设置属性值，并调用咬人的方法*/
    private String name;//狗名
    private String sex;//性别

    public Dog() {
    }

    public Dog(String name, String sex) {
        this.name = name;
        if (sex == "公" || sex == "母") {
            this.sex = sex;
        } else {
            System.out.println("狗的性别输入错误！");
        }
    }
    /**基础信息*/
    public void ShowData() {
        System.out.println(this.name + this.sex);
    }
    /**狗咬人*/
    public void YaRen(String name) {
        if (name =="男人"){
            System.out.println("汪汪");
        }else if(name =="女人"){
            System.out.println("喔喔");
        }else{
            System.out.println("哇哇”");
        }
    }
}
