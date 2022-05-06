package onclass.animalTwo;

public class Test {
    public static void main(String[] args) {
        Chickens chickens = new Chickens("花花", '母', "一对金黄色的翅膀");
        System.out.println(chickens.toString());
        Chickens chickens1 = new Chickens("草草", '公', "一对银黄色的翅膀");
        System.out.println(chickens1.toString());
        Dog dog = new Dog("小白", '公', "一条金白色的尾巴");
        System.out.println(dog.toString());
        Dog dog1 = new Dog("小黄", '母', "一条银白色的尾巴");
        System.out.println(dog1.toString());

    }
}
