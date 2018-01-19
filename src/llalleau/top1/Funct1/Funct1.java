package llalleau.top1.Funct1;

import llalleau.top1.Function;

public abstract class Funct1 implements Function {

	private Function function;

	public Funct1(Function f) {
		this.function = f;
	}

	public Function getFunction() {
		return function;
	}
}

