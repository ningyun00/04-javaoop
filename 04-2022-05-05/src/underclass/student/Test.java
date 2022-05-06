package underclass.student;

public class Test {
    public static void main(String[] args) {
        /*学生*/
        Student student = new Student();
        student.sex = "男";
        System.out.println(student.getSex());
        /*大学生*/
        UniversityStudent universityStudent = new UniversityStudent();
        universityStudent.sex = "女";
        System.out.println(universityStudent.getSex());
        universityStudent.study();
        /*小学生*/
        Pupils pupils = new Pupils();
        pupils.sex = "男";
        System.out.println(pupils.getSex());
        pupils.study();
    }
}
