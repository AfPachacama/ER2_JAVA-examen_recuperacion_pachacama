package main;
import java.text.ParseException;
import java.util.Scanner;

import classes.Becado;
import classes.Operaciones;
public class main {

	public static void main(String[] args) throws ParseException {
		
		// TODO Auto-generated method stub
		boolean salir=false;
		int opcion;
		Scanner sn = new Scanner(System.in);
		Operaciones op=new Operaciones();
		Becado be;
		while (!salir) {
			System.out.println("=============================================");
        	System.out.println("\tSISTEMA BECADO SENESCYT UCE");
        	System.out.println("=============================================");
        	System.out.println("Seleccione una opcion:");
            System.out.println("1. Ingresar Becado");
            System.out.println("2. Busqueda por tipo de Becado");
            System.out.println("3. Busqueda General");        
            System.out.println("4. Salir");
            opcion = sn.nextInt();
            
            switch(opcion){
            case 1:
            	boolean salir2=false;
            	int opcion2;
            	while (!salir2) {
        			System.out.println("=============================================");
                	System.out.println("\tINGRESAR BECADO");
                	System.out.println("=============================================");
                	System.out.println("Seleccione una opcion:");
                    System.out.println("1. Becado por Notas");
                    System.out.println("2. Becado por Discapacidad");
                    System.out.println("3. Becado por Recursos");        
                    System.out.println("4. Salir");
                    opcion2=sn.nextInt();
                    switch(opcion2){
                    case 1:
                    	be=op.IngresarDatosBeca();
                    	op.IngresarDatosBecadoNotas(be);
                    	break;
                    case 2:
                    	be=op.IngresarDatosBeca();
                    	op.IngresarDatosBecadoDiscapacidad(be);
                    	break;
                    case 3:
                    	be=op.IngresarDatosBeca();
                    	op.IngresarDatosBecadoRecursos(be);
                    	break;
                    case 4:
                    	salir2=true;
            		}
            	}
            	
                break;
            case 2:
            	boolean salir3=false;
            	int opcion3;
            	while (!salir3) {
        			System.out.println("=============================================");
                	System.out.println("\tBUSCAR BECADO");
                	System.out.println("=============================================");
                	System.out.println("Seleccione una opcion:");
                    System.out.println("1. Becado por Notas");
                    System.out.println("2. Becado por Discapacidad");
                    System.out.println("3. Becado por Recursos");        
                    System.out.println("4. Salir");
                    opcion3=sn.nextInt();
                    switch(opcion3){
                    case 1:
                    	sn.nextLine();
                    	System.out.println("Ingre el codigo del colegio");
                    	String CodigoColegio=sn.nextLine();
                    	op.BuscarBecadoNotas(CodigoColegio);;
                    	break;
                    case 2:
                    	sn.nextLine();
                    	System.out.println("Ingre el Código conadis");
                    	String CodigoConadis=sn.nextLine();
                    	op.BuscarBecadoNotas(CodigoConadis);;
                    	break;
                    case 3:
                    	sn.nextLine();
                    	System.out.println("Ingre el cCódigo beneficio");
                    	String CodigoBeneficio=sn.nextLine();
                    	op.BuscarBecadoNotas(CodigoBeneficio);;
                    	break;
                    case 4:
                    	salir3=true;
            		}
            	}
            	
            	break;
            case 3:
            	break;
            case 4:
            	salir=true;
            	break;
            default:
            	break;
            }
		
		}

	}

}
