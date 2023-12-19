
public class Event {
	private String desc;
	private String time;
	private char type;
	private String[] organizers;
	private Competitor[] participants;
	private Attempt[] attempts;
	private int participantCount;
	
	public Event(String desc, String time, char type, String[] organizers) {
		this.desc = desc;
		this.time = time;
		this.type = type;
		this.organizers = organizers;
		this.participants = new Competitor[10];
		this.attempts = new Attempt[10];
	}
	
	public char getType() {
		return type;
	}

	public String getDesc() {
		return desc;
	}

	public String getTime() {
		return time;
	}

	public void getOrganizers() {
		System.out.println("========Organizer=========");
		for(int i = 0; i < organizers.length; i++) {
			if(organizers[i] != null) {
				System.out.println(organizers[i]);
			}
		}
		System.out.println("==========================");
	}
	
	public void registerParticipant(Competitor participant, int difficulty) {
		if(participantCount < 10) {
			participants[participantCount] = participant;
			attempts[participantCount] = new Attempt(new Routine(desc, difficulty));
			participantCount++;
		}
	}
	
	public Competitor[] getParticipantsArray() {
		return participants;
	}
	
	public Attempt[] getAttemptsArray() {
		return attempts;
	}
	
	public void getParticipants() {
		System.out.println("=================PARTICIPANTS===================");
		for(int i = 0; i < participantCount; i++) {
			System.out.println("ID=" + participants[i].getCompetitionNumber() + ", Name=" + participants[i].getName());
		}
		System.out.println("================================================");
	}

	public int getParticipantCount() {
		return participantCount;
	}
	
	public void allAttemptsInfo() {
		System.out.println("Event=" + desc + ", Number of Participants=" + participantCount);
		for(int i = 0; i < participantCount; i++) {
			System.out.println("===========================");
			System.out.println("ID=" + participants[i].getCompetitionNumber() + ", Name=" + participants[i].getName());
			attempts[i].getRoutine();
			System.out.println("Score=" + attempts[i].getRating() * 9);
		}
	}
	
}
