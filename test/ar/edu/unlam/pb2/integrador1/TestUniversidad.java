package ar.edu.unlam.pb2.integrador1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;



public class TestUniversidad {
	
	// agregar alumno 
	@Test
	public void queSePuedaRegistrarUnAlumnoAUnaUniversidad() {
		 String  nombreUniversidad = "Unlam";
    	String nombre = "Marta";
    	String apellido = "perez";
    	Long dni= 44555897L; 
        LocalDate fechaDeNacimientoAlu=LocalDate.of(2003, 01, 03);
    	LocalDate fechaDeIngresoAlu=LocalDate.of(2023, 01, 03);
    	
    	Universidad unlam = new Universidad (nombreUniversidad);
   		Alumno alumno = new Alumno(dni, nombre, apellido, fechaDeIngresoAlu, fechaDeIngresoAlu);
   		
    	
		Boolean registroExitoso = unlam.registrar(alumno);
    	assertTrue(registroExitoso);
    	System.out.println(registroExitoso);
    	
	}
	
	
	@Test
	public void queNoSePuedaRegistrarUnAlumnoCuandoElAlumnoYaEsteRegistradoAUnaUniversidad() {
		 String  nombre = "Unlam";
    	Universidad unlam = new Universidad (nombre);
    	nombre = "Marta";
    	String apellido = "perez";
    	Long dni= 44555L; 
    	LocalDate fechaDeNacimientoAlu=LocalDate.of(2003, 01, 03);
     	LocalDate fechaDeIngresoAlu=LocalDate.of(2023, 01, 03);
    	Alumno alumno = new Alumno (dni,apellido, nombre, fechaDeIngresoAlu, fechaDeIngresoAlu);
    	Alumno alumno2 = new Alumno (dni,"jose", "Lopez", fechaDeIngresoAlu, fechaDeIngresoAlu);
    	unlam.registrar(alumno);
		Boolean registroExitoso = unlam.registrar(alumno2);
    	assertFalse(registroExitoso);
    	
    	
	}
	
	@Test
	
	// agregar materia
	public void queSePuedaRegistrarUnaMateriaAUnaUniversidad() {
		 String  nombre = "Unlam";
    	Universidad unlam = new Universidad (nombre);
    	nombre = "PB2 ";
        Integer codigo = 1;
        Materia pb2 = new Materia (codigo,nombre);
        assertTrue (unlam.registraMateria(pb2));
    	       
	}
	
	
	
	@Test
	public void queSePuedaInscribirUnAlumnoenMateria() {
		//PREPARACION
		String  nombre = "Unlam";
    	nombre = "PB2 ";
        Integer codigo = 1;
     	nombre = "Marta";
    	String apellido = "perez";
    	Long dni= 44555L;    
    	LocalDate fechaDeNacimientoAlu=LocalDate.of(2003, 01, 03);
     	LocalDate fechaDeIngresoAlu=LocalDate.of(2023, 01, 03);
    	
    	//ACCION
    	Universidad unlam = new Universidad (nombre);
    	Materia pb2 = new Materia (codigo,nombre);
    	unlam.registraMateria(pb2);
    	Alumno alumno = new Alumno (dni,apellido, nombre, fechaDeIngresoAlu, fechaDeIngresoAlu);
    	unlam.registrar(alumno);
    	
    	//VALIDACION
    	
    	assertTrue (unlam.inscribirAlumnoAUnaMateria(dni,codigo)) ;
    	       
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
	
	
	
	
}
