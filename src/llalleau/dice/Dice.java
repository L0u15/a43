package llalleau.dice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * The Dice class implements functionalities seen in 2018-02-06 telegroup
 *
 * @author Louis Lalleau
 * @version 1.1
 * @since 2018-02-07
 */
public class Dice {

	// Attributs
	private int faces;
	private int times;
	private int bonus;
	private List<Dice> diceList;

	// Constructor
	public Dice(int face) {
		this.faces = face;
		this.times = 1;
		this.bonus = 0;
		this.diceList = new ArrayList<>();
	}

	public int getFaces() {
		return faces;
	}

	public static Dice d6() {
		return new D6();
	}

	public static Dice d10() {
		return new D10();
	}

	public static Dice trickDice(int faces) {
		return new TrickDice(faces);
	}

	public Dice times(int times) {
		this.times = times;
		return this;
	}

	public Dice plus(int bonus) {
		this.bonus = bonus;
		return this;
	}

	public Dice add(Dice otherDice) {
		this.diceList.add(otherDice);
		return this;
	}

	/**
	 * 
	 * @return result of dice including times, bonus and other dice
	 */
	public int roll() {

		int result = 0;

		// Throw dice N times
		for (int i = 0; i < this.times; i++) {
			result += this.getValue();
		}

		// Add other dice result
		for (Dice dice : diceList) {
			result += dice.roll();
		}

		// Add bonus
		result += this.bonus;

		return result;
	}

	/**
	 * min <= value <= max
	 * 
	 * @return random value
	 */
	protected int getValue() {
		return ThreadLocalRandom.current().nextInt(1, this.getFaces() + 1);
	}
}
