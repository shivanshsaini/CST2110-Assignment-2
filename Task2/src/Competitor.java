
public class Competitor {
	private int competitionNumber;
	private String name;
	private char gender;
	
	public Competitor(int competitionNumber, String name, char gender) {
		super();
		this.competitionNumber = competitionNumber;
		this.name = name;
		this.gender = gender;
	}

	public int getCompetitionNumber() {
		return competitionNumber;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}
	
}
