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
		MusicTrack replaces = map.put(musicTrack.getId(), musicTrack);
		return replaces == null;
	}

	@Override
	public MusicTrack selectById(long id) {
		// call the map's get method, passing in the id
		
		return map.get(id);
	}

	@Override
	public Collection<MusicTrack> selectAll() {
		
		// return the values() method
		return map.values();
	}

	@Override
	public boolean update(MusicTrack musicTrack) {
		// call the map's replace method, passing in the id of the music track as the first parameter 
		MusicTrack replaces = map.replace(musicTrack.getId(), musicTrack);
		return replaces != null;
	}

	@Override
	public boolean delete(MusicTrack musicTrack) {
		// call the map's remove method, passing in the id
		return map.remove(musicTrack.getId(), musicTrack);
	}

}
