package ar.edu.unlam.pb2.integrador1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanDeEstudio {

	
	 
	@Test

	public void queSePuedaCrearUnPlanDeEstudio() { 
		String nombre = "Desarrollo Web";
		
		PlanDeEstudio tecnicatura = new PlanDeEstudio(nombre);
		assertNotNull(tecnicatura);
	
	}
	
	@Test
	public void queSePuedaIngresarunaMateriaEnUnPlanDeEstudio() { 
		
		String  nombre = "Unlam";
		String nombreCarrera = "Desarrollo Web";
		Integer codigoMateria = 2619;
		String nombreDeMateria = "pb1";
		
		Universidad unlam = new Universidad (nombre);
		PlanDeEstudio tecnicatura = new PlanDeEstudio(nombreCarrera);
		Materia pb1= new Materia(codigoMateria,nombreDeMateria);
		
		
		unlam.registraMateria(pb1);
		
	
		Boolean secreo =tecnicatura.ingresarMateriaAlPlanDeEstudio(unlam,codigoMateria);
		
		assertTrue(secreo);
		
	
	}
	
	@Test
	public void queSePuedaIngresarunaCorrelativaAlPlanDeEstudio() { 
		
		String  nombre = "Unlam";
		String nombreCarrera = "Desarrollo Web";
		Integer codigoMateria = 2619;
		String nombreDeMateria = "programacion1";
		Integer codigoMateria2 = 2623;
		String nombreDeMateriaCorrelativa = "programacion2";
		Universidad unlam = new Universidad (nombre);
		PlanDeEstudio tecnicatura = new PlanDeEstudio(nombreCarrera);
		Materia pb1= new Materia(codigoMateria,nombreDeMateria);
		Materia pb2 = new Materia(codigoMateria2,nombreDeMateriaCorrelativa);
		
		
		unlam.registraMateria(pb1);	
		unlam.registraMateria(pb2);
		
		tecnicatura.ingresarMateriaAlPlanDeEstudio(unlam,codigoMateria);
		tecnicatura.ingresarMateriaAlPlanDeEstudio(unlam,codigoMateria2);
		assertTrue(tecnicatura.ingresarCorrelativa(unlam,codigoMateria,codigoMateria2));
	
		
		
	
	}
	
	@Test
	public void queSePuedaEliminarunaCorrelativaAlPlanDeEstudio() { 
		
		String  nombre = "Unlam";
		String nombreCarrera = "Desarrollo Web";
		Integer codigoMateria = 2619;
		String nombreDeMateria = "programacion1";
		Integer codigoMateria2 = 2623;
		String nombreDeMateriaCorrelativa = "programacion2";
		Universidad unlam = new Universidad (nombre);
		PlanDeEstudio tecnicatura = new PlanDeEstudio(nombreCarrera);
		Materia pb1= new Materia(codigoMateria,nombreDeMateria);
		Materia pb2 = new Materia(codigoMateria2,nombreDeMateriaCorrelativa);
		
		
		unlam.registraMateria(pb1);	
		unlam.registraMateria(pb2);
		
		tecnicatura.ingresarMateriaAlPlanDeEstudio(unlam,codigoMateria);
		tecnicatura.ingresarMateriaAlPlanDeEstudio(unlam,codigoMateria2);
		assertTrue(tecnicatura.eliminarCorrelativa(unlam,codigoMateria,codigoMateria2));
		
		
		
		
	
	}
	
	
}
	

	
	


