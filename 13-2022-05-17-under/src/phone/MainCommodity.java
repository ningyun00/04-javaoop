package phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Description:
 * package: phone <br/>
 * ClassName: MainCommodity <br/>
 * date: 2022-05-17 下午 10:21:25 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class MainCommodity {
    /**
     * @Description:
     * @Class: MainCommodity
     */
    private ArrayList<Commodity> list = new ArrayList<>();

    public MainCommodity() {
        list.add(new Commodity("vivo", "白色", 9999, 24));
        list.add(new Commodity("华为", "黑色", 8888, 14));
        list.add(new Commodity("小米", "红色", 7777, 4));
        list.add(new Commodity("三星", "紫色色", 6666, 44));
    }

    public ArrayList<Commodity> getList() {
        return list;
    }

    public void setList(ArrayList<Commodity> list) {
        this.list = list;
    }

    public static void Exit() {//退出
        System.out.println("退出系统");
        System.exit(0);
    }

    public static void Input(String name, String color, int price, int number) {
        MainCommodity mainCommodity = new MainCommodity();
        mainCommodity.list.add(new Commodity(name, color, price, number));
    }

    public static void remove(String name) {
        MainCommodity mainCommodity = new MainCommodity();
        mainCommodity.list.remove(name);
    }

    public static void main(String[] args) {/**主程序*/
        Scanner scanner = new Scanner(System.in);
        MainCommodity mainCommodity = new MainCommodity();
        while (true) {
            System.out.println("欢迎来到商品库存管理系统，请输入你的选择：");
            System.out.println("1.商品入库");
            System.out.println("2.商品显示");
            System.out.println("3.删除商品");
            System.out.println("4.退出系统");
            int number = scanner.nextInt();
            if (number == 1) {
                System.out.println("是否要录入数据：");
                String yn = scanner.next();
                if ("no".equals(yn)) {
                    return;
                }
                if ("yes".equals(yn)) {
                    System.out.println("请输入手机名称：");
                    String name = scanner.next();
                    System.out.println("请输入手机颜色：");
                    String color = scanner.next();
                    System.out.println("请输入手机价格：");
                    int price = scanner.nextInt();
                    System.out.println("请输入手机库存：");
                    int num = scanner.nextInt();
                    Input(name, color, price, num);
                    System.out.println("录入成功");
                    System.out.println(mainCommodity.getList());
                }
            }
            if (number == 2) {
                System.out.println(mainCommodity.getList());
            }
            if (number == 3) {
                System.out.println("是否要删除数据：");
                String yn = scanner.next();
                if ("no".equals(yn)) {
                    return;
                }
                if ("yes".equals(yn)) {
                    System.out.println("请输入要删除的手机品牌：");
                    String name = scanner.next();
                    remove(name);
                }
            }
            if (number == 4) {
                Exit();
            }
        }
    }
}