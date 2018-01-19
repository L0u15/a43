package llalleau.seq10.Funct1;

import llalleau.seq10.Function;

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
		return "(" + this.getFunction()+")²";
	}

}
