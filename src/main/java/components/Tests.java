package components;

public class Tests<I> {
	
	private String questionNumber;
	private Test<I>[] tests;

	public Tests() {
	}

	public Tests(String questionNumber, Test<I>[] tests) {
		super();
		this.questionNumber = questionNumber;
		this.tests = tests;
	}
	
	public String getQuestionNumber() {
		return questionNumber;
	}
	public void setQuestionNumber(String questionNumber) {
		this.questionNumber = questionNumber;
	}
	public Test<I>[] getTests() {
		return tests;
	}
	public void setTests(Test<I>[] tests) {
		this.tests = tests;
	}

}
