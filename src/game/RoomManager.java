package game;

import fixtures.Room;

public class RoomManager {
	public Room[] rooms;
	public Room startingRoom;

	//room starting room, room player starts in
	public void init() {
	    Room livingRoom = new Room(
			"Living Room",
			"a small living room",
			"You entered " + "\n"
			+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
			+ "To the north is a small room, where you can see a piano.");
			this.rooms[0] = livingRoom;
	        this.startingRoom = livingRoom;
	}
	//room[] rooms: all rooms in the house
	public void TrapRoom() {
	room bedRoom = new Room()
			"Trap Room!",
			"Spots on floor trigger spikes and deal damage to you",
			"You entered the room like a pro and now standing in the middle of. You see nothing in the room." + "\n"
			+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
			+ "To the north is a small room, where you can see a piano.");
			this.rooms[0] = bedRoom;
	        this.startingRoom = bedRoom;
}
}  