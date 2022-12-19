import static org.junit.Assert.*;
import org.junit.Test;
public class StudentTests2 {
	
	@Test
	public void testCalculeazaMediePentruONota() {
		Student student = new Student();
		int nota1 = 8;
		student.adaugaNota(nota1);
		assertEquals(nota1, student.calculeazaMedie(), 0.1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCalculeazaMediePentruZeroNota() {
		Student student = new Student();
		student.calculeazaMedie();
	}

	@Test
	public void testAreRestante() {
		Student student = new Student();
		int nota1 = 10;
		int nota2 = 3;
		int nota3 = 3;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		assertTrue(student.areRestante());
	}

	@Test
	public void testNuAreRestante() {
		Student student = new Student();
		int nota1 = 10;
		int nota2 = 9;
		int nota3 = 5;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		assertFalse(student.areRestante());
	}

	@Test
	public void testGetNotaPozitieIncorecta() {
		Student student = new Student();
		int nota1 = 10;
		int nota2 = 9;
		int nota3 = 5;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		try {
			student.getNota(-1);
			fail("metoda nu arunca exceptie");
		} catch (IndexOutOfBoundsException ex) {

		}
	}

	@Test(expected=IllegalArgumentException.class)
	public void testAdaugaNotaIncorecta() {
		Student student = new Student();
		int nota1=-1;
		student.adaugaNota(nota1);
	}
}