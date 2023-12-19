

import java.util.Scanner;

public class Club {
	private Event[] events;
	
	public Club() {
		this.events = new Event[10];
		events[0] = new Event("Floor Exercise", "8:45am", 'm', new String[]{"Matt heffner", "Steve Joky"});
		events[1] = new Event("Pommel Horse", "9:45am", 'm', new String[]{"Joe Benner"});
		events[2] = new Event("Still Rings", "10:45am", 'm', new String[]{"Jordan Wonzski"});
		events[3] = new Event("Vault", "11:45am", 'm', new String[]{"Matt heffner", "Steve Joky"});
		events[4] = new Event("Parallel Bars", "12:45pm", 'm', new String[]{"Joe Benner"});
		events[5] = new Event("Still Rings", "13:45pm", 'm', new String[]{"Jordan Wonzski"});
		events[6] = new Event("Balance Beam", "14:45pm", 'f', new String[]{"Jordan Wonzski", "Matt heffner"});
		events[7] = new Event("Uneven Bars", "15:45pm", 'f', new String[]{"Joe Benner", "Steve Joky"});
		events[8] = new Event("Floor Exercise", "16:45pm", 'f', new String[]{"Matt heffner", "Joe Benner"});	
		events[9] = new Event("Vault", "17:45pm", 'f', new String[]{"Matt heffner", "Joe Benner"});	
		
		Competitor malecompetitor1 = new Competitor(1, "Mikey Jones", 'm');
		Competitor malecompetitor2 = new Competitor(2, "Jonathan Pal", 'm');
		Competitor malecompetitor3 = new Competitor(3, "Trevor White", 'm');
		Competitor malecompetitor4 = new Competitor(4, "Mackel Thomas", 'm');
		Competitor malecompetitor5 = new Competitor(4, "Jose Anton", 'm');
		Competitor malecompetitor6 = new Competitor(5, "John Evans", 'm');
		Competitor malecompetitor7 = new Competitor(6, "Brett Hue", 'm');
		Competitor malecompetitor8 = new Competitor(7, "Lionel Calder", 'm');
		Competitor malecompetitor9 = new Competitor(8, "Vincent Jeoffery", 'm');
		events[0].registerParticipant(malecompetitor1, 7);
		events[0].registerParticipant(malecompetitor2, 3);
		events[0].registerParticipant(malecompetitor3, 7);
		events[0].registerParticipant(malecompetitor4, 3);
		
		events[1].registerParticipant(malecompetitor6, 7);
		events[1].registerParticipant(malecompetitor7, 3);
		events[1].registerParticipant(malecompetitor8, 7);
		events[1].registerParticipant(malecompetitor9, 3);
		
		events[2].registerParticipant(malecompetitor1, 7);
		events[2].registerParticipant(malecompetitor7, 3);
		events[2].registerParticipant(malecompetitor6, 7);
		events[2].registerParticipant(malecompetitor8, 3);
		
		events[3].registerParticipant(malecompetitor9, 7);
		events[3].registerParticipant(malecompetitor2, 3);
		events[3].registerParticipant(malecompetitor5, 7);
		events[3].registerParticipant(malecompetitor3, 3);
		
		events[4].registerParticipant(malecompetitor2, 7);
		events[4].registerParticipant(malecompetitor4, 3);
		events[4].registerParticipant(malecompetitor1, 7);
		events[4].registerParticipant(malecompetitor3, 3);
		
		events[5].registerParticipant(malecompetitor2, 7);
		events[5].registerParticipant(malecompetitor4, 9);
		events[5].registerParticipant(malecompetitor8, 7);
		events[5].registerParticipant(malecompetitor6, 2);
		
		Competitor femalecompetitor1 = new Competitor(1, "Misty Joyner", 'f');
		Competitor femalecompetitor2 = new Competitor(2, "Kelly Rich", 'f');
		Competitor femalecompetitor3 = new Competitor(3, "Samantha Brown", 'f');
		Competitor femalecompetitor4 = new Competitor(4, "Molly Anderson", 'f');
		Competitor femalecompetitor5 = new Competitor(3, "Winona Smith", 'f');
		Competitor femalecompetitor6 = new Competitor(4, "Rose Hernandes", 'f');
		events[6].registerParticipant(femalecompetitor1, 7);
		events[6].registerParticipant(femalecompetitor2, 3);
		events[6].registerParticipant(femalecompetitor3, 7);
		events[6].registerParticipant(femalecompetitor4, 3);
		
		events[7].registerParticipant(femalecompetitor2, 7);
		events[7].registerParticipant(femalecompetitor3, 3);
		events[7].registerParticipant(femalecompetitor4, 7);
		events[7].registerParticipant(femalecompetitor5, 3);
		
		events[8].registerParticipant(femalecompetitor3, 7);
		events[8].registerParticipant(femalecompetitor4, 3);
		events[8].registerParticipant(femalecompetitor5, 7);
		events[8].registerParticipant(femalecompetitor6, 3);
		
		events[9].registerParticipant(femalecompetitor4, 7);
		events[9].registerParticipant(femalecompetitor5, 3);
		events[9].registerParticipant(femalecompetitor6, 7);
		events[9].registerParticipant(femalecompetitor1, 3);
		
	}
	
	public void listEventInformation() {
		Scanner scan = new Scanner(System.in);
		String event;
		System.out.println("Enter event name: ");
		event = scan.nextLine().toLowerCase();
		
		if(event.equals("floor exercise") || event.equals("vault")){
			System.out.println("Enter m for male event. Enter f for female event: ");
			char gender = scan.nextLine().toLowerCase().charAt(0);
			
			for(int i = 0; i < events.length; i++) {
				if(events[i].getDesc().toLowerCase().equals(event) && events[i].getType() == gender) {
					System.out.println("Description=" + events[i].getDesc() + ", Number of participants=" + events[i].getParticipantCount());
					events[i].getOrganizers();
					events[i].getParticipants();
				}
			}
			return;
		}
		for(int i = 0; i < events.length; i++) {
			if(events[i].getDesc().toLowerCase().equals(event)) {
				System.out.println("Description=" + events[i].getDesc() + ", Number of participants=" + events[i].getParticipantCount());
				events[i].getOrganizers();
				events[i].getParticipants();
			}
		}
	}
	
	public void listCompetitorEvents() {
		Scanner scan = new Scanner(System.in);
		String name;
		System.out.println("Enter competitor name: ");
		name = scan.nextLine().toLowerCase();
		Competitor[] participants;
		Attempt[] attempts;
		for(int i = 0; i < events.length; i++) {
			participants = events[i].getParticipantsArray();
			attempts = events[i].getAttemptsArray();
			for(int j = 0; j < events[i].getParticipantCount(); j++) {
				if(participants[j].getName().toLowerCase().equals(name)) {
					System.out.println("Event="+ events[j].getDesc());
					attempts[j].getRoutine();
					System.out.println();
				}
			}
		}
	}
	
	public void listEventAttempts() {
		Scanner scan = new Scanner(System.in);
		String event;
		System.out.println("Enter event name: ");
		event = scan.nextLine().toLowerCase();
		
		if(event.equals("floor exercise") || event.equals("vault")){
			System.out.println("Enter m for male event. Enter f for female event: ");
			char gender = scan.nextLine().toLowerCase().charAt(0);
			
			for(int i = 0; i < events.length; i++) {
				if(events[i].getDesc().toLowerCase().equals(event) && events[i].getType() == gender) {
					events[i].allAttemptsInfo();
				}
			}
			return;
		}
		for(int i = 0; i < events.length; i++) {
			if(events[i].getDesc().toLowerCase().equals(event)) {
				events[i].allAttemptsInfo();
			}
		}
	}
	
}
