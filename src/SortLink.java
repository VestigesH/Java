//在一个列表中存储以下元素：apple,grape,banana,pear 将集合进行排序，并将排序后的结果打印在控制台上
import java.util.Collections;
import java.util.LinkedList;
public class SortLink {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<>();
        link.add("apple");
        link.add("grape");
        link.add("banana");
        link.add("pear");

        Collections.sort(link);
        for(String s:link){
            System.out.println(s);
        }
    }
}
