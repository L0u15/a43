package llalleau.seq10.Funct1;

import llalleau.seq10.Function;

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

}
