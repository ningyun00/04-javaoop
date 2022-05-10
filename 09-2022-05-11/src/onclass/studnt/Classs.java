package onclass.studnt;

/**
 * Description:
 * package: onclass.studnt <br/>
 * ClassName: Classs <br/>
 * date: 2022-05-12 上午 11:23:04 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Classs {
    /**
     * @Description: 班级类
     * @Class: Classs
     */
    private String Student1[] = new String[30];
    int index = 0;
    public void Add(String name){
        Student1[index] = name;
        index++;
    }
    public String get(int index) {
        String Null = "-1";
        for (int i = 0; i < Student1.length; i++) {
            if (i == index) {
                Null = Student1[i];
            }
        }
        return Null;
    }

    public int get(String name) {
        int Null = -1;
        for (int i = 0; i < Student1.length; i++) {
            if (name.equals(Student1[i])) {
                Null = i;
            }
        }
        return Null;
    }
}
/**
 * @topic:
 */