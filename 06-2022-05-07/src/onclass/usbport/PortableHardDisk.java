package onclass.usbport;

/**
 * Description:
 * package: onclass.usbport <br/>
 * ClassName: PortableHardDisk <br/>
 * date: 2022-05-07 下午 05:09:33 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class PortableHardDisk implements USBPort{
    /**
     * @Description: 移动硬盘类
     * @Class: PortableHardDisk
     */
    @Override
    public void start() {
        System.out.println("USB与移动硬盘连接成功");
    }

    @Override
    public void end() {
        System.out.println("USB与移动硬盘断开连接");
    }
}
