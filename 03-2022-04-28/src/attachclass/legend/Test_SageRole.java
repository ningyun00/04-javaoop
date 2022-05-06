package attachclass.legend;

public class Test_SageRole {
    public static void main(String[] args) {
        SageRole sageRole = new SageRole();
        /* 二 */
        sageRole.setLevel(100);//等级100级
        System.out.println(sageRole.getLevel());//等级
        System.out.println(sageRole.getAttack());//等级
        /* 三 */
        SageRole sageRole1 = new SageRole("寜",'女');
        System.out.println(sageRole1.getName());
        System.out.println(sageRole1.getSex());
        /* 四 */
        sageRole.setArms(new String[]{"头盔","项链","护甲","护腕","护膝","鞋子","刀","盾","匕首","弓"});
        sageRole.setArms(new String[]{"头盔","项链","护甲","护腕","护膝","鞋子","刀","盾","匕首","弓","锄头"});
        /* 五 */
        System.out.println(sageRole.death(true));
        /* 六 */
        sageRole.attackOrMining();
        /* 七 */
        sageRole.move();
        sageRole.move("随机");
        /* 八 */
        sageRole.kill(1);
        sageRole.kill("大威天龙",10);
        sageRole.kill("giao");
        sageRole.kill("回城");
    }
}
