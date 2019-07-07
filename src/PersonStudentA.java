class Person{
    private String name;
    private String address;
    private char sex;
    private int age;
    public Person(){
    }

    public Person(String name,String address,char sex,int age){
        super();
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String printf(){
        return "姓名："+ this.name + "\n地址："+ this.address +"\n性别："+ this.sex + "\n年龄："+this.age;
    }
}
class Student extends Person{
    private double math;
    private double english;
    public Student(){

    }
    public Student(double math,double english){
        this.math = math;
        this.english = english;
    }
    public Student(String name,String address,char sex,int age,double math,double english) {
        super(name,address,sex,age);
        this.math = math;
        this.english = english;
    }
    public String printf(){
        return super.printf()+"\n数学成绩："+this.math + "\n英语成绩："+ this.english;
    }
}
public class PersonStudentA {
    public static void main(String[] args) {
        Student stu = new Student("小李","西邮",'男',20,99.0,98.0);
        System.out.println(stu.printf());
    }
}
