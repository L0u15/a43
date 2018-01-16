package llalleau.seq10.Funct1;

import llalleau.seq10.Function;

public abstract class Funct1 implements Function {

	private Function f;

	public Funct1(Function f) {
		this.f = f;
	}

	public Function getF() {
		return f;
	}
}
