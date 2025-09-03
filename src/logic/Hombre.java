package logic;


public class Hombre extends Persona{

	public Hombre(String genero, Integer peso, Integer altura, Integer edad) {
		super("Hombre", peso, altura, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tmb() {
		// TODO Auto-generated method stub
		return (88.362 + (13.397 * this.getPeso()) + (4.799 * this.getAltura()) - (5.677 * this.getEdad()));
	}
}