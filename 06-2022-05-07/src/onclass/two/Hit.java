package onclass.two;

/**
 * Description:
 * package: onclass.two <br/>
 * ClassName: Hit <br/>
 * date: 2022-05-07 下午 04:52:28 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public interface Hit {
    /**
     * @Description: 打人接口
     * @Interface: Hit
     */
    /*2.写一个接口，具有打人的行为能力，
肥肥和瘦瘦两类人都具有打人的能力，肥肥打人很痛，瘦瘦打人一点都不痛，
用多态去调用打人的行为能力，分别实例肥肥和瘦瘦打人。
提示：
1）创建打人接口，提供打人的抽象方法
2）创建肥肥和瘦瘦两个类，实现打人接口，重写打人行为
3）创建测试类：用接口引用 指向 子类实例，调用打人的方*/
    void hit();
}
