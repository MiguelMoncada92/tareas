
public class Pitagoras {

	public double calcularHipotenusa(double catetoA, double catetoB) {
		catetoA = Math.pow(catetoA, 2);
		catetoB = Math.pow(catetoB, 2);
		return Math.sqrt(catetoA+catetoB);
	}
}
