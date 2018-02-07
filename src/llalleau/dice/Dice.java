package llalleau.dice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
* The Dice class implements functionalities seen in 2018-02-06 telegroup
*
* @author  Louis Lalleau
* @version 1.0
* @since   2018-02-07 
*/
public class Dice {
	
	// Static attributs
	private static final int ZERO = 0;
	private static final int ONE = 1;
	private static final int SIX = 6;
	private static final int TEN = 10;

	// Attributs
	private int faces;
	private int times;
	private int bonus;
	private List<Dice> diceList;

	public Dice(int face) {
		this.faces = face;
		this.times = ONE;
		this.bonus = ZERO;
		this.diceList = new ArrayList<>();
	}

	public static Dice d6() {
		return new Dice(SIX);
	}

	public static Dice d10() {
		return new Dice(TEN);
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
			result += this.getValue(ONE, this.faces);
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
	private int getValue(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max + ONE);
	}
}
