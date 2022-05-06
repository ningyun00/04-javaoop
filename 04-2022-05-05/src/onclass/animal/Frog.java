package onclass.animal;

public class Frog extends Animal{
    public Frog(){}
    /**父类构造方法重写*/
    public Frog(String name,double weight){super(name,weight);}
    /**青蛙游泳*/
    public void Swim(){
        System.out.println("洗个澡，真凉快！");
    }
    public void eat(){
        System.out.println("虫子真有味！");
    }
}
