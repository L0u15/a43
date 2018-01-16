package llalleau.top1.Funct0;


import llalleau.top1.Function;

public class Val extends Funct0 {
	public Val() {
		super();
	}

	public Val(double value) {
		super(value);
	}

	@Override
	public String toString() {
		return Double.toString(this.getValue());
	}

	@Override
	public Function getDiff(Var x) {
		return new Val(0);
	}
}
