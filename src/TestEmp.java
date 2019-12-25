//this的使用(this() 调用构造方法，解决了构造方法中重复代码的问题)
class Emp2{
    private int empno;
    private String ename;
    private double sal;
    private String dept;

    public Emp2(){                                                  //调用四参构造
        this(0, "无名氏", 0.0, "未定");
    }
    public Emp2(int empno){                                         //调用四参构造
        this(empno,"临时工",800.0,"后勤部");
    }
    public Emp2(int empno,String ename){                            //调用四参构造
        this(empno,ename,2000.0,"技术部");
    }
    public Emp2(int empno,String ename,double sal,String dept){
        this.empno = empno;
        this.ename = ename;
        this.sal = sal;
        this.dept = dept;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getInfo(){
        return "雇员编号：" + this.empno + ", 姓名："  + this.ename + ", 工资：" + this.sal + ", 部门：" + this.dept;
    }
}
public class TestEmp {
    public static void main(String[] args) {
        Emp2 ea = new Emp2();
        Emp2 eb = new Emp2(2345);
        Emp2 ec = new Emp2(1233,"Bllea");
        Emp2 ed = new Emp2(2321,"DAsse",5000.0,"财务部");
        System.out.println(ea.getInfo());
        System.out.println(eb.getInfo());
        System.out.println(ec.getInfo());
        System.out.println(ed.getInfo());
    }
}
