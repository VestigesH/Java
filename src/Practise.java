interface Fruit1{
    public void eat();
}
class Banana implements Fruit1{
    @Override
    public void eat() {
        System.out.println("吃香蕉");
    }
}
class Pear implements Fruit1{
    @Override
    public void eat() {
        System.out.println("吃梨子");
    }
}
class Factory1{
    public static Fruit1 getInstance(String className){
        if ("banana".equals(className))
            return new Banana();
        else if("pear".equals(className))
            return new Pear();
        else
            return null;
    }
}
public class Practise {
    public static void main(String[] args) {
        Fruit1 f = Factory1.getInstance("banana");
        f.eat();
    }
}
