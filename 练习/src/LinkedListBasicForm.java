class Node2{
    private String data;
    private Node2 next;
    public Node2 (String data){
        this.data = data;
    }
    public void setNext(Node2 next){
        this.next = next;
    }
    public Node2 getNext(){
        return this.next;
    }
    public String getData(){
        return this.data;
    }
    public void addNode2(Node2 newNode2 ){
        if(this.next == null){
            this.next =newNode2;                   //保存新节点
        }
        else{                                       //当前节点之后还有节点
            this.next.addNode2(newNode2);           //当前节点的下一节点继续保存
        }
    }
    public void printNode2(){
        System.out.println(this.data);
        if(this.next != null){
            this.next.printNode2();
        }
    }
}
class Link{
    private Node2 root;
    public void add(String data){
        Node2 newNode2 = new Node2(data);
        if(this.root == null){
            this.root = newNode2;
        }else{
            this.root.addNode2(newNode2);
        }
    }
    public void print(){
        if(this.root != null){
            this.root.printNode2();
        }
    }
}
public class LinkedListBasicForm {
    public static void main(String args[]){
        Link link = new Link();
        link.add("Hello");
        link.add("MLDN");
        link.add("YOOTK");
        link.add("李兴华");
        link.print();
    }
}
