package examples.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapMusicTrackRepository implements MusicTrackRepository {
	
	private Map<Long, MusicTrack> map = new HashMap<>();

	@Override
	public boolean add(MusicTrack musicTrack) {
		// call the map's put method, passing in the id and the music track object
		// return true if the method returns null
		return false;
	}

	@Override
	public MusicTrack selectById(long id) {
		// call the map's get method, passing in the id
		return null;
	}

	@Override
	public Collection<MusicTrack> selectAll() {
		// return the values() method
		return null;
	}

	@Override
	public boolean update(MusicTrack musicTrack) {
		// call the map's replace method, passing in the id of the music track as the first parameter 
		return false;
	}

	@Override
	public boolean delete(MusicTrack musicTrack) {
		// call the map's remove method, passing in the id
		return false;
	}

}
