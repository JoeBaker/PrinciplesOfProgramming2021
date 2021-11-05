/**
 * Song Class
 * @author Suzy Atfield-Cutts
 * @since November 2020
 * 
 * Simple Song object containing only title and artist. There is no differentiation between a band and a solo artist.
 */
public class Song {
	
	private String songTitle;
	private String artist;
	
	/**
	 * Song constructor
	 * @param songTitle Title of song
	 * @param artist	Name of Artist performing the song
	 */
	public Song(String songTitle, String artist)
	{
		this.songTitle = songTitle;
		this.artist = artist;
	}
	/**
	 * Song constructor
	 * No parameters. Title and Artist need to be set using set methods.
	 */
	public Song()
	{
		this.songTitle = "";
		this.artist = "";
	}

	//Getters
	/**
	 * getTitle() returns the title of the Song.
	 * @return	Title of the Song as a String
	 */
	public String getTitle() {
		return this.songTitle;
	}
	/**
	 * getArtist() returns the name of the performer of the Song.  
	 * @return	name of the performer (Artist) of the Song as a String.
	 */
	public String getArtist() {
		return this.artist;
	}
	
	//setter methods
	/**
	 * setSongTitle()
	 * Used to add or change the title of a Song. 
	 * NOTE: This is the ideal place to add validation. 
	 * @param songTitle 	Title of the Song as a String
	 */
	public void  setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}
	/**
	 * setArtist()
	 * Used to add or change the name of an artist. 
	 * NOTE: This is the ideal place to add validation. 
	 * @param artist 	Name of the performer (Artist) of the Song as a String.
	 */
	public void  setArtist(String artist) {
		this.artist = artist;
	}

	/**
	 * Overriding the Object toString method
	 * @return The data of the Song object formatted into a useful String.
	 */
	public String toString()
	{
		return getArtist() +" - "+ getTitle();
	}
}