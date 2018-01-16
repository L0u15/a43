package llalleau.seq10.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import llalleau.seq10.Function;
import llalleau.seq10.Funct0.*;
import llalleau.seq10.Funct1.*;
import llalleau.seq10.Funct2.*;

class Seq10 {

	private Function f, g, h, k;

	@Before
	public void before() {
	}

	@Test
	void testF() {
		this.f = new Plus(new Var("x", 0.0), new Mul(new Val(2), new Var("y", 0.0)));
		assertEquals("(x+(2.0*y))", this.f.toString());
		assertEquals(0, this.f.getValue());

		this.f = new Plus(new Var("x", 1.0), new Mul(new Val(2), new Var("y", 1.0)));
		assertEquals(3, this.f.getValue());

		this.f = new Plus(new Var("x", 6.0), new Mul(new Val(2), new Var("y", 2.0)));
		assertEquals(10, this.f.getValue());
	}

	@Test
	void testG() {
		this.g = new Plus(new Sqr(new Var("x", 0.0)), new Plus(new Sqr(new Var("y", 0.0)), new Sqr(new Var("z", 0.0))));
		assertEquals("((x)²+((y)²+(z)²))", this.g.toString());
		assertEquals(0, this.g.getValue());

		this.g = new Plus(new Sqr(new Var("x", 2.0)), new Plus(new Sqr(new Var("y", 3.0)), new Sqr(new Var("z", 1.0))));
		assertEquals(14, this.g.getValue());

		this.g = new Plus(new Sqr(new Var("x", -5.0)), new Plus(new Sqr(new Var("y", 6.0)), new Sqr(new Var("z", 0.0))));
		assertEquals(61, this.g.getValue());
	}

}