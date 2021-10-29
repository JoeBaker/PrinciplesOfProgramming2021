import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileReadingUnitTests5 {

	FileReading fileReading;

	@BeforeEach
	void setUp() {
		fileReading = new FileReading();
	}

	@Test 
	//Test Task 5
	void testReadNumbers2() throws Exception{
		int[] numbers = {3456, 1234, 2345, 5555, 6743, 1235, 4556, 
				1254, 6776, 4345, 3422, 2334, 2323, 4333, 0, 0, 0, 0, 0, 0};
		assertArrayEquals(numbers, fileReading.readNumbers2("numbersFile2ToRead.txt"));
	}
}
