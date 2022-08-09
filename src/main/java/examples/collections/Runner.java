package examples.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Runner {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.setId(1L);
		p1.setName("Dog food");
		
		Product p2 = new Product();
		p2.setId(2L);
		p2.setName("Milk");
		
		Map<Long, Product> products = new HashMap<>();
		products.put(1L, p1);
		products.put(2L, p2);	
		
		System.out.println(products.size());
		
		Product product = products.get(2L);
		//System.out.println(product.getName());
		
//		Product a = products.remove(1L);
//		Product b = products.remove(1L);
		
		System.out.println(products.size());
		
		for (Product p : products.values()) {
			System.out.println(p.getName());
		}
		
		
		for (Long id : products.keySet()) {
			System.out.println(id);
		}
		
		for (Map.Entry<Long, Product> kv : products.entrySet()) {
			System.out.println(kv.getKey()+"    "+kv.getValue().getName());
		}
		
		
	
//		HashSet<MusicTrack> tracks = new HashSet<>();
//		MusicTrack track1 = new MusicTrack(1L,"Expresso Love", "Making Movies", "Dire Staits");
//		MusicTrack track2 = new MusicTrack(2L, "Bat out of hell", "Bat out of Hell", "Meat Loaf");
//		
//		tracks.add(track1);
//		tracks.add(track2);
//		
//		for (MusicTrack musicTrack : tracks) {
//			System.out.println(musicTrack.getTitle());
//		}
		

		
	
		
	}

}
