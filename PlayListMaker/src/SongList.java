import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * SongList Class
 * @author Suzy Atfield-Cutts
 * @since November 2020
 * 
 * Simple SongList object 
 * The SongList is the full list of songs from which a PlayList may be selected. 
 */
public class SongList {

	private ArrayList<Song> songList;

	/**
	 * SongList Constructor
	 * Reads the SongList data from a file. 
	 * This is the full list of Songs from which PlayList selections are made.
	 */
	public SongList()
	{
		songList = new ArrayList<Song>();
		File songFile = new File("songs");
		Scanner songScan;
		
		try {
			songScan = new Scanner(songFile);
			
			while(songScan.hasNext()) {
				String title = songScan.nextLine();
				String artist = songScan.nextLine();
				Song newSong = new Song(title,artist);
				songList.add(newSong);
			}
			songScan.close();
		} catch (FileNotFoundException e) {
			System.out.println("File: 'songs' not found.");
		}
	}
	
	/**
	 * getSong 
	 * Returns a song object from the full list of Songs. 
	 * @param i	Position of Song in list.
	 * @return	Song object from the full list of Songs that is at position i.
	 */
	public Song getSong(int i){
		return songList.get(i);
	}
	/**
	 * printPlayListNumbered()
	 * Prints a list of all the available songs to choose from with numbers down the 
	 * side to aid selection. 
	 */
	public void printPlayListNumbered()
	{
		int counter=1;
		for(Song song: songList) {
			System.out.println(counter+".  "+song.toString());
			counter++;
		}
	}
	
	/**
	 * getSize()
	 * Returns the number of Songs in the full SongList.
	 * @return 	The number of Songs in the full SongList.
	 */
	public int getSize(){
		return songList.size();
	}
}
