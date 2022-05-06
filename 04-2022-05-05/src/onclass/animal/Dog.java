package onclass.animal;

public class Dog extends Animal {
    public Dog(){}
    /**父类构造方法重写*/
    public Dog(String name,double weight){super(name,weight);}
    /**狗咬人*/
    public void Bite() {
        System.out.println("惹我咯，咬死你！");
    }
    /**方法重写*/
    public void eat(){
        System.out.println("肉真好吃");
    }
}
