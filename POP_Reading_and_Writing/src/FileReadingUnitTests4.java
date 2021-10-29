import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileReadingUnitTests4 {

	FileReading fileReading;

	@BeforeEach
	void setUp() {
		fileReading = new FileReading();
	}

	@Test 
	//Test Task 4
	void testReadNumbers1() throws Exception{
		int[] numbers = {3456, 1234, 2345, 5555, 6743, 1235, 4556, 1987, 
				1254, 6776, 4345, 3422, 2334, 2323, 4333, 0, 0, 0, 0, 0};
		assertArrayEquals(numbers, fileReading.readNumbers1("numbersFile1ToRead.txt"));
	}

}
