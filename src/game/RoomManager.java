package game;

import fixtures.Room;

public class RoomManager {
	public Room startingRoom;
	String exit;
	private Room[] rooms = new Room[6];

	
	public RoomManager() {
		//super();
		//this.startingRoom = startingRoom;
	}

	// room starting room, room player starts in name, sdiscription, Ldiscroption
	public void init() {
		Room livingRoom = new Room("Living Room", "1",
				"You entered through the front door. there is a dead body in the middle of the living room. You notice bullet shells on the ground  \n"
						+ "and the vase broken down the hallway. You see a stair case going up as well with abloodly hand print on the wall.");
		
		this.rooms[0] = livingRoom;
		this.startingRoom = livingRoom;

		Room kitchen = new Room("kitchen!", "a",
				"You entered the room like a pro and now standing in the middle of. You see nothing in the room." + "\n"
						+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor."
						+ "\n" + "To the north is a small room, where you can see a piano.");
		this.rooms[1] = kitchen;
		
		
		Room bathroom = new Room("bathroom!", "b",
				"You entered the room like a pro and now standing in the middle of. You see nothing in the room." + "\n"
						+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor."
						+ "\n" + "To the north is a small room, where you can see a piano.");
		this.rooms[2] = bathroom;
		
		Room laundryRoom = new Room("bathroom!", "c",
				"You entered the room like a pro and now standing in the middle of. You see nothing in the room." + "\n"
						+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor."
						+ "\n" + "To the north is a small room, where you can see a piano.");
		
		this.rooms[3] = laundryRoom;
		// room = new room( " ", " ", " ",);	// for making more rooms later
	
		livingRoom.setExits(kitchen, null, laundryRoom, kitchen);	// set these to make sense and do it for each room
		
		kitchen.setExits(livingRoom, livingRoom, kitchen, laundryRoom);
		
	}


}