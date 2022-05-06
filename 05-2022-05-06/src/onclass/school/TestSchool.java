package onclass.school;

public class TestSchool {
    public static void main(String[] args) {
        School school = new School();

        School schoolTeacherJava = new TeacherJava("java", 10);

        School schoolTeacherDatabase = new TeacherDatabase("database", 10);

        School schoolTeacherNet = new TeacherNet("net", 10);

        school.testTeachar(schoolTeacherJava);
        System.out.println(schoolTeacherJava.getName()+""+schoolTeacherJava.getAge());
        school.testTeachar(schoolTeacherDatabase);
        System.out.println(schoolTeacherDatabase.getName()+""+schoolTeacherJava.getAge());
        school.testTeachar(schoolTeacherNet);
        System.out.println(schoolTeacherNet.getName()+""+schoolTeacherJava.getAge());
    }
}
