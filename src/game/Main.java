package game;

import java.util.HashMap;
//This class will store the main(String[]) method for our game (and of course, it will be the only class that has a main(String[]) method). 
//This is where the game-loop will go, where we'll display a prompt, collect input, and parse that input
import java.util.Scanner;
import java.io.*;
import java.util.*;
import fixtures.Fixtures;
import fixtures.Room;

class Main {
	static Scanner s = new Scanner(System.in);
	static String Pos = "";
	static String[] input = new String[2];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("      The Red Suit \n" + "Would you like to play? (y/n). ");

		String gameStart = s.nextLine();

		if (gameStart.equals("y") || gameStart.equals("Y")) {

			Player p1 = new Player();
			RoomManager m1 = new RoomManager();

			m1.init();
			p1.setCurrentRoom(m1.startingRoom);

			do {
				printRoom(p1);
				collectInput();
				parse(input, p1);
			} while (gameStart != "q");
		}
	}

	private static void printRoom(Player p1) {
		System.out.println(p1.getCurrentRoom());
		System.out.println(p1.currentRoom.fLongDes);
		System.out.println("Exits:");

		HashMap<Integer, String> directionMap = new HashMap<>();
		directionMap.put(0, "North:");
		directionMap.put(1, "South:");
		directionMap.put(2, "East:");
		directionMap.put(3, "West:");

		for (int i = 0; i < 4; i++) {
			if (p1.currentRoom.getExits()[i] != null) {
				System.out.print(directionMap.get(i) + " " + p1.currentRoom.getExits()[i].fShortDes + "\n");
				
			}
		}
		System.out.println("What do you want to do?(q = quit)");
		System.out.println("---------------------------------");

	}

// improvements: check users input for errors and handle them, call an exception method or something
	private static String[] collectInput() {
		String sInput = "";

		sInput = s.nextLine();
		int spaceKey = sInput.indexOf(" ");
		if (spaceKey > 0) {

			input[0] = sInput.substring(0, spaceKey); // First command of the string before the space
			spaceKey++;
			input[1] = sInput.substring(spaceKey);
		} else {
			input[0] = sInput;
		}

		return (input); 
	}

	private static void parse(String[] commands, Player p1) {
		if (commands[0].equals("q")) { // use .equals when comparing strings!!!!!!
			System.out.println("Program ending");
			System.exit(0);
		}
		p1.currentRoom = p1.currentRoom.getExit(commands[1]); 
	}
}
