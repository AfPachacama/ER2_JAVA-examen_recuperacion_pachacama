package classes;

public class BecadoDiscapacidad extends Becado {
	private String C�digoConadis;
	private String discapacidad;
	public BecadoDiscapacidad(String codigoBeca, String nombre, String apellido, String c�digoConadis,
			String discapacidad) {
		super(codigoBeca, nombre, apellido);
		C�digoConadis = c�digoConadis;
		this.discapacidad = discapacidad;
	}
	public String getC�digoConadis() {
		return C�digoConadis;
	}
	public void setC�digoConadis(String c�digoConadis) {
		C�digoConadis = c�digoConadis;
	}
	public String getDiscapacidad() {
		return discapacidad;
	}
	public void setDiscapacidad(String discapacidad) {
		this.discapacidad = discapacidad;
	}
	
}
