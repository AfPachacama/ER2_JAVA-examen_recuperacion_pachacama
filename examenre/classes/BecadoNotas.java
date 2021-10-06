package classes;

import java.util.Date;

public class BecadoNotas extends Becado {
	private String CódigoColegio;
	private Date FechaCumpleaños;
	public BecadoNotas(String codigoBeca, String nombre, String apellido, String códigoColegio, Date fechaCumpleaños) {
		super(codigoBeca, nombre, apellido);
		CódigoColegio = códigoColegio;
		FechaCumpleaños = fechaCumpleaños;
	}
	public String getCódigoColegio() {
		return CódigoColegio;
	}
	public void setCódigoColegio(String códigoColegio) {
		CódigoColegio = códigoColegio;
	}
	public Date getFechaCumpleaños() {
		return FechaCumpleaños;
	}
	public void setFechaCumpleaños(Date fechaCumpleaños) {
		FechaCumpleaños = fechaCumpleaños;
	}
	
	
}
