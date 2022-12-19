import static org.junit.Assert.*;

import org.junit.Test;


public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume = "gabita";
		Student student = new Student(nume);
		assertEquals("a picat numele", nume, student.getNume());
		assertNotNull("au picat notele", student.getNote());
	}

	@Test
	public void testConstructorFaraParametru() {
		Student student = new Student();
		assertNotNull("au picat notele", student.getNote());
		assertNotNull("a picat numele", student.getNume());
	}

	@Test
	public void testSetterNume() {
		String nume = "gabita";
		Student student = new Student();
		student.setNume(nume);
		assertEquals(nume, student.getNume());
	}

	@Test
	public void testAdaugareNota() {
		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}

	@Test
	public void testDimensiuneLista() {
		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}

	@Test
	public void testCalculeazaMedie() {
		Student student = new Student();
		int nota1 = 3;
		int nota2 = 9;
		int nota3 = 5;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		float medie = (nota1 + nota2 + nota3) / 3.0f;
		assertEquals(medie, student.calculeazaMedie(), 0.1);
	}
}