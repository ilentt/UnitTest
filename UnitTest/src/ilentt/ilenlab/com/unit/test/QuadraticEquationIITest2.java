package ilentt.ilenlab.com.unit.test;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class QuadraticEquationIITest2 {

	private int a,b,c;
	
	// parameter pass via constructor
	public QuadraticEquationIITest2(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	// declare parameters
	@Parameters(name = "{index}: QuadraticEquationII({0}, {1}, {2})")
	public static Iterable<Object[]> dataTest() {
		return Arrays.asList(new Object[][] {
			{1, 2, -3},
			{1, 2, 1},
			{9, 1, 1},
			{0, 1, 1},
			{0, 0, 1},
		});
	}
	
	@Test
	public void testRunQuadraticEquationII() {
		QuadraticEquationII q = new QuadraticEquationII();
		q.runQuadraticEquationII(a, b, c);
	}

}
