package examples.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListMusicTrackRepository implements MusicTrackRepository {

	private List<MusicTrack> list = new ArrayList<>();
	
	@Override
	public boolean add(MusicTrack musicTrack) {
		// TODO Auto-generated method stub
		return list.add(musicTrack);
	}

	@Override
	public MusicTrack selectById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<MusicTrack> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(MusicTrack musicTrack) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(MusicTrack musicTrack) {
		// TODO Auto-generated method stub
		return false;
	}

}
