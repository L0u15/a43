package llalleau.dice;

public class TrickDice extends Dice {

	public TrickDice(int face) {
		super(face);
	}

	@Override
	protected int getValue() {
		return this.getFaces();
	}

}
