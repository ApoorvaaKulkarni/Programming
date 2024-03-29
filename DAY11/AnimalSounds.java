public class AnimalSounds {
    public static void main(String[] args) {
        Bird b = new Bird();
        Cat c = new Cat();
        b.sound();
        c.sound();
    }
    public static class Animal{
        public void sound(){
            System.out.println("makes sound");
        }
    }
    public static class Bird extends Animal{
        @Override
        public void sound() {
            System.out.println("bird chirps");
        }

    }
    public static class Cat extends Animal{
        @Override
        public void sound() {
            System.out.println("cat meows");
        }
    }
}
