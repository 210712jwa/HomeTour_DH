package game;

import fixtures.Room;

public class RoomManager {
	public Room startingRoom;
	String exit;
	int spotter = 0;
	private Room[] rooms = new Room[Room.x];

	
	public RoomManager() {
		//super();
		//this.startingRoom = startingRoom;
	}

	// room starting room, room player starts in name, sdiscription, Ldiscroption
	public void init() {
		Room livingRoom = new Room("Living Room", "a small living room",
				"You entered through the front door. there is a dead body in the middle of the living room. You notice bullet shells on the ground  \n"
						+ "and the vase broken down the hallway. You see a stair case going up as well with abloodly hand print on the wall.");
		this.rooms[0] = livingRoom;
		this.startingRoom = livingRoom;
		spotter = 0;

	}

	// room[] rooms: all rooms in the house
	public void Kitchen() {
		Room kitchen = new Room("kitchen!", "Spots on floor trigger spikes and deal damage to you",
				"You entered the room like a pro and now standing in the middle of. You see nothing in the room." + "\n"
						+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor."
						+ "\n" + "To the north is a small room, where you can see a piano.");
		this.rooms[1] = kitchen;
		this.startingRoom = kitchen;
		spotter = 1;
	}

	public void upstairs() {
		Room bathroom = new Room("kitchen!", "Spots on floor trigger spikes and deal damage to you",
				"You entered the room like a pro and now standing in the middle of. You see nothing in the room." + "\n"
						+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor."
						+ "\n" + "To the north is a small room, where you can see a piano.");
		this.rooms[2] = bathroom;
		this.startingRoom = bathroom;
		spotter = 2;
	}
	
	
	public void ExitOptions() {
		String n ="";
		String s ="";
		String e= "";
		String w= "";
		System.out.println("Exits:");
		if (spotter == 0) {
			n = "Kitchen";
			s = "back outside";
			e = "upstairs";
			w = "Inspect the body";
	
		}
		if (spotter == 1) {
			n = "kitchen opt 1";
			s = "k opt 2";
			e = "k opt 3";
			w = "k opt 4";
		}
		if (spotter == 2) {
			n = "bathroom";
			s = "b opt 2";
			e = "b3";
			w = "b4";
		}
		if (spotter == 3) {
			n = "basement";
			s = "b2";
			e = "b3";
			w = "b4";
		}
		if (spotter == 4) {
			n = "bedroom";
			s = "b2";
			e = "b3";
			w = "b4";
		}
	
	System.out.println("North: "+n);
	System.out.println("South: "+s);
	System.out.println("East: "+e);
	System.out.println("West: "+w);
	System.out.println("What would you like to do?");
	}

	public void checkP1Input(String action, String item) {
		String[] commands;
		Object p1;
		// TODO Auto-generated method stub
		// if its "go" we change rooms,
		// if its "inspect", we just display some text
	//	if(commands [0] == "go" ) {	// CHECK TO MAKE SURE IT CALLS IT RIGHT. USE .compareto to get "go" and "GO"
	//		p1.action = action;
	//		p1.roomTransfer = command;
//		}
	//	else if(commands[1] == "inspect") {
	//		p1.action(p1);
//		}
	//	else {
	//		System.out.println("Nothing happened...");
	//	}
	}

	
}