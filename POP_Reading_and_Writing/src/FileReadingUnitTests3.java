import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileReadingUnitTests3 {

	FileReading fileReading;

	@BeforeEach
	void setUp() {
		fileReading = new FileReading();
	}

	@Test 
	//Test Task 3
	void testReadNames() throws Exception{
		String[] names = {"Charles Babbage", "Susan Graham", "Raj Reddy", "Judea Pearl", "Edgar Codd", "Tim Berners-Lee","Sally Floyd", "Sophie Wilson","Max Newman", "Vint Cerf"};
		assertArrayEquals(names, fileReading.readNames("computingHeroesToRead.txt"));
	}
}
