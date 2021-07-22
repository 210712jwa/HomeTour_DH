package game;

//This class will store the main(String[]) method for our game (and of course, it will be the only class that has a main(String[]) method). 
//This is where the game-loop will go, where we'll display a prompt, collect input, and parse that input
import java.util.Scanner;

import fixtures.Fixtures;
import fixtures.Room;

class Main {
	static Scanner s = new Scanner(System.in);
	static int Pos = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("      The Red Suit \n" + "Would you like to play? (y/n)");

		char gameStart = s.next().charAt(0);

		if (gameStart == 'y' || gameStart == 'Y') {
			/*
			 * 1. you need to make a fixture class room object 2. Pass i into room.object
			 * from RoomManager 3. display info of Fixture objects details with getters
			 * 
			 */

			Player p1 = new Player();
			RoomManager m1 = new RoomManager();
			String[] commands;

			int x = 1;
			m1.init();
			p1.setCurrentRoom(m1.startingRoom);
			printRoom(p1);

			m1.ExitOptions();
			String[] userInput = collectInput();
			parse(userInput, p1);
			// now use p1.direction and item
			m1.checkP1Input(p1.direction, p1.item);
			
			//m1.checkP1Action(p1.action, p1.roomTransfer);

		}
	}

	private static void printRoom(Player p1) {
		System.out.println(p1.getCurrentRoom());
		System.out.println(p1.currentRoom.fLongDes);
	}

	private static String[] collectInput() {

		String action = s.nextLine();
		String direction = s.nextLine();

		String sUserInput[] = new String[2];
		String sInput = "";

		sInput = s.nextLine();

		int spaceKey = sInput.indexOf(" "); // look for 1st space

		if (spaceKey > 0) {

			sUserInput[0] = sInput.substring(0, spaceKey); // First command of the string before the space
			spaceKey++;
			sUserInput[1] = sInput.substring(spaceKey); // get the rest of the string
		}

		return (sUserInput);
	}

	private static void parse(String[] commands, Player p1) {

		String command1 = commands[0];
		String command2 = commands[1];
		
		
		

		// p1 needs to check to see if its "go" or "inspect" action. command from
		// collectionInput in split into 2. use [0] for command and [1] for the sName

		// if its "go" we change rooms,
		// if its "inspect", we just display some text
		if (command1 == "go") { // CHECK TO MAKE SURE IT CALLS IT RIGHT. USE .compareto to get "go" and "GO"
			// get ready to move room
			p1.direction = command2; 
		}
		else if( command1 == "inspect") {
			p1.item = command2;
		}
		else {
			System.out.println("invalid command");
		}
	}
}
