abstract class Action{    //定义一个抽象的行为类
    public static final int EAT = 1;     //定义吃的命令
    public static final int SLEEP  = 5;  //定义睡的命令
    public static final int WORK = 7;    //定义工作的命令

    public void command (int flag){
        switch (flag){
            case EAT:
                this.eat();
                break;
            case SLEEP:
                this.sleep();
                break;
            case WORK:
                this.work();
                break;
        }
    }
    public abstract void eat();
    public abstract void sleep();
    public abstract void work();
}
//定义描述机器人的行为子类
class Robot extends Action{           //定义机器人行为
    public void eat(){                //覆写行为的操作
        System.out.println("机器人补充能量！");
    }
    public void sleep(){              //此操作不需要答案必须覆写，所以方法体为空
    }
    @Override
    public void work() {
        System.out.println("机器人正在努力工作！");
    }
}

//定义人的类
class Human extends Robot{
    public void eat() {
        System.out.println("人类正在吃饭！");
    }
    public void sleep(){
        System.out.println("人类正在休息睡觉！");
    }
    public void work() {
        System.out.println("人正在努力工作！");
    }
}

//定义猪的类
class Pig extends Human{
    public void eat() {
        System.out.println("猪正在吃饭！");
    }
    public void sleep(){
        System.out.println("猪正在睡觉！");
    }
    public void work() {
        //此操作不需要答案必须覆写，所以方法体为空
    }
}

public class TestDemo291 {
    public static void main(String[] args) {
        fun(new Robot());
        fun(new Human());
        fun(new Pig());
    }
     public static void fun(Action act){
        act.command(Action.EAT);
         act.command(Action.SLEEP);
         act.command(Action.WORK);
     }
}
