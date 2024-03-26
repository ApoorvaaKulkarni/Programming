public class AnimalSound {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a = new Animal();
        d.makeSound();
        a.makeSound();


    }

    public static class Animal {
        public void makeSound() {
            System.out.println("Animal makes sound");

        }

    }

    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("BARKS");
        }
    }
}
















