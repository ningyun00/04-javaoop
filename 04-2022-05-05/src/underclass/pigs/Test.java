package underclass.pigs;

public class Test {
    public static void main(String[] args) {
        WritePig writePig = new WritePig("白", 100);
        BlackPig blackPig = new BlackPig("黑", 50);
        System.out.println(writePig.getColor());
        System.out.println(writePig.attack());
        System.out.println(blackPig.getColor());
        System.out.println(blackPig.attack());

    }

}
