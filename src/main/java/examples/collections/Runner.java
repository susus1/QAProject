package examples.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class Runner {

	public static void main(String[] args) {

		var repository = new ListMusicTrackRepository();
		
		MusicTrack track1 = new MusicTrack(1L,"Expresso Love", "Making Movies", "Dire Staits", Genre.POP);
		MusicTrack track2 = new MusicTrack(2L, "Bat out of hell", "Bat out of Hell", "Meat Loaf");
		MusicTrack track3 = new MusicTrack(3L, "Two Out of Three Ain't Bad", "Bat out of Hell", "Meat Loaf");
		MusicTrack track4 = new MusicTrack(4L, "Breathe", "The Dark Side of the Moon", "Pink Floyd");
		MusicTrack track5 = new MusicTrack(5L, "Go your own way", "Rumours", "Fleetwood Mac");
		MusicTrack track6 = new MusicTrack(6L, "Dreams", "Rumours", "Fleetwood Mac");
		MusicTrack track7 = new MusicTrack(7L, "Stayin' Alive", "Saturday Night Fever", "Bee Gees");
		
		boolean added1 = repository.add(track1);
		boolean added2 = repository.add(track2);
		boolean added3 = repository.add(track3);
		boolean added4 = repository.add(track4);
		boolean added5 = repository.add(track5);
		boolean added6 = repository.add(track6);
		boolean added7 = repository.add(track7);
		
		Collection<MusicTrack> tracks = repository.selectAll();
		for (MusicTrack musicTrack : tracks) {
			System.out.println(musicTrack.toString());
		}
		
				
//		MusicTrack t1 = repository.selectById(5L);
//		System.out.println(t1.getTitle());
//		
//		for (MusicTrack musicTrack : repository.selectAll()) {
//			System.out.println(musicTrack.getTitle());
//		}

		
		
//		Product p1 = new Product();
//		p1.setId(1L);
//		p1.setName("Dog food");
//
//		Product p2 = new Product();
//		p2.setId(2L);
//		p2.setName("Milk");
//
//		Product p3 = new Product();
//		p3.setId(3L);
//		p3.setName("Cat food");
//
//		Product p4 = new Product();
//		p4.setId(4L);
//		p4.setName("Potatoes");
//
//		List<Product> products = new ArrayList<>();
//
//		products.add(p1);
//		products.add(p2);
//		products.add(p3);
//		products.add(p4);
	}

}
