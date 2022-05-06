package onclass.school;

public class School {
    private String name;//姓名
    private int age;//年龄
    public School(){}
    public School(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void Teaching(){
        System.out.println("学校有老师");
    }
    public void testTeachar(School school){
        school.Teaching();
    }
}
/*2.请编码实现如下需求：
老师分为：Java 老师、数据库老师、.Net 老师
以上请考虑使用继承关系
老师都有姓名、年龄属性、教书的方法，但方法各不相同。
编写一个学校类 School，要求
编写一个考核老师的方法(testTeacher)，
要求此方法可以实现各种老师的考核（用多态实现）
方法先打出老师的姓名、年龄。再调用教书方法。
编写测试类 Test2 在 main 方法中进行测试。*/