package llalleau.seq10.Funct2;

import llalleau.seq10.Function;

public class Minus extends Funct2 {

	public Minus(Function f1, Function f2) {
		super(f1, f2);
	}

	@Override
	public double getValue() {
		return this.getF1().getValue() - this.getF2().getValue();
	}

	@Override
	public String toString() {
		return "("+this.getF1().toString() + "-" + this.getF2().toString()+")";
	}
}
