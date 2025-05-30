package student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentManagerTest {
	
	StudentManager manage;

	@BeforeEach
	void setUp() throws Exception {
		manage = new StudentManager();
	}

	@Test
	void testAddStudent() {
		manage.addStudent("조한흠");
		assertTrue(manage.hasStudent("조한흠"));    //assertTrue를 이용해서 값이 True인지 확인한다.
	}

	@Test
	void testRemoveStudent() {
		manage.addStudent("조한흠");
		manage.removeStudent("조한흠");
		assertFalse(manage.hasStudent("조한흠"));   //asserFalse를 이용해서 값이 False인지 확인한다.
	}
	
	@Test
	void testAddException() {
		manage.addStudent("조한흠");
		assertThrows(IllegalArgumentException.class, () -> {
			manage.addStudent("조한흠");
		});
	}

	@Test
	void testRemoveException() {
		manage.addStudent("조한흠");
		manage.removeStudent("조한흠");
		assertThrows(IllegalArgumentException.class, () -> {
			manage.removeStudent("조한흠");
		});
	}

}
