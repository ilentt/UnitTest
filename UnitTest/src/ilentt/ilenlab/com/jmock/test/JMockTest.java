package ilentt.ilenlab.com.jmock.test;

import junit.framework.Assert;

import org.jmock.Mockery;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class JMockTest {

	@Test
	public void testAdd() {
		final int a=1;
		final int b=2;
		
		Mockery mockery = new Mockery();
		final Math math = mockery.mock(Math.class);
		mockery.checking(new org.jmock.Expectations() {{
			oneOf(math).Add(a,b);
			will(returnValue(a+b));
		}});
		
		int i = math.Add(a, b);
		System.out.println(i);
		Assert.assertEquals(i, 3);
	}
	

}
