package underclass.one;

/**
 * Description:
 * package: underclass.one <br/>
 * ClassName: Student <br/>
 * date: 2022-05-09 下午 04:47:09 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Student {
    /**
     * @Description: 学生类
     * @Class: Student
     */
    private int age;//年龄
    public Student(int age) throws Exception{
        if(age<18){
            this.age = age;
        }else{
            throw new Exception("年龄不能大于等于18");
        }
    }

    public int getAge() {
        return age;
    }
}
/**
 * @topic: 1. 定义一个学生类，类中有一个年龄(age)属性，
 * 写一个设置年龄的方法，年龄大于 18 岁,抛出”年龄不能大于 18”的异常
 * 方法需要声明一下我有异常抛出啊，调用者你要捕获它
 */