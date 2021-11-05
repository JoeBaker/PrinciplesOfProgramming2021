import java.util.ArrayList;

/**
 * PlayList Class
 * @author Suzy Atfield-Cutts
 * @since November 2020
 * 
 * A PlayList implemented as an ArrayList.
 * A PlayList is a subset of songs from the full songList.
 */
public class PlayList {
	
	private ArrayList<Song> myPlayList;
	
	/**
	 * PlayList Constructor 
	 * Creates an empty playlist to which Songs can be added.
	 */
	public PlayList(){
		this.myPlayList = new ArrayList<Song>();
	}

	/**
	 * add()
	 * Adds the Song passed in as a parameter to the PlayList
	 * @param song 	Song to be added to the PlayList
	 */
	public void add(Song song)
	{
		this.myPlayList.add(song);
	}
	/**
	 * remove()
	 * Removes the Song from the PlayList at position i.
	 * @param i	Position of the Song to be removed from the PlayList.
	 */
	public void remove(int i)
	{
		this.myPlayList.remove(i);
	}
	/**
	 * clearList()
	 * Removes all Songs from the PlayList so that the PlayList object still exists 
	 * but contains no Songs.
	 */
	public void clearList()
	{
		this.myPlayList.clear();
	}
	
	/**
	 * displayList()
	 * Prints the contents of the PlayList on the console. 
	 * Notice the type of Loop used here. 
	 */
	public void  displayList()
	{
		int counter=1;
		for(Song song: this.myPlayList) {
			System.out.println(counter+".  "+song.toString());
			counter++;
		}
	}
	/**
	 * getSize()
	 * Returns the number of Songs in the PlayList
	 * @return 	The number of Songs in the PlayList
	 */
	public int getSize() {
		return this.myPlayList.size();
	}
}
