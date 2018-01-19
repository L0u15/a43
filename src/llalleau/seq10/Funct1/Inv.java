package llalleau.seq10.Funct1;

import llalleau.seq10.Function;

public class Inv extends Funct1 {

	private final int ONE = 1;

	public Inv(Function f) {
		super(f);
	}

	@Override
	public double getValue() {
		return ONE / this.getFunction().getValue();
	}

	@Override
	public String toString() {
		return "1/(" + this.getFunction() + ")";
	}

}
