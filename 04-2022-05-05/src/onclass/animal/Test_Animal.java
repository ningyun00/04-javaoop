package onclass.animal;

public class Test_Animal {
    public static void main(String[] args) {
        Dog dog = new Dog("小花",20.9);
        dog.eat();
        dog.Bite();
        Frog frog = new Frog("青蛙",20.3);
        frog.eat();
        frog.Swim();
    }
}
