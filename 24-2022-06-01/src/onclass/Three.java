package onclass;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Three {
    public static void main(String[] args) {
        add(1,"as",10);
        add(1,"as",10);
        add(1,"as",10);
        add(1,"as",11);
    }
    private static void add(int ID, String name, double grades) {
        Set<Students> studentsSet = new HashSet<>();
        Students students = new Students(ID, name, grades);
        if (studentsSet.contains(new Students(ID, name, grades))) {
            System.out.println("已存在改对象");
        } else {
            studentsSet.add(students);
        }
        Iterator iterator = studentsSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
