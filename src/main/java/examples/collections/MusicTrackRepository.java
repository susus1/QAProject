package examples.collections;

import java.util.Collection;

/**
 * CRUD operations
 * @author Owner
 *
 */
public interface MusicTrackRepository {
	boolean add (MusicTrack musicTrack);
	MusicTrack selectById(long id);
	Collection<MusicTrack>selectAll();
	boolean update(MusicTrack musicTrack);
	boolean delete (MusicTrack musicTrack);	
}
