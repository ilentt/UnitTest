package ilentt.ilenlab.com.jmock.test;

import junit.framework.Assert;

import org.jmock.Mockery;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class JMockTest {

	@Test
	public void test() {
		Mockery mockery = new Mockery();
		final Math math = mockery.mock(Math.class);
		mockery.checking(new org.jmock.Expectations()
		{{
			oneOf(math).Add(1,2);
			will(returnValue((3)));
		}});
		
		int i = math.Add(1, 2);
		System.out.println(i);
		Assert.assertEquals(i, 3);
	}
	

}
