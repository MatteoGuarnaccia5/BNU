import java.util.ArrayList;

public class handler {
    
    public ArrayList<Song> songs = new ArrayList<Song>();

    public void addSong(){
        String title = System.console().readLine("Enter song title: ");
                    String artist = System.console().readLine("Enter Artist name: ");
                    int plays = Integer.parseInt(System.console().readLine("Enter the number of plays: "));

                    Song newSong = new Song(title, artist, plays);

                    songs.add(newSong);
    }

    public void viewSongs(){
        
        System.out.println("Title.  Artist Name.  Plays \n---------------------------------");
        for (int i = 0; i < songs.size(); i++) {
         System.out.println(songs.get(i).title + ". " + songs.get(i).artistName + ". " + songs.get(i).numOfPlays + ". ");
        }

        System.out.println("---------------------------------\n");

    }

    public void deleteSong(){

        boolean songFound = false;
        while (!songFound) {
            String song = System.console().readLine("Enter the song name you would like to delete: ");
        
        for (int i = 0; i < songs.size(); i++) {

            if(songs.get(i).title.equals(song)){
                songs.remove(i);
                songFound = true;
                continue;
            }
            else{
                songFound = false;
            }
        }

        if(!songFound){
            System.out.println("Song not found. Check entered name and try again.");
        }
        else{
            continue;
        }
        }
    }


}
