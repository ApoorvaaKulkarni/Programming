public class AnimalZoo {
    public static void main(String[] args) {
        Animal a = new Animal();
        cheeetah c = new cheeetah();
        a.move();
        c.move();
    }

    public static class Animal{


        public void move(){
            System.out.println("Animal runs");
        }
    }
    public static class cheeetah extends  Animal{

        @Override
        public void move() {
            System.out.println("Cheetah runs fatser");
        }
    }










}
