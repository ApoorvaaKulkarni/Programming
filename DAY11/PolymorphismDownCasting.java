public class PolymorphismDownCasting {

    public static class planes{
        int j;
        void display(){
            System.out.println(j);
        }
        public void fly(){
            System.out.println("plane is flying");
        }
    }
    public static class cargoPlane extends planes{
        int i;
        void display(){
            System.out.println(i);
        }
        @Override
        public void fly() {
            System.out.println("flies at low heights");
        }
        public void cargo(){
            System.out.println("carries cargo");
        }
    }
    public static class passengerPLane extends planes{
        @Override
        public void fly() {
            System.out.println("flies at medium heights");
        }
    }

    public static void main(String[] args) {
        cargoPlane cp = new cargoPlane();
        passengerPLane p = new passengerPLane();
        cp.i=1;
        cp.j=2;
        cp.display();
//        planes ref;
//        ref =cp;
//        ref.fly();
//        ((cargoPlane) ref).cargo();
//        ref = p;
//        ref.fly();

    }


}