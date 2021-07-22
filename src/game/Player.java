package game;

import fixtures.Room;

//This class represents the player moving through these rooms. 

public class Player {
//room current room : room player is in

	public int movingRoom = 0;
	public Room currentRoom;
	public String action = "";
	public String roomTransfer = "";
	public String item;
	public String userDirectionInput;
	public String getCurrentRoom() {
		return "Current room: " + this.currentRoom.fName;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}


	public void action(Player p1) {
		// TODO Auto-generated method stub
		
	}
}
