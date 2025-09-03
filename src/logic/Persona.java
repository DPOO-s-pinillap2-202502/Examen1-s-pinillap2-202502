package logic;

public abstract class Persona {
	private String genero;
    private Integer peso ;  
    private Integer altura;
    private Integer edad;
	public Persona(String genero, Integer peso, Integer altura, Integer edad) {
		super();
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}
    
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	public Integer getAltura() {
		return altura;
	}
	public void setAltura(Integer altura) {
		this.altura = altura;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public abstract double tmb();

}
