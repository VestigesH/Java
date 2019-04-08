interface ClassName {
    public String getClassName();
}
class Company implements ClassName{
    public String getClassName(){
        return "Company";
    }
}
public class ClassNameInterface {
    public static void main(String[] args) {
        ClassName cn = new Company() ;
        System.out.println(cn.getClassName());
    }
}
