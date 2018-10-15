package components;

public class TimedAnswer {
	
	private int returnValue;
	private long duration;

	public TimedAnswer() {
	}

	public TimedAnswer(int returnValue, long duration) {
		super();
		this.returnValue = returnValue;
		this.duration = duration;
	}
	
	public int getReturnValue() {
		return returnValue;
	}
	public long getDuration() {
		return duration;
	}
	
}
