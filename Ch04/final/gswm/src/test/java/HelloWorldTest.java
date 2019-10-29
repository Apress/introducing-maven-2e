import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;


/**
   Updated the test so that it is more platform independent
*/
public class HelloWorldTest {

	private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();

	@Before
	public void setUp() {
		System.setOut(new PrintStream(outStream));
	}

	@Test
	public void testSayHello2() throws IOException {
		HelloWorld hw = new HelloWorld();
		hw.sayHello();

		outStream.flush();
        String printedOutPut = new String(outStream.toByteArray());
		String[] outputData = printedOutPut.split(System.getProperty("line.separator"));


		Assert.assertEquals("Hello World", outputData[0]);
	}

	@After
	public void cleanUp(){
		System.setOut(null);
	}
	
}
