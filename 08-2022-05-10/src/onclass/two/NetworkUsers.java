package onclass.two;

/**
 * Description:
 * package: onclass.two <br/>
 * ClassName: NetworkUsers <br/>
 * date: 2022-05-10 下午 03:51:25 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class NetworkUsers {
    /**
     * @Description: 网络用户类
     * @Class: NetworkUsers
     */
    private String name;//用户名
    private String PassWord;//用户密码
    private String email;//用户邮箱

    public void userName(String UserName, String PassWord) {
        this.name = UserName;
        if (PassWord != null) {
            this.PassWord = PassWord;
        } else {
            this.PassWord = "8888";
        }
    }

    public void userName(String UserName) {
        this.name = UserName;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassWord() {
        return PassWord;
    }
}
/**
 * @topic:2、 定义一个网络用户类，要处理的信息有 userName、password、email。提供一
 * 个构造方法，把 userName、password 作为构造方法的参数传入，如果 password
 * 为空，则给出默认值8888。重载第二个构造方法，该方法只需要传入userName
 * 即可。对 password 和 email，要提供 setXXX()方法。另外给出所有成员变量
 * 的 getXXX()方法
 */