class Node1{
    private String data;
    private Node1 next;
    public Node1(String data){
        this.data=data;
    }
    public void setNext(Node1 next){
        this.next = next;
    }
    public Node1 getNext(){
        return this.next;
    }
    public void setData(String data){
        this.data = data;
    }
    public String getData(){
        return this.data;
    }
}
public class DefineNodeClass {
    public static void main(String args[]){
        Node1 root = new Node1("火车头");
        Node1 n1 = new Node1("车厢A");
        Node1 n2 = new Node1("车厢B");
        root.setNext(n1);
        n1.setNext(n2);
        Node1 currentNode1 = root;
        while(currentNode1 != null){
            System.out.println(currentNode1.getData());
            currentNode1 = currentNode1.getNext();
        }
    }
}
