import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserInputUnitTests2 {

	UserInput userInput;

	@BeforeEach
	void createObject() {
		userInput = new UserInput();
	}
	
	@Test
	//Task 2
	void testReadTenNumbers() {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		assertArrayEquals(numbers, userInput.readTenNumbers());

	}
}
