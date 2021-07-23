package game;

import fixtures.Room;

//This class represents the player moving through these rooms. 

public class Player {
//room current room : room player is in

	public Room currentRoom;
	public String direction;
	public String[] command;
	
	
	public String getCurrentRoom() {
		return "Current room: " + this.currentRoom.fName;
	}

	public void setCurrentRoom(Room roomManagerSetRoom) {
		this.currentRoom = roomManagerSetRoom;
	}


	public void action(Player p1) {
		// TODO Auto-generated method stub
		
	}
}
