package live.tanujdevops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonTest {

	Person person;

	@BeforeEach
	void setUp() {
		person = new Person();
	}

	@Test
	@DisplayName("Test full name empty")
	void testFullNameEmpty() {
		person.setFirstName("");
		person.setLastName("");
		assertEquals("", person.getFirstName(), "Full name should be empty");
	}

	@Test
	@DisplayName("Test full name is last name")
	void testFullNameIsLastName() {
		person.setFirstName("");
		person.setLastName("Paraste");
		assertEquals("Paraste", person.getFullName(), "Last name should be the full name");
	}

	@Test
	@DisplayName("Test full name is first name")
	void testFullNameIsFirstName() {
		person.setFirstName("Tanuj");
		person.setLastName("");
		assertEquals("Tanuj", person.getFullName(), "First name should be the full name");
	}

	@Test
	@DisplayName("Test full name")
	void testFullName() {
		person.setFirstName("Tanuj");
		person.setLastName("Paraste");
		assertEquals("Tanuj Paraste", person.getFullName(), "Full name should be there");
	}

	@Test
	@DisplayName("Test age is zero")
	void testAgeIsZero() {
		person.setAge(-2);
		assertEquals(0, person.getAge(), "Age should be 0");
		person.setAge(101);
		assertEquals(0, person.getAge(), "Age should be 0");
	}

	@Test
	@DisplayName("Test is teen")
	void testIsTeen() {
		person.setAge(10);
		assertEquals(false, person.isTeen(), "Should return false");
		person.setAge(18);
		assertEquals(true, person.isTeen(), "Should retun true");
	}

}
