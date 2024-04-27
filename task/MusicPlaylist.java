import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MusicPlaylist {
    private ArrayList<String> songs;

    public  MusicPlaylist(){
        songs = new ArrayList<>();
    }

    public void addSong(String song){
        songs.add(song);
    }

    public void removeSong(String song){
        songs.remove(song);
    }
    public void shufflePlaylist(){
        Collections.shuffle(songs);
    }
    public void displayPlayList(){
        System.out.println("Current playlist :");
        for(String song :songs){
            System.out.println(song);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MusicPlaylist m = new MusicPlaylist();
        m.addSong("song 1");
        m.addSong("song 2");

        m.displayPlayList();

        while(true){
            System.out.println("\nWhat would you like to do? (a)dd, (r)emove, (s)huffle, (d)isplay, or (q)uit?");
            String choices = sc.nextLine();

            switch (choices){
                case "a":
                    System.out.println("ENter title: ");
                    String title = sc.nextLine();
                    m.addSong(title);
                    break;
                case "r":
                    System.out.println("Enter titlr to remove");
                    title = sc.nextLine();
                    m.removeSong(title);
                    break;
                case "s":
                    m.shufflePlaylist();
                    System.out.println("shuffled");
                    break;
                case "d":
                    m.displayPlayList();
                    break;
                case "q":
                    System.out.println("Done");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }



    }
}