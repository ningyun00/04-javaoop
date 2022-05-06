package underclass.traffic;

public class Test_Vehicles {
    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles("奔驰", "红色");
        vehicles.run();
        vehicles.showInfo();
    }
}
