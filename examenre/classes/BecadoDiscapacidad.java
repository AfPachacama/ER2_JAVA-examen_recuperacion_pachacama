package classes;

public class BecadoDiscapacidad extends Becado {
	private String CódigoConadis;
	private String discapacidad;
	public BecadoDiscapacidad(String codigoBeca, String nombre, String apellido, String códigoConadis,
			String discapacidad) {
		super(codigoBeca, nombre, apellido);
		CódigoConadis = códigoConadis;
		this.discapacidad = discapacidad;
	}
	public String getCódigoConadis() {
		return CódigoConadis;
	}
	public void setCódigoConadis(String códigoConadis) {
		CódigoConadis = códigoConadis;
	}
	public String getDiscapacidad() {
		return discapacidad;
	}
	public void setDiscapacidad(String discapacidad) {
		this.discapacidad = discapacidad;
	}
	
}
