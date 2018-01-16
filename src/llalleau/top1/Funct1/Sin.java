package llalleau.top1.Funct1;

import llalleau.top1.Function;
import llalleau.top1.Funct0.Var;
import llalleau.top1.Funct2.Mul;

public class Sin extends Funct1 {

	public Sin(Function f) {
		super(f);
	}

	@Override
	public double getValue() {
		return Math.sin(this.getF().getValue());
	}

	@Override
	public String toString() {
		return "sin " + this.getF().toString();
	}

	@Override
	public Function getDiff(Var x) {
		return new Mul(this.getF().getDiff(x), new Cos(this.getF()));
	}
}
