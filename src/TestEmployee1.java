import com.sun.corba.se.spi.orbutil.threadpool.Work;

class Employee1{
    private String name;
    private int age;
    private char sex;
    public Employee1(){

    }
    public Employee1(String name,int age,char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
    public String printf() {
        return "姓名："+this.name +"\n年龄："+ this.age +"\n性别："+ this.sex;
    }
}
class Manage extends Employee1{
    private String duty;
    private int Ysalary;
    public Manage() {

    }
    public Manage(String name,int age,char sex,String duty,int Ysalsry){
        super(name,age,sex);
        this.duty = duty;
        this.Ysalary = Ysalsry;
    }
    public String printf(){
        return super.printf()+"\n职务："+ this.duty +"\n年薪"+ Ysalary;
    }
}
class Worker extends Employee1{
    private String department;
    private int Msalary;
    public Worker() {

    }
    public Worker(String name,int age,char sex,String department,int Msalary){
        super(name,age,sex);
        this.department = department;
        this.Msalary = Msalary;
    }
    public String printf(){
        return super.printf()+"\n所属部门："+this.department +"\n月薪："+ this.Msalary;
    }
}
public class TestEmployee1 {
    public static void main(String[] args) {
        Manage m = new Manage("小李",28,'女',"白领",200000);
        Worker w = new Worker("小王",26,'女',"销售部",6500);
        System.out.println(m.printf());
        System.out.println(w.printf());
    }
}
