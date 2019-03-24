class Member{
    private int mid;
    private String name;
    private Car car;
    private Member child;
    public Member(int mid,String name){
        this.mid = mid;
        this.name = name;
    }
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    public Member getChild() {
        return child;
    }
    public void setChild(Member child) {
        this.child = child;
    }
    public String getInfo(){
        return "人员编号："+this.mid+",姓名："+ this.name;
    }
}
class Car{
    private Member member;
    private String pname;
    public Car(String pname){
        this.pname = pname;
    }
    public Member getMember() {
        return member;
    }
    public void setMember(Member member) {
        this.member = member;
    }
    public String getInfo(){
        return "车的名字"+this.pname;
    }
}
public class Test3 {
    public static void main(String[] args) {
        Member m = new Member(1,"李兴华");
        Member chd = new Member(2,"李闯");
        Car c = new Car ("八手奥拓 100");
        Car cc = new Car("法拉利 M9");
        m.setCar(c);
        c.setMember(m);
        chd.setCar(cc);
        cc.setMember(chd);
        m.setChild(chd);
        System.out.println(m.getCar().getInfo());
        System.out.println(c.getMember().getInfo());
        System.out.println(m.getChild().getInfo());
        System.out.println(m.getChild().getCar().getInfo());
    }
}
