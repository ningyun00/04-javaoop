package onclass.school;

public class TeacherDatabase extends School {
    public TeacherDatabase(){}
    public TeacherDatabase(String name,int age){
        super(name,age);
    }
    public void Teaching() {
        System.out.println("数据库老师");
    }
}
