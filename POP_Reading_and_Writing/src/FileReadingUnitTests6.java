import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileReadingUnitTests6 {

	FileReading fileReading;

	@BeforeEach
	void setUp() {
		fileReading = new FileReading();
	}

	@Test 
	//Test Task 6 - Address Book
	void testReadAddressBook() throws Exception{
		String[] addressBook= {"Donald Knuth: 0111", "Dennis Ritchie: 0554", "Alan Turing: 4532", "Grace Hopper: 2222", "Ada Lovelace: 4464"};
		assertArrayEquals(addressBook, fileReading.readAddressBook("addressBookToRead.txt"));
	}
}
