package onclass.sheep;

public class Test_Sheep {
    public static void main(String[] args) {
//        Main main = new Main();
        Main.wolf wolf = new Main.wolf();
        wolf.RedWolf = "红太狼";
        wolf.GrayWolf = "灰太狼";
        Main.sheep sheep = new Main.sheep();
        sheep.HappySheep = "喜羊羊";
        System.out.println("有一天，一只名叫"+wolf.GrayWolf+"的狼看到一只名叫"+sheep.HappySheep+"的"+sheep.Graze()+wolf.CatchSheep()+wolf.GoHome()+"，"+sheep.CHsheep()+"去和"+wolf.RedWolf+"一起吃羊，真好吃。");
    }
}
