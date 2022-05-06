package onclass.students;

/**
 * 学生类
 */
public class Student {
    /*练习一:
1) 创建一个学生类
2) 创建四个私有的字段:name(姓名),sex(性别),age(年龄),dire(方向)
3) 分别为私有的字段提供 get（获取）和 set（赋值）方法，
赋值时要求：name 长度不能超过四位,sex 只能是男或女,age 在 1-60 之内,dire 值只能
是.net 或 java
4) 测试:创建学生对象，设置属性，再分别在控制台打印该学生的基本信息*/
    private String name;//姓名
    private char sex;//性别
    private int age;//年龄
    private String dire;//方向

    /**
     * 设置姓名
     */
    public void setName(String name) {
        if (name.length() < 4) {
            this.name = name;
        } else {
            System.out.println("姓名输入错误");
        }
    }

    /**
     * 获取姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置性别
     */
    public void setSex(char sex) {
        if (sex == '男' || sex == '女') {
            this.sex = sex;
        } else {
            System.out.println("性别输入错误");
        }
    }

    /**
     * 获取性别
     */
    public char getSex() {
        return sex;
    }

    /**
     * 设置年龄
     */
    public void setAge(int age) {
        if (age >= 1 && age <= 60) {
            this.age = age;
        } else {
            System.out.println("年龄输入错误");
        }
    }

    /**
     * 获取年龄
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置选科
     */
    public void setDire(String dire) {
        if (dire == ".net" || dire == "java") {
            this.dire = dire;
        } else {
            System.out.println("方向选择错误");
        }
    }

    /**
     * 设置选科
     */
    public String getDire() {
        return dire;
    }
}
