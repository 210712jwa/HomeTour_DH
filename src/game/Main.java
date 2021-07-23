package game;

//This class will store the main(String[]) method for our game (and of course, it will be the only class that has a main(String[]) method). 
//This is where the game-loop will go, where we'll display a prompt, collect input, and parse that input
import java.util.Scanner;

import fixtures.Fixtures;
import fixtures.Room;

class Main {
	static Scanner s = new Scanner(System.in);
	static String Pos = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("      The Red Suit \n" + "Would you like to play? (y/n)");

		char gameStart = s.next().charAt(0);

		if (gameStart == 'y' || gameStart == 'Y') {

			Player p1 = new Player();
			RoomManager m1 = new RoomManager();

			String[] commands;

			int x = 1;

			m1.init();
			p1.setCurrentRoom(m1.startingRoom);
			printRoom(p1);
			
			m1.startingRoom.getExits();

		
			String[] userInput = collectInput();
			parse(userInput, p1);
			// now use p1.direction and item
			// 


		}
	}

	private static void printRoom(Player p1) {
		System.out.println(p1.getCurrentRoom());
		System.out.println(p1.currentRoom.fLongDes);
		
		for (int i = 0; i < 4; i++) { 
			
			if(p1.currentRoom.getExits()[i] !=  null) {
			System.out.print(p1.direction + " ");
			System.out.print(p1.currentRoom.getExits()[i].fShortDes);
			System.out.println();
			}

		}
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
		String commands1 = commands[0];
		String commands2 = commands[1];
		//
		// p1.currentRoom = p1.currentRoom.getExit(command)

	}
}
