package amok;

public class RoboPet {

	// private int hunger = 6; // child
	// private int thirst = 6;
	// private int boredom = 6;
	private int walk = 6;
	// private int cage = 0;
	private int oil = 6;

	public RoboPet(String string, String string2, String string3) {
	}

	public RoboPet(int walk, int eat, int sleep, int fun, int oil) {
	}

	public int getWalk() {
		return this.walk;
	}

	public int getOil() {
		return this.oil;
	}

	public void tick() {
		walk--;
//		eat--;
//		sleep--;
//		fun--;
		oil--;
	}
}
