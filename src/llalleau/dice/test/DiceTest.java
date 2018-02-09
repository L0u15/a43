package llalleau.dice.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import llalleau.dice.Dice;

class DiceTest {

	@Test
	void d6Test() {
		Dice d6 = Dice.d6();
		System.out.print("Result d6 :");
		for (int i = 0; i < 100; i++) {
			int result = d6.roll();
			System.out.print(" " + result);
			assertTrue(result < 7);
			assertTrue(result > 0);
		}
		System.out.println();
	}

	@Test
	void d10Test() {
		Dice d10 = Dice.d10();
		System.out.print("Result d10 :");
		for (int i = 0; i < 100; i++) {
			int result = d10.roll();
			System.out.print(" " + result);
			assertTrue(result < 11);
			assertTrue(result > 0);
		}
		System.out.println();
	}

	@Test
	void d55Test() {
		Dice d55 = new Dice(55);
		System.out.print("Result d55 :");
		for (int i = 0; i < 100; i++) {
			int result = d55.roll();
			System.out.print(" " + result);
			assertTrue(result < 56);
			assertTrue(result > 0);
		}
		System.out.println();
	}

	@Test
	void dicePlusBonusTest() {
		Dice d6 = Dice.d6().plus(2);
		System.out.print("Result d6 + 2 :");
		for (int i = 0; i < 100; i++) {
			int result = d6.roll();
			System.out.print(" " + result);
			assertTrue(result < 9);
			assertTrue(result > 2);
		}
		System.out.println();
	}

	@Test
	void dice3TimesTest() {
		Dice d6 = Dice.d6().times(3);
		System.out.print("Result 3d6 :");
		for (int i = 0; i < 100; i++) {
			int result = d6.roll();
			System.out.print(" " + result);
			assertTrue(result < 19);
			assertTrue(result > 2);
		}
		System.out.println();
	}

	@Test
	void diceD6plusD10Test() {
		Dice d = Dice.d6().add(Dice.d10());
		System.out.print("Result d6 + d10 :");
		for (int i = 0; i < 100; i++) {
			int result = d.roll();
			System.out.print(" " + result);
			assertTrue(result < 17);
			assertTrue(result > 1);
		}
		System.out.println();
	}

	@Test
	void dice2d6Plus4BonusAnd3d10Test() {
		Dice d = Dice.d6().times(2).plus(4).add(Dice.d10().times(3));
		System.out.print("Result 2d6 +4 + 3d10 :");
		for (int i = 0; i < 100; i++) {
			int result = d.roll();
			System.out.print(" " + result);
			assertTrue(result < 47);
			assertTrue(result > 8);
		}
		System.out.println();
	}

	@Test
	void TrickDiceTest() {
		Dice d = Dice.trickDice(6);
		System.out.print("Result trick dice 6 :");
		for (int i = 0; i < 100; i++) {
			int result = d.roll();
			System.out.print(" " + result);
			assertTrue(result == 6);
		}
		System.out.println();
	}
}
