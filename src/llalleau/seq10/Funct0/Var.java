package llalleau.seq10.Funct0;

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

	@Override
	public String toString() {
		return this.name;
	}

}
