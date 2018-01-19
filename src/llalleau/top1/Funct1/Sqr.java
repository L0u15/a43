package llalleau.top1.Funct1;

import llalleau.top1.Function;
import llalleau.top1.Funct0.Val;
import llalleau.top1.Funct0.Var;
import llalleau.top1.Funct2.Mul;

public class Sqr extends Funct1 {

	private final int TWO = 2;

	public Sqr(Function f) {
		super(f);
	}

	@Override
	public double getValue() {
		return Math.pow(this.getFunction().getValue(), TWO);
	}

	@Override
	public String toString() {
		return "(" + this.getFunction() + ")²";
	}

	@Override
	public Function getDiff(Var x) {
		Function uPrimeMulU = new Mul(this.getFunction().getDiff(x), this.getFunction());
		return new Mul(new Val(2), uPrimeMulU);
	}
}
