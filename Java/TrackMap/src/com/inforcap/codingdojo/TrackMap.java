package com.inforcap.codingdojo;
import java.util.HashMap;
import java.util.Set;


public class TrackMap {
	public void trackList (){	
		HashMap<String, String> trackListMap = new HashMap<String, String>();
		trackListMap.put("The song of my people", "quiero comer curanto con chapalele...");
		trackListMap.put("The song of joy","Me gusta ser asi, me gustan las mujeres y las cervecitas...");
		trackListMap.put("A song to dance","Shot throug the heart...");
		trackListMap.put("The beautiful people","Hey, you, are you trying to be mean?...");
		Set<String> keys = trackListMap.keySet();
		for (String key : keys) {
			System.out.println("Track: "+key);
			System.out.println("Lyrics: "+trackListMap.get(key));
		}
		
	}
}
