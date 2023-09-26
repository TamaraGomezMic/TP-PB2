package ar.edu.unlam.pb2.integrador1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanDeEstudio {

	
	
	@Test

	public void queSePuedaCrearUnPlanDeEstudio() { // anda ***
		String nombre = "Desarrollo Web";
		
		PlanDeEstudio Tecnicatura = new PlanDeEstudio(nombre);
		assertNotNull(Tecnicatura);
	
	}
	
	
	public void queSePuedaIngresarMateriasEnUnPlanDeEstudio() { 
		String nombre = "Desarrollo Web";
		Integer codigoMateria = 2619;
		
		
		
	
	}
	
	/*@Test
	public void queSePuedaIngresaUnaCorrelativa() { // este estoy haciendo//
		
		 	String nombre = "Desarrollo Web";
	    	String nombreMateria = "PB2";
	    	Integer codigo = 2;
	        
	        
	        Materia pb2 = new Materia(codigo,nombreMateria);
			PlanDeEstudio Tecnicatura = new PlanDeEstudio(nombre);
		
		assertNotNull(Tecnicatura);
		
		

	
	*/

}
