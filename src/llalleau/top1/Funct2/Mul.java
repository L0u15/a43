package llalleau.top1.Funct2;

import llalleau.top1.Function;
import llalleau.top1.Funct0.Var;

public class Mul extends Funct2 {

	public Mul(Function leftFunction, Function rightFunction) {
		super(leftFunction, rightFunction);
	}

	@Override
	public double getValue() {
		return this.getLeftFunction().getValue() * this.getRightFunction().getValue();
	}

	@Override
	public String toString() {
		return this.getLeftFunction() + "*" + this.getRightFunction();
	}

	@Override
	public Function getDiff(Var x) {
		Function uPrimeV = new Mul(this.getLeftFunction().getDiff(x), this.getRightFunction());
		Function uVPrime = new Mul(this.getLeftFunction(), this.getRightFunction().getDiff(x));
		return new Plus(uPrimeV, uVPrime);
	}

}
