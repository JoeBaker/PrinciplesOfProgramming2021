import static org.junit.jupiter.api.Assertions.*;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileWritingUnitTests2 {

	FileReading fileReading;
	FileWriting fileWriting;
	FileWritingUtilities utilities;

	@BeforeEach
	void setUp() {
		fileReading = new FileReading();
		fileWriting = new FileWriting();
		utilities =  new FileWritingUtilities();
	}


	@Test 
	//Test Task 2
	void testWriteRandomNumbers() throws Exception {
		int top = 10;
		int[] numbers = fileReading.readNumbers1(fileWriting.writeRandomNumbers(top));
		
		assertEquals(20, numbers.length);
		
		for (int i = 0; i < top ; i++) {
			assertTrue(numbers[i] >= 1000 && numbers[i] <= 9999);
		}
		
		for(int i = top ; i < numbers.length; i++) {
			assertEquals(0, numbers[i]);
		}
	}
}
