package design.principles.isp.exercise.updated;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dodo creature = new Dodo(0);
		creature.layEggs();
		
		NonExtinctBird falcon = new Falcon(0);
		falcon.layEggs();
		falcon.fly();
				

	}

}
