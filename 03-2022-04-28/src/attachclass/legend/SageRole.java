package attachclass.legend;
import java.util.Random;

public class SageRole {
    /**重载*/
    public SageRole(){}
    /*一、编写传奇角色类，拥有属性：等级(level)、装备（数组 arms）、物理攻击力(attack)、角色名(name)、性别(sex)。编写toString()方法，用来打印出角色的信息。*/
    /**等级*/
    private int level;
    /**装备*/
    private String [] arms;
    /**物理攻击*/
    private double attack;
    /**角色名*/
    private String name;
    /**性别*/
    private char sex;
    /**角色信息*/
    public void ToString() {
        System.out.println("等级为" + this.level + "级" + this.sex + "战士:目空一切");
    }

    /*二、等级属性可设置，可以查看，请为等级属性编写get/set方法。物理攻击属性只能查看，不可修改，请为物理攻击编写get方法。*/
    /**设置等级*/
    public void setLevel(int level) {this.level = level;}
    /**获取等级*/
    public int getLevel() {return level;}
    /**获取物理攻击*/
    public double getAttack() {return attack;}

    /*三、由于性别和角色名是新建角色时指定的，请编写构造函数，初始化角色名和性别。同时，性别和角色名能被其它玩家看见，请为性别和角色名编写get方法。*/
    /**设置姓名和性别*/
    public SageRole(String name,char sex){this.name = name;this.sex = sex;}
    /**获取姓名*/
    public String getName() {return name;}
    /**获取性别*/
    public char getSex() {return sex;}

    /*四、由于装备是个人私有的，并且装备件数不能超过10件，请编写方法为角色增加装备，保证装备不会超过指定件数。*/
    /**穿装备*/
    public void setArms(String[] arms) {
        if (arms.length <= 10) {
            this.arms = arms;
        }else{
            System.out.println("无法在穿戴装备！");
        }
    }

    /*五、如果玩家被其它玩家杀死，装备可能会随机掉落。请编写death方法，此方法有返回值，返回掉落的物品名。
	注意：如果角色没有装备，则不可能掉落装备。如果随机的装备不存在，则再次随机，直到有装备掉落为止。*/
    Random random = new Random();
    /**被击杀掉落装备*/
    public String death(boolean kill){
        String equip = null;
        if (this.arms.length >= 0 && kill) {//有装备 被击杀
            do {
                int rd = random.nextInt(11);
                if (rd<=this.arms.length){
                    equip = "掉落装备："+this.arms[rd];
                }
            } while (equip==null);
        } else {
            equip = "该玩家未穿戴装备";
        }
        return equip;
    }

    /*六、在游戏中，如果你拿的是刀，攻击操作就成为杀怪或杀人；但如果你的拿是的锄头，攻击。编写攻击的方法，循环装备数组，如果发现装备是刀，则打印出杀人。如果装备是锄头，则挖矿。*/
    /**攻击或挖矿*/
    public void attackOrMining(){
        for (int i = 0; i <this.arms.length; i++) {
            if (this.arms[i] == "刀"){
                System.out.println("您现在装备的是刀，开始杀人");
            }else if (this.arms[i] == "锄头"){
                System.out.println("您现在装备的是锄头，开始挖矿");
            }
        }
    }

    /*七、编写move方法，此方法表示人物的移动。人物移动有几种方式：一、跑动 二、随机 三、回城。如果方法没有接收参数，人物则跑动，如果方法接收了随机，则人物随机移动，如果方法接收了回城，则返回新手村。请用方法重载来实现这个方法。*/
    /**简单移动*/
    public void move(){
        System.out.println("角色跑动中");
    }
    /**指定移动*/
    public void move(String run){
        if(run.equals("跑步")){
            System.out.println("角色跑动中");
        }
        if(run.equals("随机")){
            System.out.println("角色移动到地下城");
        }
        if(run.equals("回城")){
            System.out.println("角色移动到新手村");
        }
    }

    /*八、编写杀人kill方法，此方法表示杀人的过程。杀人过程中可以：1.普通砍人 2.暴击 3.使用技能 4.打不赢就跑。如果没有传参数则是普通砍人，伤害为物理攻击力的大小；如果接收一个随机类（随机范围为2-5），则是暴击倍数，为物理攻击乘以倍数；如果传入的是一个字符串的技能名和该技能的伤害点数，则为物理攻击加上该技能的伤害点数；如果传入的是回城，则是逃跑回城。*/
    /**玩家杀人*/
    public void kill(){
        System.out.println("您进行了 普通 攻击。伤害为："+this.attack);
    }
    /**随机杀人*/
    public void kill(int rd){
        if (2<=rd && rd<=5){
            System.out.println("您进行了 随机 攻击。伤害为："+(this.attack*rd));
        }else{
            System.out.println("miss");
        }
    }
    /**技能伤害*/
    public void kill(String skill,double rd){
        System.out.println("您使用了"+skill+"技能攻击。伤害为："+(this.attack+rd));
    }
    /**逃跑*/
    public void kill(String run){
       if (run.equals("回城")){
           System.out.println("逃跑中");
       }else{
           System.out.println("逃跑失败");
       }
    }
}
