public class PolymorphismMethodOverloading {
    public static void main(String[] args) {
        pattern p = new pattern();
        p.display();
        System.out.println("\n");
        p.display('#');


    }
    public static class pattern{
        public void display(){
            for(int i =0;i< 10;i++){
                System.out.print("*");
            }
        }
        public void display(char symbol){
            for(int i =0;i<10;i++){
                System.out.print(symbol);
            }
        }

    }

}
