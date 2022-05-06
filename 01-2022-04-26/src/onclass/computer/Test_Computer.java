package onclass.computer;

public class Test_Computer {
    public static void main(String [] args){
        Computer pc = new Computer();
        pc.Product(5);
        System.out.println(pc.Max_int(5, 2, 3));
        int [] array = {4,5,6,7,8,9};
        System.out.println(pc.Max_array(array));
    }
}
