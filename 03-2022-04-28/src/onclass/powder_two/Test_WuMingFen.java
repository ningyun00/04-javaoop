package onclass.powder_two;

public class Test_WuMingFen {
    public static void main(String[] args) {
        WuMingFen wuMingFen = new WuMingFen("牛肉",2,true);
        wuMingFen.check();
        WuMingFen wuMingFen1 = new WuMingFen("牛肉",2);
        wuMingFen1.check();
    }
}
