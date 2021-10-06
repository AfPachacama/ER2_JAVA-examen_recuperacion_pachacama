package classes;

public class BecadoRecursos extends Becado {

	private String CodigoBeneficio;
	private float SalarioPadres;
	public BecadoRecursos(String codigoBeca, String nombre, String apellido, String codigoBeneficio,
			float salarioPadres) {
		super(codigoBeca, nombre, apellido);
		CodigoBeneficio = codigoBeneficio;
		SalarioPadres = salarioPadres;
	}
	public String getCodigoBeneficio() {
		return CodigoBeneficio;
	}
	public void setCodigoBeneficio(String codigoBeneficio) {
		CodigoBeneficio = codigoBeneficio;
	}
	public float getSalarioPadres() {
		return SalarioPadres;
	}
	public void setSalarioPadres(float salarioPadres) {
		SalarioPadres = salarioPadres;
	}
	
}
