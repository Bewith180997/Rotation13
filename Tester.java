import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class Tester {
	
	@Test
	void test01() {
		char rotation = (char) 13;
		String message = "Hello World";
		String expectedOutput = "Uryyb Jbeyq";
		
		assertEquals(Rot13.rotate(message, rotation), expectedOutput);
	}

	@Test
	void test02() {
		char rotation = (char) 13;
		String message = "The Number 16.";
		String expectedOutput = "Gur Ahzore 16.";
		
		assertEquals(Rot13.rotate(message, rotation), expectedOutput);
	}

	@Test
	void test03() {
		char rotation = (char) 19;
		String message = "Hello World!";
		String expectedOutput = "Axeeh Phkew!";
	
		assertEquals(Rot13.rotate(message, rotation), expectedOutput);
	}
	
	@Test
	void test04() {
		String[] message = {"Hello World", "13"};
		Rot13.main(message);
	}
}
