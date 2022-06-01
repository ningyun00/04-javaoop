package onclass;

import java.util.Objects;

public class Students {
    private int ID;
    private String name;
    private double grades;

    public Students() {
    }

    public Students(int ID, String name, double grades) {
        this.ID = ID;
        this.name = name;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Students{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return ID == students.ID && Double.compare(students.grades, grades) == 0 && name.equals(students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, grades);

    }
}