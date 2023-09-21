package ar.edu.unlam.pb2.integrador1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;



public class TestUniversidad {
	
	
	@Test  
	public void queSePuedaRegistrarUnAlumnoAUnaUniversidad() { //anda//
		 String  nombreUniversidad = "Unlam";
    	String nombre = "Marta";
    	String apellido = "perez";
    	Long dni= 44555897L; 
    	Integer legajo = 1;
    	String celular = "15-6665-5848";
    	String email = "martaPerez@unlam.edu.ar";
    	
    	Universidad unlam = new Universidad (nombreUniversidad);
   		Alumno alumno = new Alumno(legajo , dni, nombre,apellido, celular,  email);
    	
		Boolean registroExitoso = unlam.registrar(alumno);
    	assertTrue(registroExitoso);
    	
    	
	}
	
	@Test
			public void queNoSePuedaRegistrarUnAlumnoCuandoElAlumnoYaEsteRegistradoAUnaUniversidad() { //anda//
			String  nombreUniversidad = "Unlam";
	     	String nombre = "Marta";
	    	String apellido = "perez";
	    	Long dni= 44555897L; 
	    	Integer legajo = 1;
	    	String celular = "15-6665-5848";
	    	String email = "martaPerez@unlam.edu.ar";
	    	
	    	Universidad unlam = new Universidad (nombreUniversidad);
	   		Alumno alumno = new Alumno(legajo , dni, nombre,apellido,  celular,  email);
	   		Alumno alumno2 = new Alumno (2,dni,"jose",celular,email, "Lopez");
	   		
	   		unlam.registrar(alumno);
    	
	   		Boolean registroExitoso = unlam.registrar(alumno2);
	   		assertFalse(registroExitoso);
    	
    	
	}
	
	@Test
	public void queSePuedaRegistrarUnaMateriaAUnaUniversidad() { //anda****
		String  nombre = "Unlam";
    	String nombreMateria = "PB2";
        Integer codigo = 1;
        
        Universidad unlam = new Universidad (nombre);
        Materia pb2 = new Materia(codigo,nombreMateria);
        assertTrue (unlam.registraMateria(pb2));
    	       
	}
	
	@Test
	public void queSeNoPuedaRegistrarUnaMateriaAUnaUniversidadConMismoId() { //anda********
		String  nombre = "Unlam";
      	String nombreMateria1 = "PB2 ", nombreMateria2 ="PB1";
        Integer codigo = 1;
        
        Universidad unlam = new Universidad (nombre);
        Materia pb2 = new Materia(codigo,nombreMateria1);
        Materia pb1 = new Materia(codigo,nombreMateria2);
        
        unlam.registraMateria(pb2);
        assertFalse (unlam.registraMateria(pb1));
    	       
	}
	
	
	@Test
	public void queSePuedaCrearUnPlanDeEstudio() { // anda ***
		String nombre = "Desarrollo Web";
		
		PlanDeEstudio Tecnicatura = new PlanDeEstudio(nombre);
		assertNotNull(Tecnicatura);
	
	}
	
	@Test
	public void queSePuedaIngresaUnaCorrelativa() { // este estoy haciendo//
		
		 	String nombre = "Desarrollo Web";
	    	String nombreMateria = "PB2";
	        
	        
	        
	        Materia pb2 = new Materia(codigo,nombreMateria);
			PlanDeEstudio Tecnicatura = new PlanDeEstudio(nombre);
		
		assertNotNull(Tecnicatura);
		
		
	}
	
	//ciclo lectivo  id, fechaDeInicioDeCicloLectivo,fechaFinalizacionCicloLectivo, fechaInicioInscripcion,fechaFinalizacionInscripcion
	@Test
	public void queSePuedaCrearUnCicloLectivo() {
		
	}
	 
		
	// comision id,Materia,CicloLectivo, turno
	// que se pueda crear un curso 
	// PARA MI EN COMISION DEBERIAMOS AGREGAR EL AULA QUE SE ASIGNA DEPENDIENDO LA CANTIDAD DE ALUMNOS
	@Test
	public void queSePuedaCrearUnaComision() {
		
	}
	
	// Aula id, cantidadDeAlumnos
	@Test
	public void queSePuedaAsignarUnAula() {
		
	}
	
	//docente
	
	@Test
	public void queSePuedaRegistrarUnDocente() {
		
	}
	
	@Test
	// verificar que el alumno y el curso esten dado de alta
	public void queSePuedaInscribirAlumnoAunCurso() {
		
	}
	@Test
	public void queSePuedaCrearUnCicloLectivo() {
		
	}
	
//	@Test
//	public void queSePuedaInscribirUnAlumnoenMateria() {
//		 String  nombre = "Unlam";
//    	Universidad unlam = new Universidad (nombre);
//    	nombre = "PB2 ";
//        Integer codigo = 1;
//        Materia pb2 = new Materia (codigo,nombre);
//        unlam.registraMateria(pb2);
//     	nombre = "Marta";
//    	String apellido = "perez";
//    	Integer dni= 44555; 
//        Alumno alumno = new Alumno(dni,apellido, nombre);
//    	unlam.registrar(alumno);
//    	assertTrue (unlam.inscribirAlumnoAUnaMateria(dni,codigo)) ;
//    	       
//	}
	
	
	
	
}
