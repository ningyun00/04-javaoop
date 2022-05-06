package onclass.computer;

public class Computer {
    /*2、写一个电脑的类，类中没有属性，有方法：
    1.首先调用计算阶乘的方法，传入一个 5，看输出结果是否是 120。
    2.再调用找最大值的方法，传入 7,9,1，接收返回值后输出来看看是否是 9
    3.准备数组{4，5，6，7，9}找最大值。*/
    /**
     * (一)有参，无返回方法：要求传入一个整数计算出阶乘后，输出结果。如：传入 5，结果为：1*2*3*4*5=120
     */
    public void Product(int number){
        int sum = 1;
        for (int i = 1; i <= number ; i++) {
           sum *= i;
        }
        System.out.println(sum);
    }

    /**
     * （二）有参，有返回方法：找最大值的方法。要求传入三个整数，找出最大的整数并返回。
     */
    public int Max_int(int numOne, int numTwo, int numThree) {
        int max1 = Math.max(numOne,numTwo);
        int max2 = Math.max(max1,numThree);
        return max2;
    }

    /**
     * （三）一个整型数组中找最大值的方法，要求传入一个整形数组，返回这个数组中的最大值写一个测试类，生成一台电脑.
     */
    public int Max_array(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }
}
