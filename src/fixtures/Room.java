package fixtures;
//This class represents a room in the house. It will extend fixtures.Fixture, and so will inherit the descriptive properties. 

//The Room will also have the following properties:

//Room[] exits : the rooms adjacent to this one. You might decide that a room in a particular direction always uses 
//a certain index, e.g. a north exit always goes in index 0, an east exit always goes in index 1, etc. 
//If so, then the size of this array depends on how many directions you want to support.

public class Room extends Fixtures {
	int spot = 0;
	int i = 0;
	String direction;
	String fname;

	private Room[] exits;

	// if(what evere place ur in, list exits)

	public Room(String fName, String fShortDes, String fLongDes) {
		super(fName, fShortDes, fLongDes);
		this.exits = new Room[4]; // size is your choice
	}


	public Room[] getExits() {
		return exits;
	}

	public void setExits(Room N, Room S, Room E, Room W) {
		exits[0] = N;
		exits[1] = S;
		exits[2] = E;
		exits[3] = W;

		
	}

	public void ExitOption(String direction) {
		// TODO Auto-generated method stub
		if (direction == "north") {
			spot = 1;
		} else if (direction == "south") {
			spot = 2;
		}
	}

}
