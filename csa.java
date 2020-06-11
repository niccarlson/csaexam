93Y649Y9
N.C.


private Animal createNewAnimal(String name, String type, double age)
{
	int typeCount = 0;
	for(Animal animal : allAnimals) {
		if(animal.getType() == type){
			typeCount++;
		}
	}

	int cost = 15;
	if (age < 1 && typeCount < 5) {
		cost = 25;
	} else if (age < 1 && typeCount > 5) {
		cost = 20;
	}

	return new Animal(name, type, age, cost);
}


public void addAnimal(String name, String type, double age)
{
	int k = 0;
	while(k < allAnimals.size() && age > allAnimals.get(k).getAge())
	{
		k++;
	}

	allAnimals.add(k, createNewAnimal(name, type, age));
}


/*
Using method header "public int getAnimalWithMostInterest()", I would add an additional integer parameter to the Animal object called "interest", to be incremented for that animal every time a question is asked about the animal. This could be done by calling a "public void questionAsked(index)" with index = the index of the animal who had a question asked about them. The getAnimalWithMostInterest function would then use a for loop to iterate through every item in allAnimals. Before looping, int "mostInterestIndex" would be defined as 0 outside of the loop for global access. For each repeat of the loop, it would call "public int getInterest(int id)" with id = the current loop iteration number (i), and compare that with getInterest(mostInterestIndex). If getInterest(mostInterestIndex) is greater than getInterest(i), the loop would not change anything. If getInterest(mostInterestIndex) is lesser than getInterest(i), make mostInterestIndex = i. After completing the loop, return allAnimals.get(mostInterestIndex).
*/