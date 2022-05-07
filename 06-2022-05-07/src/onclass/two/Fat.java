package onclass.two;

/**
 * Description:
 * package: onclass.two <br/>
 * ClassName: Fat <br/>
 * date: 2022-05-07 下午 04:55:26 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Fat implements Hit{
    /**
     * @Description: 胖子类 接口Hit
     * @Class: Fat
     */
    @Override
    public void hit() {
        /**
         * @description: 打人方法 重构接口
         * @method: hit
         * @methodParameterTypes: []
         * @methodRetruenTypes: void
         */
        System.out.println("肥肥打人很痛");
    }
}
