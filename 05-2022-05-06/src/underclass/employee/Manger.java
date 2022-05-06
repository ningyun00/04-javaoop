package underclass.employee;

public class Manger extends Employee {
    private double bonus;//奖金

    public Manger() {
    }

    public Manger(String name, int age, double wages, double bonus) {
        super(name, age, wages);
        if (bonus >= 1000) {
            this.bonus = bonus;
        }
    }
    public void show(){
        System.out.println("我的姓名是：" + getName() + "，我的年龄是：" +getAge()+ ",我的工资有：" +getWages()+"我有奖金:"+this.bonus);
    }
}
/*3.（继承）再写一个经理类，继承职员类，（因为一个经理也是一个职员）。类中增加属性：
奖金。然后为此类写一个带参的构造方法，要求传入：姓名，年龄，工资及奖金，在构造方
法中使用 super 关键字调用父类的带参构造方法初始化：姓名，年龄，工资字段，再使用
this 关键字初始化奖金字段，要求奖金至少 1000。类中重写职员类中的显示信息的方法，
要求输出“我的姓名是：XX，我的年龄是：XX，我的工资有：XX，我的奖金有：XX”。
测试：职员 a=new 经理("小样",19,1200,2000);
a.显示信息()*/