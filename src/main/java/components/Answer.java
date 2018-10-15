package components;

public class Answer {
	
	private String teamName;
	private String questionNumber;
	private int testNumber;
	private boolean correct;
	private long speed;

	public Answer() {
	}

	public Answer(String teamName, String questionNumber, int testNumber, boolean correct, long speed) {
		super();
		this.teamName = teamName;
		this.questionNumber = questionNumber;
		this.testNumber = testNumber;
		this.correct = correct;
		this.speed = speed;
	}

	public String getTeamName() {
		return teamName;
	}

	public String getQuestionNumber() {
		return questionNumber;
	}

	public int getTestNumber() {
		return testNumber;
	}

	public boolean isCorrect() {
		return correct;
	}

	public long getSpeed() {
		return speed;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void setQuestionNumber(String questionNumber) {
		this.questionNumber = questionNumber;
	}

	public void setTestNumber(int testNumber) {
		this.testNumber = testNumber;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}

	public void setSpeed(long speed) {
		this.speed = speed;
	}
}
