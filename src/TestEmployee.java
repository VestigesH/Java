class Employee {
    private int Num;
    private String Name;
    private int Salary;
    private int increaseSalary;
    private int sumSalary;
    public Employee(int Num,String Name,int Salary,int increaseSalary,int sumSalary) {
        this.Num = Num;
        this.Name = Name;
        this.Salary = Salary;
        this.increaseSalary = increaseSalary;
        this.sumSalary = increaseSalary + Salary;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int num) {
        Num = num;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getIncreaseSalary() {
        return increaseSalary;
    }

    public void setIncreaseSalary(int increaseSalary) {
        this.increaseSalary = increaseSalary;
    }
    public String getInfo() {
        return "编号："+ this.Num +"\n姓名："+this.Name +"\n基本薪水："+ this.Salary +"\n薪水增长额："+ this.increaseSalary +"\n工资总额："+ (this.Salary +this.increaseSalary);
    }
}
public class TestEmployee {
    public static void main(String[] args) {
        Employee ep = new Employee(123,"小李",3000,1000,4000);
        System.out.println(ep.getInfo());
    }
}
