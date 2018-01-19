package llalleau.seq10.Funct2;

import llalleau.seq10.Function;

public class Minus extends Funct2 {

	public Minus(Function f1, Function f2) {
		super(f1, f2);
	}

	@Override
	public double getValue() {
		return this.getLeftFunction().getValue() - this.getRightFunction().getValue();
	}

	@Override
	public String toString() {
		return this.getLeftFunction() + "-" + this.getRightFunction();
	}
}
