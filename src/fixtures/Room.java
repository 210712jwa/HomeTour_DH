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
	public static int x = 5; // how many exits

	// if(what evere place ur in, list exits)

	public Room(String fName, String fShortDes, String fLongDes) {
		super(fName, fShortDes, fLongDes);

	}

	public Room getExit(String direction) {
		this.direction = direction;
		System.out.println(direction);
		return null;
	}

	public Room[] getExits(Room fShortDes) {
		return exits;

	}

	public void ExitOptions(Room[] roomscheck) {
		Room[] b;
		b = roomscheck;

	}

}
