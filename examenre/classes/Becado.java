package classes;

public class Becado {
	protected String CodigoBeca;
	protected String nombre;
	protected String apellido;
	
	public Becado(String codigoBeca, String nombre, String apellido) {
		super();
		CodigoBeca = codigoBeca;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Becado(){
		
	}

	public String getCodigoBeca() {
		return CodigoBeca;
	}

	public void setCodigoBeca(String codigoBeca) {
		CodigoBeca = codigoBeca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
		

}
