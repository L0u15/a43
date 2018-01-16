package llalleau.top1.Funct0;

import llalleau.top1.Function;

public class Var extends Funct0 {

	private String name;

	public Var(String name) {
		super();
		this.name = name;
	}

	public Var(String name, double value) {
		super(value);
		this.name = name;
	}

	public void setValue(double value) {
		super.setValue(value);
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public Function getDiff(Var x) {
		if (this.equals(x)) {
			return new Val(1);
		}
		return new Val(0);
	}

	@Override
	public boolean equals(Object other) {
		if (other == null)
			return false;
		if (other == this)
			return true;
		if (!(other instanceof Var))
			return false;
		Var otherVar = (Var) other;
		return this.getName().equals(otherVar.getName());
	}

}
