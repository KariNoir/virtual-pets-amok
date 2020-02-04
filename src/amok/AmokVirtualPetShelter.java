package amok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AmokVirtualPetShelter {


	//private static Object thePet;
	private static AmokVirtualPetShelter shelterPet;
	private static String menuOption;
	private static Object thePet;
	private static Object input;
	private int fedAll = getHunger();
	private int[] shelterNumber = new int[4];
	private Object petName;
	private Object petDescription;
	private Object petNameParameter;
	private Object petDescriptionParameter;
	private Object hunger;
	private Object thirstParameter;
	private Object thirst;
	private Object boredom;
	private Object walk;
	private Object waste;
	private Object health;
	private Object walkParameter;
	private Object wasteParameter;
	private Object healthParameter;
	private Object boredomParameter;
	private Object hungerParameter;
	public AmokVirtualPetShelter(int shelterNumber, String petNameParameter, String petDescriptionParameter, int hungerParameter,
				int thirstParameter, int boredomParameter, int walkParameter, int wasteParameter, int healthParameter) {
	} public AmokVirtualPetShelter(int i, int j, int k, int l) {
		// TODO Auto-generated constructor stub
	}
	{
			this.shelterNumber = shelterNumber;
			this.petName = petNameParameter;
			this.petDescription = petDescriptionParameter;
			this.hunger = hungerParameter;
			this.thirst = thirstParameter;
			this.boredom = boredomParameter;
			this.walk = walkParameter;
			this.waste = wasteParameter;
			this.health = healthParameter;
	}

	private int getHunger() {
		return this.getHunger();
	}

	public static void main(String[] args) {
		
		Map<String, AmokVirtualPet> pets = new HashMap<>();

		AmokVirtualPet pet1 = new AmokVirtualPet("Thor", "Dog: Brown and friendly");
		AmokVirtualPet pet2 = new AmokVirtualPet("Cotton", "Cat: Fat and Fluffy");
		AmokVirtualPet pet3 = new AmokVirtualPet("Red", "Turtle: green and mean");

		AmokVirtualPetShelter thePets;
		pets.put("1", pet1);
		pets.put("2", pet2);
		pets.put("3", pet3);
		
		//System.out.println("The pets are " + thePets);
	}
			

			//Map<String,String> pets = new HashMap<String, String>();

			public void add(AmokVirtualPet pets) {
				AmokVirtualPet pet = null;
				pets.put(pet.getPetName(), pet);
				
			}

			AmokVirtualPet findPet1(String pets) {
				return null;
			}

			public void getAllPets() {
				return;
			}

			public void close(AmokVirtualPet pet) {
				Map<String, AmokVirtualPet> pets;
				pets.remove(pet.getPetName(), pet);
				
			}

			public void withdraw(String petName, int position) {
				AmokVirtualPet adoptedFromShelter = findPet1(petName);
				adoptedFromShelter.withdraw(position);
			}
		


	private static AmokVirtualPet findPet(String petName) {
		// TODO Auto-generated method stub
		return null;
	
	//public void tickAllPets() {
		//All pets do what the direction say should be done to them.
		
	//}

		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////
		////////////////////////////////////
		
		
		
		//make new pet. created the pet call from the VirtualPet2.
		//VirtualPet2 thePet = new VirtualPet2 ("Bob", "short");

		//System.out.println(thePet.getPetByKey());
		
		Scanner input = new Scanner(System.in);
				
				AmokVirtualPetShelter shelterPet = new AmokVirtualPetShelter(6, 6, 6, 6);
		//name your pet

				System.out.println("Hi, welcome to the Shelter" + "Here are the pets that live in this shelter: " + );}
		
	public static void main1(String[] args) {
					
				ArrayList<AmokVirtualPet> thePets = new ArrayList<AmokVirtualPet>();
					//Putting new pets in list from user. taking in a new pet
					thePets.put(input);
					
					
					Collections.sort(thePets<VirtualPets2>);
					System.out.println(thePets);
				
				//build out the display of all the current animals...including the 3 from AmokVirtualPetShelter		
				System.out.println(allShelterPets +"'s tummy meter is on " + shelterPet.forEat());
				System.out.println(allShelterPets +"'s fun meter is on " + shelterPet.forFun());
				System.out.println(allShelterPets +"'s sleep meter is on " + shelterPet.forSleep());
				System.out.println(allShelterPets +"'s water meter is on " + shelterPet.forDrink();
				
				
				System.out.println("Who would you like to play with pet do you want to work with today?");
				Scanner petKey = new Scanner(System.in);
				String allShelterPets = petKey.nextLine();
			
				
				
				
				//start loopin'
				
				while (true) {
					
				
				System.out.println("Pick a number from 1-7.)");
				System.out.println("()()()(");
				
				
				String menuOption = input.nextLine();
				}
	}
	private String forFun() {
		// TODO Auto-generated method stub
		return null;
	}

	private String forEat() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void menuOption() {
		System.out.println("1 to fed the pets");
		System.out.println("2 to give water to pets");
		System.out.println("3 to let the pets rest");
		System.out.println("4 to play");
		System.out.println("5 Adopt a pet");
		System.out.println("6 to shelter a new pet");
		System.out.println("7 to END");

		if (menuOption.contentEquals("help")) {
			menuOption();
			//continue;
		} else if (menuOption.contentEquals("1")) {
			System.out.println("Yummy! This is great!");
			((AmokVirtualPet) AmokVirtualPet.shelterPet).eat();
		} else if (menuOption.contentEquals("2")) {
			System.out.println("Thanks, that hit the spot!");
			((AmokVirtualPet) AmokVirtualPet.shelterPet).drink();
		} else if (menuOption.contentEquals("3")) {
			System.out.println("Rested");
			((AmokVirtualPet) AmokVirtualPet.shelterPet).sleep();
		} else if (menuOption.contentEquals("4")) {
			System.out.println("This was fun!!");
			((AmokVirtualPet) AmokVirtualPet.shelterPet).play();
		} else if (menuOption.contentEquals("5")) {
			System.out.println("Thank you, who would you like to Adapt?");
			//building out instructions for adaption
			//**********************\
			//don't for get assigning keys and values
		} else if (menuOption.contentEquals("6")) {
			System.out.println("Happy to welcome a new pet to the Shelter!");
			//building out instructions for to leave the pet in the AmokVirtualPetShelter
			//*********************
		} else if (menuOption.contentEquals("7")) {
			System.out.println("Thank you, come agian");

		} else {
			System.out.println("Sorry you can not sleep in any cage or eat any of the pet food!"
					+ "It is for pets only.  Please choosing a number from 1-7");
		}

//		thePet.tickAllPets();
//instructions in the AmokVirtualPetShelter
	}
//	input.close();

	private static void printMenu() {
		// TODO Auto-generated method stub

	}

	public int getFedAll() {
		return this.fedAll ;
	}

//			
//			public static void printMenu() {
				
//				System.out.println("Press 1 to feed me");
//				System.out.println("Press 2 to give me water");
//				System.out.println("Press 3 to play with me");
//				System.out.println("To see menu, type \"help\".");
//			private void tick() {
//	

//
//			private String haveFun() {
//				// TODO Auto-generated method stub
//				String fun;
//				return fun;
//			}
//
//			private String getDrink() {
//				// TODO Auto-generated method stub
//				return null;
//			}

}
