package classes;

import java.util.Date;

public class BecadoNotas extends Becado {
	private String C�digoColegio;
	private Date FechaCumplea�os;
	public BecadoNotas(String codigoBeca, String nombre, String apellido, String c�digoColegio, Date fechaCumplea�os) {
		super(codigoBeca, nombre, apellido);
		C�digoColegio = c�digoColegio;
		FechaCumplea�os = fechaCumplea�os;
	}
	public String getC�digoColegio() {
		return C�digoColegio;
	}
	public void setC�digoColegio(String c�digoColegio) {
		C�digoColegio = c�digoColegio;
	}
	public Date getFechaCumplea�os() {
		return FechaCumplea�os;
	}
	public void setFechaCumplea�os(Date fechaCumplea�os) {
		FechaCumplea�os = fechaCumplea�os;
	}
	
	
}
