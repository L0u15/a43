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

	@Test
	void testF() {
		Var x = new Var("x");
		Var y = new Var("y");
		this.f = new Plus(x, new Mul(new Val(2), y));
		assertEquals("(x+(2.0*y))", this.f.toString());

		x.setValue(0);
		y.setValue(0);
		assertEquals(0, this.f.getValue());

		x.setValue(1);
		y.setValue(1);
		assertEquals(3, this.f.getValue());

		x.setValue(6);
		y.setValue(2);
		assertEquals(10, this.f.getValue());
	}

	@Test
	void testG() {
		Var x = new Var("x");
		Var y = new Var("y");
		Var z = new Var("z");
		this.g = new Plus(new Sqr(x), new Plus(new Sqr(y), new Sqr(z)));
		assertEquals("((x)²+((y)²+(z)²))", this.g.toString());

		x.setValue(0);
		y.setValue(0);
		z.setValue(0);
		assertEquals(0, this.g.getValue());

		x.setValue(2.0);
		y.setValue(3.0);
		z.setValue(1.0);
		assertEquals(14, this.g.getValue());

		x.setValue(-5.0);
		y.setValue(6.0);
		z.setValue(0.0);
		assertEquals(61, this.g.getValue());
	}

	@Test
	void testH() {
		Var x = new Var("x");
		this.h = new Plus(new Sin(x), new Val(5));
		assertEquals("(sin x+5.0)", this.h.toString());

		x.setValue(0);
		assertEquals(5, this.h.getValue());

		x.setValue(Math.PI);
		assertEquals(5, this.h.getValue());
	}

	@Test
	void testK() {
		Var x = new Var("x");
		this.k = new Plus(new Sqr(new Sin(x)), new Sqr(new Cos(x)));

		for (double d = 0; d <= 1; d += 0.05) {
			x.setValue(d);
			assertEquals(1, this.k.getValue(), 0.00000001);
		}
	}
}