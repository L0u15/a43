package llalleau.top1.Funct2;

import llalleau.top1.Function;

public abstract class Funct2 implements Function {

	private Function leftFunction;
	private Function rightFunction;

	public Funct2(Function leftFunction, Function rightFunction) {
		this.leftFunction = leftFunction;
		this.rightFunction = rightFunction;
	}

	public Function getLeftFunction() {
		return leftFunction;
	}

	public Function getRightFunction() {
		return rightFunction;
	}
}
