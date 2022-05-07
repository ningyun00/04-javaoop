package underclass.two;

/**
 * Description:
 * package: underclass.two <br/>
 * ClassName: Money <br/>
 * date: 2022-05-09 下午 04:54:29 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Money {
    /**
     * @Description: 取钱类
     * @Class: Money
     */
    private int Money;//钱
    public void setMoney(int money) {
        this.Money = money;
    }

    public int getMoney() {
        return Money;
    }

    public void withdrawMoney(int money) {
        if (this.Money > money) {
            this.Money = this.Money - money;
            System.out.println("本次取钱:"+money+"\n余额:"+this.Money);
        } else {
            throw new NoMoneyException("你没有这莫多存款");
        }
    }
}
/**
 * @topic: 2.写一个取钱的方法, 如果取的钱比帐户的金额多, 就抛出一个自定义的 NoMoneyException
 * 异常,抛出去的时候声明一下我有异常抛出，调用者你要捕获它啊,如果够取,就减去相应的
 * 金额,打印剩余金额
 */