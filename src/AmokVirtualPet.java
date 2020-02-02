
public class AmokVirtualPet {

	private int hunger = 6; // child 
	private int thirst = 6;
	private int boredom = 6;
	private int walk = 6;
	private String petName;
	private String petDescription;
//	 
	public AmokVirtualPet(String petNameParameter, String petDescriptionParameter) {
		this.petName = petNameParameter;
		this.petDescription = petDescriptionParameter;
	}
	public AmokVirtualPet() {
		// default constructor - was invisible 
	}
	public AmokVirtualPet(String petNameParameter, String petDescriptionParameter, int hungerParameter, 
			int thirstParameter, int boredomParameter, int walkParameter) {
		this.petName = petNameParameter;
		this.petDescription = petDescriptionParameter;
		this.hunger = hungerParameter;
		this.thirst = thirstParameter;
		this.boredom = boredomParameter;
		this.walk = walkParameter;
	}
	public AmokVirtualPet(int i, int j, int k, int l) {
		// TODO Auto-generated constructor stub
		//add to your's
	}
	public int getWalk() {
		return this.walk;
	}
	public int getHunger() { //parent- protects the data by wrapping it in a method
		return this.hunger;
	}
	public int getThirst() {
		return this.thirst;
	}
	public int getBoredom() {
		return this.boredom;
	}
	public void eat() {
		this.hunger=-3; //this cookie!
		//same as this.hunger = this.hunger -1;
	}
	public void drink() {
		this.thirst=-3;
	}
	public void play() {
		this.boredom=-3;
	}
	public void tick() {
		hunger--;
		thirst--;
		boredom--;
	}
	public String getPetName() {
		return this.petName;
	}
	public String getPetDescription() {
		return this.petDescription;
	}
	public void add(Object pet1) {
		// TODO Auto-generated method stub
		
	}
	public void put(String petName2, AmokVirtualPet pet) {
		// TODO Auto-generated method stub
		
	}
	public void withdraw(int position) {
		// TODO Auto-generated method stub
		
	}
}
