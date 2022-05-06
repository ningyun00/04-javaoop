package underclass.employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("张三",20,3000);
        employee.show();
        employee = new Manger("小样", 19, 1200, 2000);
        employee.show();
    }
}
