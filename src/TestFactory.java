import com.sun.org.apache.xpath.internal.operations.Or;

interface  Fruit{//定义接口
    public void eat();//定义抽象方法
}

class Apple implements Fruit{  //定义接口子类
    public void eat(){         //覆写抽象方法
        System.out.println("吃苹果");
    }
}

class Orange implements Fruit{   //定义接口子类
    public void eat(){           //覆写抽象方法
        System.out.println("吃橘子");
    }
}

class Factory{                //定义工厂类，此类不提供属性
    /**
     * 取得指定类型的接口对象
     * @param className   要取得的类实例化对象标记
     * @return            如果指定标记存在，则返回Fruit接口的实例化对象，否则返回null
     */
    public static Fruit getInstance(String className){
        if("apple".equals(className))        //是否为苹果类
            return new Apple();
        else if("orange".equals(className))   //是否为橘子类
            return new Orange();
        else
            return null;
    }
}

public class TestFactory {
    public static void main(String[] args) {
        Fruit f = Factory.getInstance("orange");      //通过工厂l类取得指定标记的对象
        f.eat();                                //调用接口方法
    }

}
