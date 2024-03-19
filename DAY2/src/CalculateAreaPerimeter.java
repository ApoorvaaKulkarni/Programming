import java.util.Scanner;

public class CalculateAreaPerimeter {
    public static class shape{
        public double Area(){
            return 0;
        }
        public double Perimeter(){
            return 0;
        }
    }
//    calculate area and perimeter of circle

    public static class Circle extends shape{
        public double Radius;
        public  Circle(double Radius){
            this.Radius = Radius;
        }
        @Override
        public double Perimeter() {
            return Math.PI * 2 * Radius;
        }

        @Override
        public double Area() {
            return Math.PI * Radius * Radius;
        }
    }
    public static class Triangle extends shape{
        public double side1 ;
        public double side2 ;
        public double base ;
        public double height ;
        public Triangle(double side1,double side2,double base,double height){
            this.base= base;
            this.side1=side1;
            this.side2= side2;
            this.height= height;
        }

        @Override
        public double Area() {
            return (base * height) / 2;
        }

        @Override
        public double Perimeter() {
            return side1 + side2 + base;
        }
    }
    public static class Rectangle extends shape{
        public double length;
        public double width;
        public Rectangle(double length, double width){
            this.length= length;
            this.width=width;
        }

        @Override
        public double Area() {
            return length * width;

        }

        @Override
        public double Perimeter() {
            return 2 *(length + width);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for radius : ");
        //Circle
        double radius = sc.nextDouble();
        Circle c  = new Circle(radius);
        System.out.println("Area of circle is : "+c.Area()  );
        System.out.println(" Perimeter of a circle is : " + c.Perimeter());
        //Rectangle
        //length
        System.out.print("Enter the value for length : ");
        double length = sc.nextDouble();
        //width
        System.out.print("Enter the value for width : ");
        double width = sc.nextDouble();
        Rectangle r = new Rectangle(length,width);
        System.out.println("Area of Rectangle is : " + r.Area());
        System.out.println("Perimeter of Rectangle is : " + r.Perimeter());


        //Triangle
        System.out.print("Enter the value of side1 : ");
        double side1 = sc.nextDouble();
        System.out.print("Enter the value of side2 : ");
        double side2 = sc.nextDouble();
        System.out.print("Enter the value of base: ");
        double base = sc.nextDouble();
        System.out.print("Enter the value of height: ");
        double height = sc.nextDouble();
        Triangle t = new Triangle(side1, side2,base,height);
        System.out.println("Area of Triangle is : " + r.Area());
        System.out.println("Perimeter of Triangle is : " + r.Perimeter());





    }
}
