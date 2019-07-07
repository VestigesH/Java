class Person2{
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
class Student2 extends Person2{
    private String school;
    public String getSchool() {
        return this.school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
public class ExtendMethodsInSubclasses {
    public static void main(String[] args) {
        Student2 stu = new Student2();
        stu.setName("张三");
        stu.setAge(20);
        stu.setSchool("清华大学");
        System.out.println("姓名："+stu.getAge()+"，年龄："+stu.getAge()+",学校："+stu.getSchool());
    }
}
