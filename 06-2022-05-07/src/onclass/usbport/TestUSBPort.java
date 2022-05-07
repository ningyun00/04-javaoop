package onclass.usbport;

/**
 * Description:
 * package: onclass.usbport <br/>
 * ClassName: TestUSBPort <br/>
 * date: 2022-05-07 下午 05:11:04 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class TestUSBPort {
    /**
     * @Description: 测试类
     * @Class: TestUSBPort
     */
    public static void main(String[] args) {
        USBPort uUDisk = new UDisk();
        uUDisk.start();
        USBPort uPortableHardDisk = new PortableHardDisk();
        uPortableHardDisk.start();
        uUDisk.end();
        uPortableHardDisk.end();
    }
}
