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

		Room kitchen = new Room("kitchen!", "The Kitchen",
				"You entered the kitchen. The floors look clean and it looks nice. Only issue is that is smells like salt.");
		this.rooms[1] = kitchen;
		
		
		Room bathroom = new Room("bathroom", "The Bathroom",
				"You entered the bathroom. You decided to give the stool as try and tested to see if it held your weight for 15 minutes.");
		this.rooms[2] = bathroom;
		
		Room laundryRoom = new Room("Laundry Room", "The Laundry Room",
				"Its nice. fits washer and dryer");
		this.rooms[3] = laundryRoom;
		
		Room diningRoom = new Room("Dining Room", "The Dining Room",
				"Plenty of room for a table to eat on or a cool man cave spot.");
		this.rooms[4] = diningRoom;
		
		Room garage = new Room("garage", "The Garage",
				"You have no garage...");
		this.rooms[5] = garage;
		
		// room = new room( " ", " ", " ",);	// for making more rooms later
	
		livingRoom.setExits(kitchen, null, bathroom, diningRoom);	// set these to make sense and do it for each room
		
		kitchen.setExits(laundryRoom, null, garage, null);
		
		bathroom.setExits(null, null, null, livingRoom);
		
		diningRoom.setExits(diningRoom, null, livingRoom, null);
		
		garage.setExits(laundryRoom, null, null, kitchen);
		
		laundryRoom.setExits(null, kitchen, garage, null);
		
	}


}