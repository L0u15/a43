package llalleau.seq10.Funct0;

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
}
