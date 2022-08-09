package examples.collections;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class MusicTrackTest {
    @Test
    public void hashSetWorksCorrectlyWithMusicTrack (){
        MusicTrack musicTrack1 = new MusicTrack();
        musicTrack1.setId(1L);
        MusicTrack musicTrack2 = new MusicTrack();
        musicTrack2.setId(1L);

        HashSet<MusicTrack> musicTracks = new HashSet<>();
        musicTracks.add(musicTrack1);
        musicTracks.remove(musicTrack2);
        assertEquals(0, musicTracks.size());
    }
}
