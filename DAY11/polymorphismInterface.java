public class polymorphismInterface {
    public static void main(String[] args) {
        Human h = new Human("apoorva", 23);
        Fish f = new Fish("Whale");
        h.swim();
        h.toString("ngjj",33);
        h.toString();
        f.swim();


    }
    public interface CanSwim{
        void swim();
    }

    public static class Human implements CanSwim{
        private String name;
        private  int age;
        public Human(String name,int age){
            this.name= name;
            this.age=age;
        }
        @Override
        public void swim() {
            System.out.println("I swim with inflated tube");
        }
        public String toString(String name,int age){
            return "I'm" + name + "I'm" + age + "years old";
        }
    }
    public static class Fish implements CanSwim{
        private  String name;
        public Fish(String name){
            this.name=name;
        }

        @Override
        public void swim() {
            System.out.println("this is a " + name + " "+"fish");
        }
    }
}
