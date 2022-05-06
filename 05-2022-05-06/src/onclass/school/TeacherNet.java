package onclass.school;

public class TeacherNet extends School {
    public TeacherNet(){}
    public TeacherNet(String name,int age){
        super(name,age);
    }
    public void Teaching() {
        System.out.println("Net老师");
    }
}
