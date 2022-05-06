package onclass.animalTwo;

public class Chickens extends Animal {
    private String chiBang;//鸡翅膀
    public Chickens(String name,char sex,String chiBang){super(name,sex);this.chiBang = chiBang;}
    public String toString(){return "我是"+name+"我是"+sex+"我有"+chiBang;}
}
