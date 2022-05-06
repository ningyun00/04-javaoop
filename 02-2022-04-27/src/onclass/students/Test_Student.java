package onclass.students;

public class Test_Student {
    public static void main (String[] args){
        Student student = new Student();
        student.setName("寜");
        student.setAge(12);
        student.setSex('女');
        student.setDire("java");
        System.out.println("姓名："+student.getName()+"。性别："+student.getAge()+"。年龄："+student.getSex()+"。方向："+student.getDire()+"。");
    }
}
