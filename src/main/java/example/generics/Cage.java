package example.generics;

import java.util.List;

public class Cage<T extends Animal> {

	private List<T> list;

	public List<T> getList() {
		return list;
	}

	public void add(List<T> list) {
		this.list = list;
	}
}
