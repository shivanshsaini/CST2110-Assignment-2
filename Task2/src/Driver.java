

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Club club = new Club();
		Scanner scan = new Scanner(System.in);
		int input = 1;
		while(input != 4) {
			System.out.println("1. List Event Information");
			System.out.println("2. List Competitor Events");
			System.out.println("3. List Event's Attempts");
			System.out.println("4. Exit");
			System.out.print(">");
			input = scan.nextInt();
			switch(input) {
				case 1: club.listEventInformation();
				break;
				case 2: club.listCompetitorEvents();
				break;
				case 3: club.listEventAttempts();
				break;
			}
		}
		System.out.println("Exiting...");
	}
}
