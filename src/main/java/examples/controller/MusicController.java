package examples.controller;

import java.util.Collection;
import java.util.List;

import examples.collections.MusicTrack;
import examples.collections.MusicTrackRepository;

public class MusicController {
	private MusicTrackRepository repository;

	public MusicController(MusicTrackRepository repository) {
		this.repository = repository;
	}
	
	public Collection<MusicTrack> SelectAll(){
		return repository.selectAll();
	}

}
