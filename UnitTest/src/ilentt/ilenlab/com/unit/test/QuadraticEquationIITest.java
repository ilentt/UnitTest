package ilentt.ilenlab.com.unit.test;

import org.junit.Test;

public class QuadraticEquationIITest {

	/*
	public void testMain() {
		QuadraticEquationII.main(new String [] {});
	}
	*/
	@Test
	public void testRunQuadraticEquationII() {
		QuadraticEquationII q = new QuadraticEquationII();
		
		q.runQuadraticEquationII(1, 2, -3); // equation have two solution, coverage: 62.2%
		
		q.runQuadraticEquationII(1, 2, 1); // equation have two solution, they're equals, coverage: 80.2%
		
		q.runQuadraticEquationII(9, 1, 1); // delta < 0, coverage: 83.8%
		
		q.runQuadraticEquationII(0, 1, 1); // a = 0, coverage: 97.3%
		
		q.runQuadraticEquationII(0, 0, 1); // a,b = 0 and c != 0
		
	}
}
