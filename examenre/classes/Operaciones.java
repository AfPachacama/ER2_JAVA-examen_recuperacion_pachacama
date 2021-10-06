package classes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Operaciones {

	ArrayList<BecadoDiscapacidad> arrayBecadoDiscapacidad=new ArrayList();
	ArrayList<BecadoNotas> arrayBecadoNotas=new ArrayList();
	ArrayList<BecadoRecursos> arrayBecadoRecursos=new ArrayList();
	DateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
	
	Scanner sn = new Scanner(System.in);	
	public Becado IngresarDatosBeca(){
		Becado be=new Becado();
		System.out.println("Ingrese el Codigo de la Beca");
		be.setCodigoBeca(sn.nextLine());
		System.out.println("Ingrese el nombre del becado");
		be.setNombre(sn.nextLine());
		System.out.println("Ingrese el apellido del becado");
		be.setApellido(sn.nextLine());	
		return be;		
	}
	public void IngresarDatosBecadoNotas(Becado be) throws ParseException{
		System.out.println("Ingrese el Codigo del colegio");
		String CodigoColegio=sn.nextLine();
		System.out.println("Ingrese la fecha de cumpleaños");
		String fechaCumpleaños=sn.nextLine();
		Date convertido = fecha.parse(fechaCumpleaños);
		BecadoNotas ben=new BecadoNotas(be.getCodigoBeca(), be.getNombre(), be.getApellido(), CodigoColegio,convertido);
		arrayBecadoNotas.add(ben);
		System.out.println("Datos Guardad Correctamente");
	}
	public void IngresarDatosBecadoRecursos(Becado be){
		System.out.println("Ingrese el Codigo del beneficio");
		String CodigoBeneficio=sn.nextLine();
		System.out.println("Ingrese el salario de los padres");
		float salarioPadres=sn.nextFloat();
		BecadoRecursos ber=new BecadoRecursos(be.getCodigoBeca(), be.getNombre(), be.getApellido(), CodigoBeneficio,salarioPadres);
		arrayBecadoRecursos.add(ber);
		System.out.println("Datos Guardad Correctamente");
	}
	public void IngresarDatosBecadoDiscapacidad(Becado be){
		System.out.println("Ingrese el Codigo del conadis");
		String CodigoConadis=sn.nextLine();
		System.out.println("Ingrese la discapacidad");
		String discapacidad=sn.nextLine();
		BecadoDiscapacidad bed=new BecadoDiscapacidad(be.getCodigoBeca(), be.getNombre(), be.getApellido(), CodigoConadis,discapacidad);
		arrayBecadoDiscapacidad.add(bed);
		System.out.println("Datos Guardad Correctamente");
	}
	
	public void BuscarBecadoDiscapacidad(String CodigoConadis){
		boolean conf=false;
		for (BecadoDiscapacidad becadoDiscapacidad : arrayBecadoDiscapacidad) {
			if(becadoDiscapacidad.getCódigoConadis().equals(CodigoConadis)){
				System.out.println("Becado Encontrado");
				System.out.println("Nombre y Apellido: "+becadoDiscapacidad.getNombre()+" "+becadoDiscapacidad.getApellido());
				conf=true;
			}
		}
		if(conf==false){
			System.out.println("Becado No Encontrado");
		}
	}
	
	public void BuscarBecadoNotas(String CodigoColegio){
		boolean conf=false;
		for (BecadoNotas becadoNotas : arrayBecadoNotas) {
			if(becadoNotas.getCódigoColegio().equals(CodigoColegio)){
				System.out.println("Becado Encontrado");
				System.out.println("Nombre y Apellido: "+becadoNotas.getNombre()+" "+becadoNotas.getApellido());
				conf=true;
			}
		}
		if(conf==false){
			System.out.println("Becado No Encontrado");
		}
	}
	public void BuscarBecadoRecursos(String CodigoBeneficio){
		boolean conf=false;
		for (BecadoRecursos becadoRecursos : arrayBecadoRecursos) {
			if(becadoRecursos.getCodigoBeneficio().equals(CodigoBeneficio)){
				System.out.println("Becado Encontrado");
				System.out.println("Nombre y Apellido: "+becadoRecursos.getNombre()+" "+becadoRecursos.getApellido());
				conf=true;
			}
		}
		if(conf==false){
		}
	}
	
}
