package onclass.animalTwo;

public class Dog extends Animal{
    private String weiBa;

    public Dog(String name, char sex,String weiBa) {
        super(name, sex);
        this.weiBa = weiBa;
    }
    public String toString(){return "我是"+name+"我是"+sex+"我有"+weiBa;}
}
