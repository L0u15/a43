package llalleau.dice;

import java.util.concurrent.ThreadLocalRandom;

public class D10 extends Dice {

	public D10() {
		super(10);
	}

	@Override
	protected int getValue() {
		return ThreadLocalRandom.current().nextInt(1, this.getFaces() + 1);
	}

}
