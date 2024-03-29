public class CodeReusability {
    public static void main(String[] args) {
        cargoPlane cp = new cargoPlane();
        passengerPlane p = new passengerPlane();
        Airport a = new Airport();
        a.permit(cp);
        a.permit(p);
    }

    public static class planes{
        public void fly(){
            System.out.println("flies");
        }
        public void land(){
            System.out.println("lands");
        }

    }
    public static class cargoPlane extends planes{
        @Override
        public void fly() {
            System.out.println("flies at low height");
        }
        public void cargoCarries(){
            System.out.println("Carries cargo");
        }
    }
    public static class passengerPlane extends planes{
        @Override
        public void fly() {
            System.out.println("flies at meduim heights");
        }
        public void PassengerCarries(){
            System.out.println("Carries passengers");
        }
    }
    public static class Airport{
        public void permit(planes ref){
            ref.fly();
            ref.land();
        }

    }
}
