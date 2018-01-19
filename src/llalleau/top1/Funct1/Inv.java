package llalleau.top1.Funct1;

import llalleau.top1.Function;
import llalleau.top1.Funct0.Val;
import llalleau.top1.Funct0.Var;
import llalleau.top1.Funct2.Mul;

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

	@Override
	public Function getDiff(Var x) {
		return new Mul(new Val(-1.0),new Mul(this.getFunction(),new Inv(new Sqr(this.getFunction()))));
	}
}
