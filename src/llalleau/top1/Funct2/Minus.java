package llalleau.top1.Funct2;

import llalleau.top1.Function;
import llalleau.top1.Funct0.Var;

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
		return "(" + this.getF1().toString() + "-" + this.getF2().toString() + ")";
	}

	@Override
	public Function getDiff(Var x) {
		return new Minus(this.getF1().getDiff(x), this.getF2().getDiff(x));
	}
}
