package logic;

public class Mujer extends Persona{

	public Mujer(String genero, Integer peso, Integer altura, Integer edad) {
		super("mujer", peso, altura, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tmb() {
		// TODO Auto-generated method stub
		return (447.593  + (9.247 * this.getPeso()) + (3.098 * this.getAltura()) - (4.33 * this.getEdad()));
	}
}
