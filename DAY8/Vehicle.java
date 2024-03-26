public  class Vehicle {
    public void drive() {
        System.out.println("drive");

    }

    public static class car extends Vehicle {
        @Override
        public void drive() {
            System.out.println("Repairing a car");
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        car c = new car();
        c.drive();

    }
}
