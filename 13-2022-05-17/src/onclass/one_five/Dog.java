package onclass.one_five;

import java.util.Objects;

/**
 * Description:
 * package: onclass <br/>
 * ClassName: Dog <br/>
 * date: 2022-05-17 上午 11:24:23 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Dog{
    /**
     * @Description:
     * @Class: Dog
     */
    private String ID;
    private String name;
    private int age;

    public Dog(String ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(ID, dog.ID) && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, age);
    }
}