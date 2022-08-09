package examples.collections;


/**
 * 
 * @author Owner
 *
 */
public class MusicTrack {
	private long id;
	private String title;
	private String album;
	private String artist;
	
	
	
	public MusicTrack() {
		// TODO Auto-generated constructor stub
	}
	public MusicTrack(long id, String title, String album, String artist) {
		this.id = id;
		this.title = title;
		this.album = album;
		this.artist = artist;
	}
	

	/**
	 * Define equality for MusicTracks
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return ((MusicTrack)obj).id == id && ((MusicTrack)obj).title.equals(title);
	}
	
	/**
	 * Equal objects are required to have the same hashCode
	 * Unequal objects can have equal hashcodes (a collision), but preferably should be different
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (int)id + title.hashCode();
	}
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}

}
