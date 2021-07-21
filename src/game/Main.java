package game;

import java.util.Scanner;

public class Main {

	int x =1;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("      The Way Out \n"
			            	+ "Would you like to play? (y/n)");
	

		char gameStart = s.next().charAt(0);  

               if( gameStart == 'y' || gameStart == 'Y'	) {
            	   Player player = new Player(x);
               }
        
}
/*
private static void printRoom(Player player) {
System.out.println("Current room is " + p1.currentRoom);
}
}

private static String[] collectInput() {
String gameStart = sc.nextLine();
}
	
private static void parse(String[] command, Player player) {

}

}*/