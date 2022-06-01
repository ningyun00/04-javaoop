package onclass;

import java.util.*;

public class Four {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("2014", "德国");
        map.put("2010", "西班牙");
        map.put("2006", "意大利");
        map.put("2002", "巴西");
        Iterator iterator = map.values().iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for(Map.Entry<String,String> entry:entrySet){
            System.out.print(entry.getKey()+"-");
            System.out.println(entry.getValue());
        }
    }
}
