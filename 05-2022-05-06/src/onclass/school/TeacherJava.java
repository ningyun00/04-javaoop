package onclass.school;

public class TeacherJava extends School {
    public TeacherJava(){}
    public TeacherJava(String name,int age){
        super(name,age);
    }
    public void Teaching(){
        System.out.println("java老师");
    }
}
