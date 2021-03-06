package llalleau.top1.Funct1;

import llalleau.top1.Function;
import llalleau.top1.Funct0.*;
import llalleau.top1.Funct2.Mul;

public class Sqrt extends Funct1 {

	public Sqrt(Function f) {
		super(f);
	}

	@Override
	public double getValue() {
		return Math.sqrt(this.getFunction().getValue());
	}

	@Override
	public String toString() {
		return "sqrt " + this.getFunction();
	}

	@Override
	public Function getDiff(Var x) {
		Function uPrime = this.getFunction().getDiff(x);
		Function twoSqrtU = new Mul(new Val(2), new Sqrt(this.getFunction()));
		return new Mul(uPrime, new Inv(twoSqrtU));
	}

}
