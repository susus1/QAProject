package examples.controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import examples.collections.Genre;
import examples.collections.MusicTrack;
import examples.collections.MusicTrackRepository;
@RunWith(MockitoJUnitRunner.class)
public class MusicControllerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Mock
	private MusicTrackRepository musicTrackRepository;	
	
	@InjectMocks
	private MusicController musicController;

	@Test
	public void test() {
		MusicController musicController = new MusicController(musicTrackRepository);
		Collection<MusicTrack> tracks = getCollection();
		when(musicTrackRepository.selectAll()).thenReturn(tracks);
		assertEquals(7, musicController.SelectAll().size());
	}
	
	
	private Collection<MusicTrack>  getCollection() {
		Collection<MusicTrack> tracks = new ArrayList<>();
		MusicTrack track1 = new MusicTrack(1L,"Expresso Love", "Making Movies", "Dire Staits", Genre.POP);
		MusicTrack track2 = new MusicTrack(2L, "Bat out of hell", "Bat out of Hell", "Meat Loaf");
		MusicTrack track3 = new MusicTrack(3L, "Two Out of Three Ain't Bad", "Bat out of Hell", "Meat Loaf");
		MusicTrack track4 = new MusicTrack(4L, "Breathe", "The Dark Side of the Moon", "Pink Floyd");
		MusicTrack track5 = new MusicTrack(5L, "Go your own way", "Rumours", "Fleetwood Mac");
		MusicTrack track6 = new MusicTrack(6L, "Dreams", "Rumours", "Fleetwood Mac");
		MusicTrack track7 = new MusicTrack(7L, "Stayin' Alive", "Saturday Night Fever", "Bee Gees");
		
		tracks.add(track1);
		tracks.add(track2);
		tracks.add(track3);
		tracks.add(track4);
		tracks.add(track5);
		tracks.add(track6);
		tracks.add(track7);
		
		return tracks;
	}
	

}
