

public class Attempt {
	private int score;
	private Routine rout;
	
	public Attempt(Routine rout) {
		this.rout = rout;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public int getRating() {
		return rout.getRating();
	}
	
	public void getRoutine() {
		System.out.println("Routine: " + rout.getDesc() + ", Rating: " + rout.getRating());
	}
	
}
