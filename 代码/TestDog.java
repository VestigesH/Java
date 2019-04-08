class Dog {
    private String Name;
    private String Color;
    private int age;
    public Dog(String Name,String Color,int age) {
        this.Name = Name;
        this.Color = Color;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo() {
        return "名字："+this.Name+"\n颜色："+this.Color+"\n年龄："+this.age;
    }
}
public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog("小hi","白色",2);
        System.out.println(dog.getInfo());
    }
}
