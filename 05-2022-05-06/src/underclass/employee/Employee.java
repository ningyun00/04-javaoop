package underclass.employee;

public class Employee {
    private String name;//姓名
    private int age;//年龄
    private double wages;//工资
    public Employee() {
    }

    public Employee(String name, int age, double wages) {
        if (name.length() >= 2) {
            this.name = name;
        } else {
            this.name = "未知";
        }
        if (age >= 18) {
            this.age = age;
        } else {
            this.age = 18;
        }
        if (wages >= 0) {
            this.wages = wages;
        } else {
            System.out.println("工资不能低于零元");
        }
    }
    public void show() {
        System.out.println("我的姓名是：" + this.name + "，我的年龄是：" + this.age + ",我的工资有：" + this.wages);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWages() {
        return wages;
    }
}
/*2、(封装，构造)写一个职员类，类中有属性：姓名，年龄，工资。为了保护数据，所以将
所有属性设置为私有的。使用一个带参的构造方法将这些属性初始化，要求姓名长度必须大
于等于 2(默认值：未知)，年龄必须大于等于 18（默认值：18），工资大于等于 0。及一个
显示所有信息的方法，要求在此方法中输出“我的姓名是：XX，我的年龄是：XX，我的工资
有：XX”*/