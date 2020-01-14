class Node{
    private String data;
    private Node next;
    public Node(String data){
        this.data=data;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public Node getNext(){
        return this.next;
    }
    public void setData(String data){
        this.data = data;
    }
    public String getData(){
        return this.data;
    }
}
public class RecurrenceOutputLinkedListData {
    public static void main(String args[]){
        Node root = new Node("火车头");
        Node n1 = new Node("车厢A");
        Node n2 = new Node("车厢B");
        root.setNext(n1);
        n1.setNext(n2);
        print(root);
    }
    public static void print(Node current){
        if(current == null){
            return;
        }
        System.out.println(current.getData());
        print(current.getNext());
    }
}
