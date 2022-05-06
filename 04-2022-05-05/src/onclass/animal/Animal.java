package onclass.animal;

public class Animal {
    private String name;//动物姓名
    private double weight;//动物体重
    public Animal(){}
    public Animal(String name,double weight){this.name = name;this.weight = weight;}
    public void eat(){
        System.out.println("真好吃");
    }
}
