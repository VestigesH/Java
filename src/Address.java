class Address1{
    String Country;
    String province;
    String City;
    String Street;
    String ZipCode;
    public void getInfo() {
        System.out.println("国家："+ Country + "\n省份："+ province +"\n城市："+ City +"\n街道："+ Street +"\n邮编："+ZipCode);
    }
}
public class Address {
    public static void main(String[] args) {
        Address1 ad = new Address1();
        ad.Country = "中国";
        ad.province = "陕西";
        ad.City = "渭南";
        ad.Street = "杜化街道";
        ad.ZipCode = "714000";
        ad.getInfo();
    }
}
