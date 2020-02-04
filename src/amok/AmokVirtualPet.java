package amok;

public class AmokVirtualPet<ShelterPet> {

	public static Object shelterPet;
	private int hunger = 6; // child
	private int thirst = 6;
	private int boredom = 6;
	private int walk = 6;
	private int waste = 6;
	private int health = 6;
	private String petName;
	private String petDescription;

	private int walkAllDogs = walk;
	private Object shelterNumber;

	public AmokVirtualPet(int i, int j, int k, int l, int m) {
		// TODO Auto-generated constructor stub
	}

	public AmokVirtualPet(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public int getWalk() {
		return this.walk;
	}

	public int getWaste() {
		return this.waste;
	}

	public int getHunger() { // parent- protects the data by wrapping it in a method
		return this.hunger;
	}

	public int getThirst() {
		return this.thirst;
	}

	public int getBoredom() {
		return this.boredom;
	}

	public int getHealth() {
		return this.health;
	}

	public void eat() {
		this.hunger--; // this cookie!
		// same as this.hunger = this.hunger -1;
	}

	public void drink() {
		this.thirst--;
	}

	public void play() {
		this.boredom--;
	}

	public void health() {
		this.health--;
	}

	public void walk() {
		this.walk--;
	}

	public void waste() {
		this.waste--;
	}

	public int getFedAll() {
		return this.hunger;
	}

	public int getWalkAllDogs() {
		return this.walkAllDogs;
	}

	public void tick() {
		hunger--;
		thirst--;
		boredom--;
		health--;
		walk--;
		waste--;
	}

	public Object getShelterNumber() {
		return this.shelterNumber;
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

	public void put(String petName2, AmokVirtualPet<?> pet) {

	}

	public void withdraw(int position) {
		// TODO Auto-generated method stub

	}

	public ShelterPet findPet(String petName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void sleep() {
		// TODO Auto-generated method stub
		
	}}
