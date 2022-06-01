package onclass;

import java.util.ArrayList;
import java.util.List;

public class One {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("第1个是语文");
        list.add("第2个是数学");
        list.add("第3个是英语");
        list.add("第4个是化学");
        list.add("第5个是生物");
        list.add("第6个是物理");
        System.out.println("列表中的元素个数为："+list.size());
        for(Object object: list){
            System.out.println(object);
        }
    }
}
