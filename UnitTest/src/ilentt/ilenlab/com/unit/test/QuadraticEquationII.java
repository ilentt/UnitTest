package ilentt.ilenlab.com.unit.test;

public class QuadraticEquationII {
	
	private double delta,x1,x2;
	/*
	public QuadraticEquationII() {
		// constructor
		delta = 0;
		x1 = 0;
		x2 = 0;
	}
	*/
	public void runQuadraticEquationII(int a, int b, int c) {
		if(a!=0) {
			delta = (b*b - 4*a*c);
			if(delta>0) {
				x1 = (-b + Math.sqrt(delta))/2*a;
				x2 = (-b - Math.sqrt(delta))/2*a;
				
				System.out.println("x1: " + x1);
				System.out.println("x2: " + x2);
			}
			else if(delta==0) {
				System.out.println("x1 = x2: " + -b/2*a);
			}
			else
				System.out.println("Equation without solution");
		}
		else {
			if(b!=0)
				System.out.println("x: "+ (-c/b) );
			else
				System.out.println("Equation without solution");
		}
			
	}
	/*
	public static void main(String[] args) {
		QuadraticEquationII q = new QuadraticEquationII();
		q.runQuadraticEquationII(1, 2, -3);
	}
	*/
}
