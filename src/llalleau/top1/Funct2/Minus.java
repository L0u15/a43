package llalleau.top1.Funct2;

import llalleau.top1.Function;
import llalleau.top1.Funct0.Var;

public class Minus extends Funct2 {

	public Minus(Function leftFunction, Function rightFunction) {
		super(leftFunction, rightFunction);
	}

	@Override
	public double getValue() {
		return this.getLeftFunction().getValue() - this.getRightFunction().getValue();
	}

	@Override
	public String toString() {
		return this.getLeftFunction() + "-" + this.getRightFunction();
	}

	@Override
	public Function getDiff(Var x) {
		return new Minus(this.getLeftFunction().getDiff(x), this.getRightFunction().getDiff(x));
	}
}
