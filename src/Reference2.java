class Message1{
    private String info = "此内容无用";
    public Message1(String info){
        this.info = info;
    }
    public void setInfo(String info){
        this.info = info;
    }
    public String getInfo(){
        return this.info;
    }
}
public class Reference2 {
    public static void main(String[] args) {
        Message1 msg = new Message1("Hello");
        fun(msg);
        System.out.println(msg.getInfo());
    }
    public static void fun(Message1 temp){
        temp.setInfo("World");
    }
}
