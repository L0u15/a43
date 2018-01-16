package llalleau.seq10.Funct0;

import llalleau.seq10.Function;

public abstract class Funct0 implements Function {

	private final double DEFAULT_VALUE = 0;

	private double value;

	public Funct0() {
		this.setValue(this.DEFAULT_VALUE);
	}

	public Funct0(double value) {
		this.setValue(value);
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}
