//在类设计结构中使用枚举
package com.yootk.demo;
enum Sex{
    MALE("男"), FEMALE("女");
    private String title;
    private Sex(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
class Member{
    private String name;
    private int age;
    private Sex sex;
    public Member(String name, int age, Sex sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "姓名：" + this.name + "年龄：" + this.age + "性别：" + this.sex;
    }
}
public class UseEnum2 {
    public static void main(String[] args) {
        System.out.println(new Member("李兴华",36, Sex.MALE));
    }
}
