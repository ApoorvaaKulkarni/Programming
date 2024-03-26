public class Shapes {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        double r = 8;
        Circle c1 = new Circle(r);
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());



    }
    public static class shape{


        public double getPerimeter(){
            return getPerimeter();
        }

        public double getArea(){
            return getArea();
        }
    }
    public static class Circle extends shape{
        private double  radius;
        public Circle(double radius){
            this.radius= radius;
        }
        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;

        }

        @Override
        public double getArea() {
            return Math.PI * radius* radius;
        }
    }
}
