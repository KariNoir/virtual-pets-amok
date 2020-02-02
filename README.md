# virtual-pets-amok
I will maintain the classes that were already built out with these addition per the assignment:

additional requirements:

create a model that allows for dogs and cats, either of which may be robotic
introduce an attribute (instance variable) representing overall health that is updated as a result of other attributes moving in a negative or positive direction, influencing happiness
introduce methods that allow for:
oiling robotic pets
walking dogs, decreasing the likelihood that organic dogs will soil their cages, while increasing happiness in all dogs
do not allow:
feeding/watering robotic pets
oiling organic pets
modify the tick method to return a value indicating the amount of waste a pet creates, which should contribute to either (optionally, create accessor methods to retrieve these values instead):
amount of waste in the litter box
amount of waste in an individual dog cage
-------------------------------------------------------------
VirtualPetShelter class
addition:

introduce methods that allow for:
oiling/maintaining all robotic pets
cleaning dog cages
emptying the litterbox
modify existing methods to only feed/water pets that are not robotic
----------------------------------------------------------------------------
VirtualPetShelterApp class
addition:

add options to:
walk all dogs (walk will decrease sleeep)
clean dog cages (will increase fun/play)
clean the shelter litterbox (will increase fun/play)
oil all robotic pets (will increase fun/play)
