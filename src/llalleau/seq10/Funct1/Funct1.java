package llalleau.seq10.Funct1;

import llalleau.seq10.Function;

public abstract class Funct1 implements Function {

	private Function function;

	public Funct1(Function function) {
		this.function = function;
	}

	public Function getFunction() {
		return function;
	}
}
