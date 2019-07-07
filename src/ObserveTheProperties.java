class A{
    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
class B extends A{

}
public class ObserveTheProperties {
    public static void main(String[] args) {
        B b = new B();
        b.setMsg("Hello");
        System.out.println(b.getMsg());
    }
}
