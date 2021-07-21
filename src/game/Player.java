package game;

public class Player {
//room current room : room player is in
	public int CurrentRoom;
	
	public Player(int room) {
		this.CurrentRoom = room;
		
	}
	
	
	public void printroom() {
		System.out.println("Current roomj is: ");
		
		switch(CurrentRoom) {
		case 1:
			System.out.println("Front Door");
			break;
		case 2:
			System.out.println("another entry");
			
		}
	}
	
}
