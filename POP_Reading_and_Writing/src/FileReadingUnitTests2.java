import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileReadingUnitTests2 {

	FileReading fileReading;

	@BeforeEach
	void setUp() {
		fileReading = new FileReading();
	}

	@Test 
	//Test Task 2
	void testReadName2(){
		assertEquals("Radia Perlman", fileReading.readName2("nameFileToRead.txt"));
		assertEquals("Invalid filename", fileReading.readName2("ddd.txt"));
	}	
}
