import java.util.HashSet;

public class BookDetails {
    public static void main(String[] args) {
        HashSet<Book> set = new HashSet<>();
        Book b1 = new Book(1,"IKIGAI","hector","Frances",21);
        Book b2 = new Book(2,"Atomic Habits","James Clear","Penguin House",12);
        set .add(b1);
        set.add(b2);
        for(Book b : set){
            System.out.println(b.id+ " " + b.name + " "+ b.author + " " + b.publisher + " " + b.quantity);
        }
    }
    public static class Book{
        int id,quantity;
        String name, author,publisher;
        public Book(int id,String name,String author,String publisher,int quantity){
            this.id = id;
            this.author= author;
            this.name = name;
            this.publisher = publisher;
            this.quantity =quantity;

        }

    }









}
