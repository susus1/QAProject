package example.generics;

import java.util.List;

public class LowerBoundCage {

	private List<? super Elephant> list;

	public void add(List<? super Elephant> list) {
		this.list = list;
	}

	public List<? super Elephant> get() {
		return list;
	}
}