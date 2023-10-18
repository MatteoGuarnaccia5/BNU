import java.util.List;

public class Main{

    // public List<Song> Songs;
    public static void main(String[] args){

        Main main = new Main();
        
        main.menu();
        
    }

    public void menu(){

        handler songHandler = new handler();

        boolean Continue = true;
        do {
            System.out.println("""
                    Main Menu

                    1. Add song
                    2. Remove song
                    3. View all songs
                    4. View songs with chosen number of plays
                    5. Exit
                    """);
            
            String choice = System.console().readLine("Enter number of option: ");

            switch (choice) {
                case "1":
                    //add song
                    songHandler.addSong();
                    break;
                case "2":
                //delete song
                    break;
                case "3":
                    //view all
                    songHandler.viewSongs();
                    break;
                case "4":
                    //filter view by plays
                    break;
                case "5":
                    Continue = false;
                    break;
            
                default:
                System.out.println("Not valid. Please enter a choice (1 to 5)");
                    break;
            }
        } while (Continue);
    }
}
