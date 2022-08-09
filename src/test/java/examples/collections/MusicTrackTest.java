package examples.collections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.BeforeClass;
import org.junit.Test;

public class MusicTrackTest {
    @Test
    public void hashSetWorksCorrectlyWithMusicTrack (){
        MusicTrack musicTrack1 = new MusicTrack();
        musicTrack1.setId(1L);
        musicTrack1.setTitle("Bat...");
        MusicTrack musicTrack2 = new MusicTrack();
        musicTrack2.setId(1L);
        musicTrack2.setTitle("Bat...");

        HashSet<MusicTrack> musicTracks = new HashSet<>();
        //ArrayList<MusicTrack> musicTracks = new ArrayList<>();
        musicTracks.add(musicTrack1);
        musicTracks.remove(musicTrack2);
        assertEquals(0, musicTracks.size());
    }
}

