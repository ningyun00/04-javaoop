package onclass.one_five;

/**
 * Description:
 * package: onclass <br/>
 * ClassName: Student <br/>
 * date: 2022-05-17 上午 11:50:01 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Student implements Comparable<Student>{
    /**
     * @Description:
     * @Class: Student
     */
    private String ID;//年龄
    private String name;//姓名
    private int score;//性别

    public Student(String ID, String name, int score) {
        this.ID = ID;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return o.score-this.score;
    }
}