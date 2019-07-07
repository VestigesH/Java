abstract class Shape{
    public abstract double area();
    public abstract double perimeter();
}
class Rectangle extends Shape{//矩形
    private double longs;//长
    private double wide;//宽
    public Rectangle(){
    }

    public Rectangle(double longs,double wide){
        this.longs = longs;
        this.wide = wide;
    }
    public double area(){
        return this.longs * this.wide;
    }
    public double perimeter(){
        return (this.longs + this.wide) * 2;
    }
}
class Triangle extends Shape{//三角形
    private double side1;//边长
    private double side2;
    private double side3;
    public Triangle(){
    }
    public Triangle(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double area(){
        double s = (this.side1 + this.side2 + this.side3) / 2.0;
        return Math.pow(s * (s - this.side1) * (s - this.side2) *(s - this.side3),0.5);
    }
    public  double perimeter(){
        return this.side1 + this.side2 + this.side3;
    }
}
class Circle extends Shape{//圆
    private double radius;//半径
    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return this.radius * this.radius * Math.PI;
    }

    public double perimeter(){
        return this.radius * 2 * Math.PI;
    }

}
public class TestShape {
    public static void main(String[] args) {
        Shape r = new Rectangle(3,4);
        Shape t = new Triangle(6.0,6.0,6.0);
        Shape c = new Circle(3);
        System.out.println("矩形的面积为：" + r.area() + "\t矩形的周长为：" + r.perimeter());
        System.out.println("三角形面积为：" + t.area() + "\t三角形的周长为：" + t.perimeter());
        System.out.println("圆的面积为：" + c.area() + "\t圆的周长为：" + c.perimeter());
    }
}
