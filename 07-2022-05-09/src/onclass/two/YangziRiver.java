package onclass.two;

/**
 * Description:
 * package: onclass.two <br/>
 * ClassName: YangziRiver <br/>
 * date: 2022-05-09 下午 04:17:12 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class YangziRiver extends River{
    /**
     * @Description: 长江
     * @Class: YangziRiver
     */
    public YangziRiver(int alertWaterLevels, int frontWaterLevel) {
        super(alertWaterLevels, frontWaterLevel);
    }
    @Override
    public void flow()throws Exception{
       if(super.getFrontWaterLevel()-super.getAlertWaterLevels() < 9){
           System.out.println("长江在流：孤帆远影碧空尽，惟见长江天际流");
       }else{
           throw new Exception("长江决堤");
       }
    }
}
/**
 * @topic:
 */