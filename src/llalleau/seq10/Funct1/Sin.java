package llalleau.seq10.Funct1;

import llalleau.seq10.Function;

public class Sin extends Funct1 {

	public Sin(Function f) {
		super(f);
	}

	@Override
	public double getValue() {
		return Math.sin(this.getFunction().getValue());
	}

	@Override
	public String toString() {
		return "sin " + this.getFunction();
	}

}
