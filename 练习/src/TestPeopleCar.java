class Member1{
    private int mid;
    private String name;
    private Car1 car;
    public Member1(int mid, String name ){
        this.mid = mid;
        this.name = name;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car1 getCar() {
        return car;
    }

    public void setCar(Car1 car) {
        this.car = car;
    }
    public String getInfo(){
        return "人员编号：" + this.mid + ",姓名:" + this.name;
    }
}
class Car1{
   private Member1 member;
   private String pname;
   public Car1(String pname){
       this.pname = pname;
   }

    public Member1 getMember() {
        return member;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setMember(Member1 member) {
        this.member = member;

    }
    public String  getInfo(){
       return "车的名字：" + this.pname ;
    }
}
public class TestPeopleCar {
    public static void main(String[] args) {
        Member1 m = new Member1(1,"李兴华");
        Car1 c = new Car1("八手奥拓 100");
        m.setCar(c);
        c.setMember(m);
        System.out.println(m.getCar().getInfo());
        System.out.println(c.getMember().getInfo());
    }
}
