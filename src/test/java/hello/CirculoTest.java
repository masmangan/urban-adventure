package hello;

import static org.junit.Assert.fail;

import org.junit.Test;

public class CirculoTest {

	@Test
	public void test() {
		Circulo c = new Circulo(1);
		double actual = c.getArea();
	}

}
