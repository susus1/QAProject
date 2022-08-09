package examples.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Runner {

	public static void main(String[] args) {
		
	
		HashSet<MusicTrack> tracks = new HashSet<>();
		MusicTrack track1 = new MusicTrack(1L,"Expresso Love", "Making Movies", "Dire Staits");
		MusicTrack track2 = new MusicTrack(2L, "Bat out of hell", "Bat out of Hell", "Meat Loaf");
		
		tracks.add(track1);
		tracks.add(track2);
		
		for (MusicTrack musicTrack : tracks) {
			System.out.println(musicTrack.getTitle());
		}
		

		
	
		
	}

}
