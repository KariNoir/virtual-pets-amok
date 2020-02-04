package amok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class AmokVirtualPetShelterAppTest<ShelterPet> {

//	OLD STUFF
//	Create a main method that…
//	implements a game loop.
//	asks for user input.
//	writes output to the console.
//	calls VirtualPetShelter’s tick method after each interaction
//	Available user interface actions should include (at minimum)…
//	feeding all the pets
//	watering all the pets
//	playing with an individual pet, which should display a list of pet names and descriptions, allowing a user to select one
//	allow adoption of a pet, which should display a list of pet names and descriptions, allowing a user to select one
//	allow intake of a pet, prompting the user for the pet’s information, requiring the user to (at minimum) specify name and description
//	
//	include appropriate instance variable(s) to store the pets who reside at the shelter
//	include methods that:
//	return a Collection of all of the pets in the shelter
//	return a specific VirtualPet given its name
//	allow intake of a homeless pet
//	allow adoption of a homeless pet
//	feed all of the pets in the shelter
//	water all of the pets in the shelter
//	plays (or performs some other interaction(s)) with an individual pet in the shelter
//	
//	
// NEW STUFF
//	walk all dogs
//	clean dog cages
//	clean the shelter litterbox
//	oil all robotic pet

	AmokVirtualPet underTest = new AmokVirtualPet(0, 0, 0, 0, 0); // calling default constructor
	private Object pet1;

	@Test
	public void shouldWalkPet() {
		// act
		int result = underTest.getWalkAllDogs(); // makes a method in VP2 class
		// assert
		assertEquals(6+1, result);
	}

	@Test
	public void allPetsgetfed() {
		int result = underTest.getFedAll();
		assertEquals(6 + 1, result);
	}


@Test
public void shouldBeAbleToAddPet() {
	underTest.add(pet1);
	Object retrievedPet = underTest.findPet("Thor");
	assertThat(retrievedPet, is(pet1));
}}

//	@Test
//	public void hungerShouldDecreaseBy1AfterEat() {
//		// act
//		int beforeEat = underTest.getHunger();
//		underTest.eat(); // void - just eats
//		int result = underTest.getHunger();
//		// assert
//		assertEquals(beforeEat - 1, result);
//	}
//	@Test
//	public void thirstShouldBe0AtStart() {
//		// act
//		int result = underTest.getThirst(); // makes a method in VP2 class
//		// assert
//		assertEquals(0, result);
//	}
//	@Test
//	public void thirstShouldDecreaseBy1AfterDrink() {
//		// act
//		int beforeDrink = underTest.getThirst();
//		underTest.drink(); // void - just eats
//		int result = underTest.getThirst();
//		// assert
//		assertEquals(beforeDrink - 1, result);
//	}
//	@Test
//	public void boredomShouldBe0AtStart() {
//		// act
//		int result = underTest.getBoredom(); // makes a method in VP2 class
//		// assert
//		assertEquals(0, result);
//	}
//	@Test
//	public void boredomShouldDecreaseBy1AfterPlay() {
//		// act
//		int beforePlay = underTest.getBoredom();
//		underTest.play(); // void - just eats
//		int result = underTest.getBoredom();
//		// assert
//		assertEquals(beforePlay - 1, result);
//	}
//	@Test
//	public void boredomShouldIncreaseBy1AfterTick() {
//		// Act
//		int beforePlay = underTest.getBoredom();
//		underTest.tick();
//		int result = underTest.getBoredom();
//		assertEquals(beforePlay + 1, result);
//	}
//	@Test
//	public void thirstShouldIncreaseBy1AfterTick() {
//		// Act
//		int beforeDrink = underTest.getThirst();
//		underTest.tick();
//		int result = underTest.getThirst();
//		assertEquals(beforeDrink + 1, result);
//	}
//	@Test
//	public void hungerShouldIncreaseBy1AfterTick() {
//		// Act
//		int beforeEat = underTest.getHunger();
//		underTest.tick();
//		int result = underTest.getHunger();
//		// assert
//		assertEquals(beforeEat + 1, result);
//	}
//	@Test
//	public void shouldReturnBobAndLittleAndCuteOnInitialization() {
//		//arrange
//		VirtualPet2 petBio = new VirtualPet2("Bob", "little and cute!");
//		//act
//		String petName = petBio.getPetName();
//		String petDescription = petBio.getPetDescription();
//		//assert
//		assertEquals("Bob", petName);
//		assertEquals("little and cute!", petDescription);
//	}
//	@Test
//	public void shouldReturnFluffyAndTiredOnInitialization() {
//		//arrange
//		VirtualPet2 petBio = new VirtualPet2("Fluffy", "Tired");
//		//act
//		String petName = petBio.getPetName();
//		String petDescription = petBio.getPetDescription();
//		//assert
//		assertEquals("Fluffy", petName);
//		assertEquals("Tired", petDescription);
//	}
//	@Test
//	public void shouldReturnDefaultValues() {
//		//return name, description, hunger, thirst, and boredom
//		//arrange
//		VirtualPet2 fullPet = new VirtualPet2("Fluffy", "Tired", 2, 3, 4);
//		//act
//		String petName = fullPet.getPetName();
//		String petDescription = fullPet.getPetDescription();
//		int petHunger = fullPet.getHunger();
//		int petThirst = fullPet.getThirst();
//		int petBoredom = fullPet.getBoredom();
//		//assert
//		assertEquals("Fluffy", petName);
//		assertEquals("Tired", petDescription);
//		assertEquals(2, petHunger);
//		assertEquals(3, petThirst);
//		assertEquals(4, petBoredom);
//	}
//}
//}
