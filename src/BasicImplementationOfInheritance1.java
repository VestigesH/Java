class Person1{
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
class Student1 extends Person1{

}
public class BasicImplementationOfInheritance1 {
    public static void main(String[] args) {
        Student1 stu = new Student1();
        stu.setName("张三");
        stu.setAge(20);
        System.out.println("姓名："+stu.getName()+",年龄："+stu.getAge());
    }
}
