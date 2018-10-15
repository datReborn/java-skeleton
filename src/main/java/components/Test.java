package components;

public class Test<I> {

	private int testNumber;
	private I input;
	private int output;

	public Test() {
	}

	public Test(int testNumber, I input, int output) {
		super();
		this.testNumber = testNumber;
		this.input = input;
		this.output = output;
	}

	public int getTestNumber() {
		return testNumber;
	}

	public void setTestNumber(int testNumber) {
		this.testNumber = testNumber;
	}

	public I getInput() {
		return input;
	}

	public void setInput(I input) {
		this.input = input;
	}

	public int getOutput() {
		return output;
	}

	public void setOutput(int output) {
		this.output = output;
	}
	
	
	
}
