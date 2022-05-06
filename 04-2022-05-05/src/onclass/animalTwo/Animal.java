package onclass.animalTwo;

public class Animal {
    public String name;//姓名
    public char sex;//性别
    public Animal(String name, char sex){this.name = name;this.sex = sex;}
}
/*练习二：（继承）
--- 创建一个动物类:
Animal:字段:name,sex~~访问修饰符均为 public
Amimal:构造函数:无参，带两个参的分别为 name 和 sex 赋值
--- 创建一个鸡类 Ji 继承于 Animal
Ji:私有字段:chiBang,用属性封装
Ji:构造函数:带三个参的分别为 name 和 sex 和 chiBang 赋值,name 和 sex 在父类赋值
Ji:toString()方法，用来作自我介绍，打印:我是 XXX,我是 XXX,我有 XXX
--- 创建一个狗类 Dog 继承于 Animal
Dog:私有字段:weiBa,用属性封装
Dog:构造函数:带三个参数分别为 name,sex,weiBa 赋值,name 和 sex 在父类赋值
Dog: toString()方法，用来作自我介绍，打印:我是 XXX,我是 XXX,我有 XXX
--- 在测试类 Main 方法内:
定义二个鸡对象:
花花,母,一对金黄色的翅膀
草草,公,一对银黄色的翅膀
定义二个狗对象:
小白,公,一条金白色的尾巴
小黄,母,一条银白色的尾巴
分别调用 4个对象相应的方法*/