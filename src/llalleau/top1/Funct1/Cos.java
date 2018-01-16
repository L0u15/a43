package llalleau.top1.Funct1;

import llalleau.top1.Function;
import llalleau.top1.Funct0.Val;
import llalleau.top1.Funct0.Var;
import llalleau.top1.Funct2.Mul;

public class Cos extends Funct1 {

	public Cos(Function f) {
		super(f);
	}

	@Override
	public double getValue() {
		return Math.cos(this.getF().getValue());
	}

	@Override
	public String toString() {
		return "cos " + this.getF().toString();
	}

	@Override
	public Function getDiff(Var x) {
		Function uPrime = this.getF().getDiff(x);
		Function sinU = new Sin(this.getF());
		return new Mul(new Val(-1.0), new Mul(uPrime, sinU));
	}
}
