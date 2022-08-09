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
		for (MusicTrack musicTrack : list) {
			if(musicTrack.getId() == id) {
				return musicTrack;
			}
		}
		return null;
	}

	@Override
	public Collection<MusicTrack> selectAll() {
		// return the instance variable
		return List.copyOf(list);
	}

	@Override
	public boolean update(MusicTrack musicTrack) {
		// call indexOf to get element position in the list
		// call set, passing in the index and the updated object
		int index = list.indexOf(musicTrack);
		if(index == -1) {
			return false;
		}
		list.set(index, musicTrack);
		
		return true;
	}

	@Override
	public boolean delete(MusicTrack musicTrack) {
		// call the List's remove method
	    return	list.remove(musicTrack);
	}

}
