package co.edu.usbcali.scm;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumerosPrimosTest {

	@Test
	public void test() {
		NumerosPrimos numPrim = new NumerosPrimosImpl();
		
		numPrim.getDevuelveNumerosPrimos(1);
	}

}
