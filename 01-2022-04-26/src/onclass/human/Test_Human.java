package onclass.human;

public class Test_Human {
    public static void main(String[] args) {
        Human people = new Human();
        people.name = "小红";
        people.age = 38;
        people.Running();
        System.out.print(people.toString());
    }
}
