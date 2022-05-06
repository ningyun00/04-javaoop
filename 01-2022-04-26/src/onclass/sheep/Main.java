package onclass.sheep;

public class Main {
    /*3、有一天，一只名叫“灰太狼”的狼看到一只名叫“喜羊羊”的羊在吃草，飞快的跑过去
抓羊，抓到羊后，把“喜羊羊”带回家去和“红太狼”一起吃羊，真好吃。
使用面向对象的方式描述这个故事。
提示：
（一）首先找这个故事中的对象。有“喜羊羊”，“灰太狼”，“红太狼”。
（二）由于“灰太狼”和“红太狼”都叫狼，并都爱吃羊，所以归为一个“狼”的类。
而“喜羊羊”是吃草的，并被“狼”吃了，归为一个“羊”类。
（三）开始找“狼”类的特征，看到“叫灰太狼，叫红太狼”，想到一个属性：姓名。
看到“飞快的跑过去抓羊”，得到了一个方法，又看到“带回家去和‘红太狼’一起吃羊”，
又得到一个方法。
（四）开始找“羊” 类 的特征，看到“名叫‘喜羊羊’”就找到了一个 属性：姓名。
看到“羊在吃草”就找到一个 方法 。看到“抓到羊后，把‘喜羊羊’带回家”找到一个被狼
抓的方法。
（五）再写一个测试类，生成一只“灰太狼”和一只“红太狼”，再生成一只“喜羊羊”，使
用方法的调用将这个故事连接起来*/
    public static class wolf{//狼类
        public String RedWolf;//红太狼
        public String GrayWolf;//灰太狼
        public String CatchSheep(){//抓羊
            return "飞快的跑过去抓羊";
        }
        public String GoHome(){//抓羊回家
            return "带回家去和"+RedWolf+"一起吃羊";
        }
    }
    public static class sheep{//羊类
        public String HappySheep;//喜羊羊名
        public String Graze(){//羊吃草
            return "羊在吃草";
        }
        public String CHsheep(){//抓羊回家
            return "抓到羊后，把"+HappySheep+"带回家";
        }
    }
}
