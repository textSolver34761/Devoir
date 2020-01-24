package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import calculatrice.Calculatrice;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatriceTest {

	Calculatrice calcul = new Calculatrice();
	//Lancer "init" avant chaque tests
	@BeforeEach
	public void init() {
		calcul = new Calculatrice();
		System.out.println("Test en cours...");
	}
	
	//first step : error
	@Disabled
	@Test
	public void testCalculatrice() {
		fail("Not yet implemented");
	}

	//Plusieurs test pour l'addition : test simple, positif, négatif, et innégal 
	@Test
	@DisplayName("le test de l'addition")
	public void addNumbers() {
		System.out.println("Le test de l'addition commence");
		assertAll(
				()->assertEquals(4,calcul.addition(2, 2)),
				()->assertEquals(600,calcul.addition(100, 500)),
				()->assertEquals(0,calcul.addition(100, -100)),
				()->assertNotEquals(1000,calcul.addition(100, -100))
				);
		System.out.println("Le test de l'addition est terminé");
	}

	//Plusieurs test pour la multiplication : test positif, négatif, avec 0 et innégal 
	@Test	
	@DisplayName("le test de multiplication")
	public void testmultiplication() {
		System.out.println("Le test de la multiplication commence");
		assertAll(
				()->assertEquals(4,calcul.multiplication(2, 2)),
				()->assertEquals(-7,calcul.multiplication(-1, 7)),
				()->assertEquals(0,calcul.multiplication(0, 6)),
				()->assertNotEquals(500,calcul.multiplication(10, 10))
				);
		System.out.println("Le test de la multiplication est terminé");
	}

	//Un test pour la divison : renvoie une arrithmeic exception sur une division par 0 
	@Test
	@DisplayName("le test de division")
	public void testdivision() {
		System.out.println("Le test de la division commence");
		assertThrows(ArithmeticException.class, ()-> calcul.division(1, 0));
		System.out.println("Le test de la division est est terminé");
	}

	//Plusieurs test pour la soustraction : test simple, positif, négatif, et innégal
	@Test
	@DisplayName("le test de soustraction")
	public void testsoustraction() {
		System.out.println("Le test de la soustraction commence");
		assertAll(
				()->assertEquals(0,calcul.soustraction(2, 2)),
				()->assertEquals(100,calcul.soustraction(100, 0)),
				()->assertEquals(-100,calcul.soustraction(0, 100)),
				()->assertNotEquals(8,calcul.soustraction(20, 1000))
				);
		System.out.println("Le test de la soustraction est terminé");
	}

	//Lancer "after" après chaque tests
	@AfterEach
	public void after() {
		System.out.println("Fin du test.");
		System.out.println("");
	}
	
}
