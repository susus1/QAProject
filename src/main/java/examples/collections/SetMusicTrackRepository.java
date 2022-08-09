package examples.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMusicTrackRepository implements MusicTrackRepository {

	private Set<MusicTrack> musicTracks = new HashSet<>();
	
	@Override
	public boolean add(MusicTrack musicTrack) {
		// call the Set's add method
		return musicTracks.add(musicTrack);
	}

	@Override
	public MusicTrack selectById(long id) {
		for (MusicTrack musicTrack : musicTracks) {
			if(musicTrack.getId() == id) {
				return musicTrack;
			}
		}
		return null;
	}

	@Override
	public Collection<MusicTrack> selectAll() {
		// TODO Auto-generated method stub
		return List.copyOf(musicTracks);
	}

	@Override
	public boolean update(MusicTrack musicTrack) {
		// remove the musicTrack
		musicTracks.remove(musicTrack);
		// add the modified object
		return musicTracks.add(musicTrack);
	}

	@Override
	public boolean delete(MusicTrack musicTrack) {
		// call the remove method
		musicTracks.remove(musicTrack);
		return false;
	}

}
