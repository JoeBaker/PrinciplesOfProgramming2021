import java.util.Scanner;

/**
 * PlayListMaker Class
 * @author Suzy Atfield-Cutts
 * @since November 2020
 * 
 * Runs the interface for the application.
 */
public class PlayListMaker {

	private PlayList playList;
	private SongList songList;
	private Scanner keyboard;

	/**
	 * PlayListMaker Constructor
	 * Sets up the list objects, opens a Scanner object to read from the keyboard, 
	 * and runs a method to print the user interface.
	 */
	public PlayListMaker() {
		playList = new PlayList(); //calls constructor
		songList = new SongList(); //calls constructor
		keyboard = new Scanner(System.in);
		userInterface();
	}

	/**
	 * userInterface()
	 * Prints a simple user interface and performs the selection of tasks. 
	 * The loop is what keeps the program running. 
	 * Notice: 
	 * - the type of loop used - you want to print the interface at least once.
	 * - the use of the switch statement to select the task chosen by the user.
	 * 
	 */
	public void userInterface() {
		int userOption = 0;
		
		System.out.println("Welcome to the PlayList Maker");
		System.out.println("-----------------------------\n");

		do {
			System.out.println("1. Add song to playlist");
			System.out.println("2. Remove song from playlist");
			System.out.println("3. Clear playlist");
			System.out.println("4. Display play list");
			System.out.println("5. Display full song list");
			System.out.println("6. Quit");
			userOption=keyboard.nextInt();

			switch(userOption) {
			case 1: addSong();
					break;
			case 2: removeSong();
					break;
			case 3:	playList.clearList();
					break;
			case 4: System.out.println("PLAYLIST\n********");
					playList.displayList();
					System.out.println("------------------------\n");
					break;
			case 5: System.out.println("SONGLIST\n********");
					songList.printPlayListNumbered();
					System.out.println("------------------------\n");
					break;
			case 6: quit();
					break;
			}

		}while (userOption!=6);
	}
	/**
	 * addSong selected (by number) from the full SongList to the PlayList
	 */
	public void addSong() {

		int songNumber=0;
		songList.printPlayListNumbered();
		System.out.println("------------------------\n");
		
		do {
			System.out.println("Enter song number to add:");
			songNumber = keyboard.nextInt()-1;
			
		}while(songNumber>songList.getSize() || songNumber<0); //validation
		
		playList.add(songList.getSong(songNumber));
		
	}
	/**
	 * removeSong() 
	 * Deletes the user selected song (by number) from the PlayList. 
	 * The song is not deleted from the full SongList.
	 */
	public void removeSong() {
		playList.displayList();
		System.out.println("------------------------\n");
		
		int songNumber=0;
		
		do {
			System.out.println("Enter song number to remove:");
			songNumber = keyboard.nextInt()-1;
			
		}while(songNumber>playList.getSize() || songNumber<0); //validation
		
		playList.remove(songNumber);
	}
	
	/**
	 * Quit the program if the number 6 is selected by the user.
	 */
	public void quit()
	{
		//could save current playlist to a file at this point
		System.out.println("ByeBye");
	}
	/**
	 * Main method
	 * Execution begins here. All thats necessary is the creation of the PlayListMaker 
	 * Object, which calls the constructor.
	 * Note: We never need to refer to the PlayListMaker Object again so it does not 
	 * need a name.
	 * @param args	Arguments (parameters) passed in by the Operating System if any are required.
	 */
	public static void main(String[] args) {
		new PlayListMaker();

	}

}
