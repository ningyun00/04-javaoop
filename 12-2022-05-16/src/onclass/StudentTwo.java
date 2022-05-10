package onclass;

/**
 * Description:
 * package: onclass <br/>
 * ClassName: StudentTwo <br/>
 * date: 2022-05-16 上午 11:46:22 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class StudentTwo {
    /**
     * @Description:
     * @Class: StudentTwo
     */
    private String ID;//编号
    private String name;//姓名
    private char sex;//性别
    private double grades;//成绩
    public StudentTwo(){}
    public StudentTwo(String ID, String name, char sex, double grades) {
        this.ID = ID;
        this.name = name;
        while (true) {
            try {/*异常块*/
                if (sex == '男' || sex == '女') {
                    this.sex = sex;
                    break;
                }
            } catch (Exception exception) {/*异常类型 捕获异常*/
                System.out.println("性别输入错误");
            }
        }
        this.grades = grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    public double getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", grades=" + grades +
                '}';
    }
}