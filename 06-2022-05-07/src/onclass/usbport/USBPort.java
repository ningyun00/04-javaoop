package onclass.usbport;

/**
 * Description:
 * package: onclass.usbport <br/>
 * ClassName: USBPort <br/>
 * date: 2022-05-07 下午 05:04:25 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public interface USBPort {
    /**
     * @Description: USB 接口
     * @Interface: USBPort
     */
   void start();//开始
   void end();//结束
}
/*3.接口和多态
1、编写 USB 接口，USB 接口有启动和停止二个方法
2、编写 U 盘类，实现 USB 接口
3、编写移动硬盘类，实现 USB 接口
4、编写电脑类，电脑提供一个 test 方法（参数可传入 U 盘和移动硬盘），在 test 方法中
调用其启动和停止方法*/