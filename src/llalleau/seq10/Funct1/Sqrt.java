package llalleau.seq10.Funct1;

import llalleau.seq10.Function;

public class Sqrt extends Funct1 {

	public Sqrt(Function f) {
		super(f);
	}

	@Override
	public double getValue() {
		return Math.sqrt(this.getF().getValue());
	}
	@Override
	public String toString() {
		return "sqrt " + this.getF().toString();
	}


}
