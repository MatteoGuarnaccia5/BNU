import java.util.ArrayList;
import java.util.List;

public class handler {
    
    public List<Song> Songs = new ArrayList<Song>();

    public void addSong(){
        String title = System.console().readLine("Enter song title: ");
                    String artist = System.console().readLine("Enter Artist name: ");
                    int plays = Integer.parseInt(System.console().readLine("Enter the number of plays: "));

                    Song newSong = new Song(title, artist, plays);

                    this.Songs.add(newSong);
    }

    public void viewSongs(){
        System.out.println(this.Songs);
    }
}
