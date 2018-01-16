package llalleau.seq10.Funct2;

import llalleau.seq10.Function;

public abstract class Funct2 implements Function {

	private Function f1;
	private Function f2;

	public Funct2(Function f1, Function f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	public Function getF1() {
		return f1;
	}

	public Function getF2() {
		return f2;
	}
}
