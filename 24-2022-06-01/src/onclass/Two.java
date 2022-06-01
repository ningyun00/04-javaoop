package onclass;

import java.util.ArrayList;
import java.util.List;

public class Two {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("张三",5000));
        employeeList.add(new Employee("李四",5500));
        employeeList.add(new Employee("赵六", 4500));
        for(Employee employee: employeeList){
            System.out.println(employee);
        }
    }
}
