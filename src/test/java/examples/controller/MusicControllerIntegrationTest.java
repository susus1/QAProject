package examples.controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import examples.collections.Genre;
import examples.collections.ListMusicTrackRepository;
import examples.collections.MusicTrack;
import examples.collections.MusicTrackRepository;

public class MusicControllerIntegrationTest {

	private MusicTrackRepository musicTrackRepository = new ListMusicTrackRepository();
	
	@Before
	public void setUp() {
		MusicTrack track1 = new MusicTrack(1L,"Expresso Love", "Making Movies", "Dire Staits", Genre.POP);
		MusicTrack track2 = new MusicTrack(2L, "Bat out of hell", "Bat out of Hell", "Meat Loaf");
		MusicTrack track3 = new MusicTrack(3L, "Two Out of Three Ain't Bad", "Bat out of Hell", "Meat Loaf");
		MusicTrack track4 = new MusicTrack(4L, "Breathe", "The Dark Side of the Moon", "Pink Floyd");
		MusicTrack track5 = new MusicTrack(5L, "Go your own way", "Rumours", "Fleetwood Mac");
		MusicTrack track6 = new MusicTrack(6L, "Dreams", "Rumours", "Fleetwood Mac");
		MusicTrack track7 = new MusicTrack(7L, "Stayin' Alive", "Saturday Night Fever", "Bee Gees");
		
		musicTrackRepository.add(track1);
		musicTrackRepository.add(track2);
		musicTrackRepository.add(track3);
		musicTrackRepository.add(track4);
		musicTrackRepository.add(track5);
		musicTrackRepository.add(track6);
		musicTrackRepository.add(track7);
	}

	@Test
	public void test() {
		MusicController musicController = new MusicController(musicTrackRepository);
		Collection<MusicTrack> tracks = musicController.SelectAll();
		assertEquals(7, tracks.size());
	}

	

}
