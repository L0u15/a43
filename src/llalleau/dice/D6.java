package llalleau.dice;

import java.util.concurrent.ThreadLocalRandom;

public class D6 extends Dice {

	public D6() {
		super(6);
	}

	@Override
	protected int getValue() {
		return ThreadLocalRandom.current().nextInt(1, this.getFaces() + 1);
	}

}
