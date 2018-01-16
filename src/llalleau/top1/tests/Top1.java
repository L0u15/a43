package llalleau.top1.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import llalleau.top1.Function;
import llalleau.top1.Funct0.Var;
import llalleau.top1.Funct1.Cos;
import llalleau.top1.Funct1.Sin;
import llalleau.top1.Funct1.Sqr;
import llalleau.top1.Funct2.Plus;

class Top1 {

	private Function f;

	@Test
	void test() {
		Var x = new Var("x");
		this.f = new Plus(new Sqr(new Sin(x)), new Sqr(new Cos(x)));
		this.f = f.getDiff(x);
		assertEquals("((2.0*((1.0*cos x)*sin x))+(2.0*((-1.0*(1.0*sin x))*cos x)))", this.f.toString());

		for (double d = 0; d <= 1; d += 0.05) {
			x.setValue(d);
			assertEquals(0, this.f.getValue());
		}

	}

}
