package underclass.calculator;

public class Test_Number {
    public static void main(String[] args) {
        Number number = new Number(0,10);
        System.out.println(number.addition());
        System.out.println(number.subtraction());
        System.out.println(number.multiplication());
        System.out.println(number.division());
    }
}
