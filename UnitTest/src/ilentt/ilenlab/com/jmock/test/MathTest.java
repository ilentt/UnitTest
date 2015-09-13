package ilentt.ilenlab.com.jmock.test;

public class MathTest {
	public Math math;
	
	public MathTest(Math math) {
		this.math = math;
	}
	
	public int testMock() {
		int result = math.Add(1, 2);
		return result;
	}
}
