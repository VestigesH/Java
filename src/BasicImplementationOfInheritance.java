class Person{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
class Student extends Person{                     //Student类继承了Person类
   //此类没有定义任何的操作方法
}
public class BasicImplementationOfInheritance {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setName("张三");
        stu.setAge(20);
        System.out.println("姓名："+stu.getName()+"年龄："+stu.getAge());
    }
}
