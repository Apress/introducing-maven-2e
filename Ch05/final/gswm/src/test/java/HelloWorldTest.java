import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class HelloWorldTest {

	private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();
	
	@Before
	public void setUp() {
	    System.setOut(new PrintStream(outStream));
	}

	@Test
	public void testSayHello() {
		HelloWorld hw = new HelloWorld();
		hw.sayHello();
		Assert.assertEquals("Hello World", outStream.toString());
	}
	
	@After
	public void cleanUp() {
	    System.setOut(null);
	}
	
}
