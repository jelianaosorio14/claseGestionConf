package co.edu.usbcali.scm;

public class CalculadoraImpl implements Calculadora {

	private int r = 0;
	public void sumar(int num1, int num2) {

		r = (num1+num2)+r;

	}

	public void restar(int num1, int num2) {
		r = (num1-num2)+r;

	}

	public int getResultado() {
		return r;

	}

	public void imprimir() {
		System.out.println("Resultado"+ getResultado());

	}

}
 