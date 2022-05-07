package onclass.usbport;

/**
 * Description:
 * package: onclass.usbport <br/>
 * ClassName: UDisk <br/>
 * date: 2022-05-07 下午 05:07:25 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class UDisk implements USBPort{
    /**
     * @Description: U盘类
     * @Class: UDisk
     */
    @Override
    public void start() {
        System.out.println("USB与U盘连接成功");
    }

    @Override
    public void end() {
        System.out.println("USB与U盘断开连接");
    }
}
