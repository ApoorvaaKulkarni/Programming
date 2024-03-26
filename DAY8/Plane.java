public class Plane {
    public static void main(String[] args) {
        CargoPlanes c = new CargoPlanes();
        System.out.println("Cargo plane: ");
        c.takeoff();
        c.carryCargo();
        c.fly();
        c.land();
        System.out.println("Passenger plane: ");
        PassengerPLanes p = new PassengerPLanes();
        p.carryPassenger();
        p.fly();
        p.land();
        p.takeoff();
        System.out.println("Fighter plane: ");
        FighterPlanes f = new FighterPlanes();
        f.carryWeapons();
        f.fly();
        f.land();
        f.takeoff();

    }

    static class planes{
        void takeoff(){
            System.out.println("plane is taking off");
        }
        void fly(){
            System.out.println("plane is flying");
        }
        void land(){
            System.out.println("plane is landing");
        }
    }
    static class CargoPlanes extends planes{
        @Override
        void fly() {
            System.out.println("Cargo planes fly at low heights");
        }
        void carryCargo(){
            System.out.println("cargo planes carry cargo");
        }
    }
    static class PassengerPLanes extends planes{
        @Override
        void fly() {
            System.out.println("passenger planes fly at medium height");
        }
        void carryPassenger(){
            System.out.println("Passenger plane carries passengers");
        }
    }
    static class FighterPlanes extends planes{
        @Override
        void fly() {
            System.out.println("Fighter planes fly at very great heights");
        }
        void carryWeapons(){
            System.out.println("Fighter planes carry weapons");
        }
    }







}
