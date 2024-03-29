public class Vehicle {
    public static void main(String[] args) {
        Car c = new Car();
        vehicles b = new Bicycle();
        vehicles v = new vehicles();
        c.speedUp();
        b.speedUp();
        v.speedUp();

    }
    public static class vehicles{
        public void speedUp(){
            System.out.println("moves speedly");
        }
    }
    public static class Car extends vehicles{
        @Override
        public void speedUp() {
            System.out.println("Speed is fast");
        }
    }
    public static class Bicycle extends vehicles{
        @Override
        public void speedUp() {
            System.out.println("speed is slow");
        }
    }
}
