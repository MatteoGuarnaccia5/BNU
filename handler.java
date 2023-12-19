import java.util.ArrayList;
import java.util.Comparator;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class handler {
    
    public ArrayList<Song> songs = new ArrayList<Song>();

    public handler(){

        this.songs.add(new Song("Wonderwall", "Oasis", 1781026463));
        this.songs.add(new Song("Charlemagne", "Blossoms", 394195806));
        this.songs.add(new Song("Ruby", "Kaiser Chiefs", 250455378));
        this.songs.add(new Song("Back to black", "Amy Winehouse", 830329608));
        this.songs.add(new Song("505", "Arctic Monkeys", 1331428041));
        this.songs.add(new Song("Teenage Kicks", "The Undertones", 70763584));
        this.songs.add(new Song("Believer", "Imagine dragons", 270512663));
        this.songs.add(new Song("Lose Control", "Becky Hill", 872145533));
        this.songs.add(new Song("Bohemian Rhapsody", "Queen", 227751129));
        this.songs.add(new Song("Organic growth", "Sainte", 2657752));

    }

    public void addSong(){
        int plays = 0;
        String title = System.console().readLine("Enter song title: ");
                    String artist = System.console().readLine("Enter Artist name: ");
                    try{
                         plays = Integer.parseInt(System.console().readLine("Enter the number of plays: "));
                    }
                    catch (Exception e){
                        System.out.println("Error. Number of plays entered incorrectly. Redirecting back to main menu");
                    }
                   

                    Song newSong = new Song(title, artist, plays);

                    songs.add(newSong);
    }

    public void viewSongs(ArrayList<Song> songList){
        
        System.out.println("Title.  Artist Name.  Plays \n---------------------------------");
        for (int i = 0; i < songList.size(); i++) {
         System.out.println(songList.get(i).title + ". " + songList.get(i).artistName + ". " + songList.get(i).numOfPlays + ". ");
        }

        System.out.println("---------------------------------\n");

    }

    public void deleteSong(){

        boolean songFound = false;
        while (!songFound) {
            String song = System.console().readLine("Enter the song name you would like to delete: ");
        for (int i = 0; i < songs.size(); i++) {

            if(songs.get(i).title.toLowerCase().equals(song.toLowerCase())){
                songs.remove(i);
                songFound = true;
                break;
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
        songFound = false;
    }

    public void viewByPlays(){
        
        int numOfPlays = Integer.parseInt(System.console().readLine("Enter the number of plays you would like to filter by: "));

        ArrayList<Song> filteredList = new ArrayList<Song>();
        for (int i = 0; i < songs.size(); i++) {
            
            if (songs.get(i).numOfPlays >= numOfPlays) {
                filteredList.add(songs.get(i));
            }
        }

        this.viewSongs(filteredList);

    }

    public ArrayList<Song> sortByTitle(){
        Comparator<Song> titleComparator = (c1, c2) -> c1.title.compareTo(c2.title);


        ArrayList<Song> sortedList = songs;
        sortedList.sort(titleComparator);

        return sortedList;
    }

    public ArrayList<Song> sortByArtist(){
        Comparator<Song> artistComparator = (c1, c2) -> c1.artistName.compareTo(c2.artistName);


        ArrayList<Song> sortedList = songs;
        sortedList.sort(artistComparator);

        return sortedList;
    }

    public ArrayList<Song> sortByPlays(){
        Comparator<Song> playsComparator = (c1, c2) -> Integer.compare(c1.numOfPlays, c2.numOfPlays);


        ArrayList<Song> sortedList = songs;
        sortedList.sort(playsComparator);

        return sortedList;
    }
  
}
