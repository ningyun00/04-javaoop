package onclass.instrument;

/**
 * 乐器类
 * @author 寜
 */
public class Instrument {
    public void play(){
        System.out.println("乐器在弹奏");
    }
}
/*1.请编码实现如下需求：
乐器（Instrument）分为：钢琴(Piano)、小提琴(Violin) -------需要使用继承
各种乐器的弹奏（ play ）方法各不相同。
乐器类的 play 方法，输出内容为”乐器在弹奏”
钢琴类 play 方法输出的容为”叮叮叮……”，
小提琴 play 输出的内容为”哒哒哒…..”
编写一个玩乐器的类 PlayInstrument，要求：
编写方法 testPlay，对各种乐器进行弹奏测试。要依据乐器的不同，进行相应的弹奏。
注意此方法需要用多态实现，此方法可以测试弹奏各种乐器
编写测试类 Test1 在 main 方法中分别进行三种乐器的弹奏输出内容*/