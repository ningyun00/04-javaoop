package onclass.two;

/**
 * Description:
 * package: onclass.two <br/>
 * ClassName: YellowRiver <br/>
 * date: 2022-05-09 下午 04:15:45 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class YellowRiver extends River {
    /**
     * @Description: 黄河
     * @Class: YellowRiver
     */
    public YellowRiver(int alertWaterLevels, int frontWaterLevel) {
        super(alertWaterLevels, frontWaterLevel);
    }
    @Override
    public void flow() throws Exception {
       if(super.getFrontWaterLevel()-super.getAlertWaterLevels() < 5){
           System.out.println("黄河在流：黄河之水天上来");
       }else{  
           throw new Exception("黄河决堤");
       }
    }
}
/**
 * @topic:
 */