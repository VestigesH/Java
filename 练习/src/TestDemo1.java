class Emp1{
    private int empno;
    private String ename;
    private String job;
    private double sal;
    private double comm;

    public Emp1(){
    }

    public Emp1(int eno, String ena, String j, double s, double c){
        empno = eno;
        ename = ena;
        job = j;
        sal = s;
        comm = c;
    }
    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int e) {
        empno = e;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String e) {
        ename = e;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String j) {
        job = j;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double s) {
        sal = s;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double c) {
        comm = c;
    }
    public String getInfo(){
        return  "雇员编号:" + empno + "\n" +
                "雇员姓名:" + ename + "\n" +
                "雇员职位:" + job + "\n" +
                "基本工资:" + sal + "\n" +
                "佣金:" + comm ;
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        Emp1 e = new Emp1(1234,"SMITH", "CLERK",800.0,1.0);
        System.out.println(e.getInfo());
    }
}
