package onclass.six;

/**
 * Description:
 * package: onclass.six <br/>
 * ClassName: Student <br/>
 * date: 2022-05-17 下午 12:03:06 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Student {
    /**
     * @Description:
     * @Class: Student
     */
    private String name;//姓名
    private int age;//年龄
    private char sex;//性别

    public Student(String name, int age, char sex) {
        this.name = name;
        if (age>0){
            this.age = age;
        }else{
            System.out.println("年龄过小,以默认18");
            this.age=18;
        }
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}