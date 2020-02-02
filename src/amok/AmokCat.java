package amok;

public class AmokCat {

	//private int hunger = 6; // child 
	//private int thirst = 6;
	//private int boredom = 6;
	private int walk = 6;
	//private int cage = 0;
	//private int oil = 6;
	
	public AmokCat(String string, String string2, String string3) {
	}
	public AmokCat(int walk, int eat, int sleep, int fun, int water) {
		this.walk = walk;
	}

	public int getWalk() {
		return this.walk;
	}

	public void tick() {
		walk--;
//		eat--;
//		sleep--;
//		fun--;
//		water--;
	}
}
