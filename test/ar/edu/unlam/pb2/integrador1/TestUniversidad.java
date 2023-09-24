package ar.edu.unlam.pb2.integrador1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;



public class TestUniversidad {
	
	
	@Test  
	public void queSePuedaRegistrarUnAlumnoAUnaUniversidad() { //anda//
		String  nombreUniversidad = "Unlam";
    	String nombre = "Marta";
    	String apellido = "perez";
    	Long dni= 44555897L; 
    	Long celular = 1566655848L;
    	String email = "martaPerez@unlam.edu.ar";
		LocalDate fechaDeNacimientoAlu=LocalDate.of(2003, 01, 03);
    	LocalDate fechaDeIngresoAlu=LocalDate.of(2023, 01, 03);
    	Integer idAlumno = 1;
    	
    	
    	Universidad unlam = new Universidad(nombreUniversidad);
   		Alumno alumno = new Alumno(idAlumno,dni,nombre,celular, email, apellido,
   				fechaDeNacimientoAlu,fechaDeIngresoAlu);
	    	   	
		Boolean registroExitoso = unlam.registrar(alumno);
    	assertTrue(registroExitoso);
    	//System.out.println(registroExitoso);
    	
	}
	
	@Test
	public void queNoSePuedaRegistrarUnAlumnoCuandoElAlumnoYaEsteRegistradoAUnaUniversidad() { //anda//
			String  nombreUniversidad = "Unlam";
	     	String nombre = "Marta";
	    	String apellido = "perez";
	    	Long dni= 44555897L; 
	    	Integer idAlumno = 1;
	    	Long celular = 1566655848L;
	    	String email = "martaPerez@unlam.edu.ar";
	    	LocalDate fechaDeNacimientoAlu=LocalDate.of(2003, 01, 03);
	     	LocalDate fechaDeIngresoAlu=LocalDate.of(2023, 01, 03);
	    	
	    	
	    	Universidad unlam = new Universidad (nombreUniversidad);
	    	Alumno alumno1 = new Alumno(idAlumno,dni,nombre,celular, email, apellido,
	   				fechaDeNacimientoAlu,fechaDeIngresoAlu);
	    	Alumno alumno2 = new Alumno(idAlumno,dni,nombre,celular, email, apellido,
	   				fechaDeNacimientoAlu,fechaDeIngresoAlu);
	
	   		
	   		unlam.registrar(alumno1);	   		  	
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
	
	//////////////////
	
	/*@Test
	public void queSePuedaInscribirUnAlumnoenMateria() { //es proceso
		String  nombreUniversidad = "Unlam";
     	String nombre = "Marta";
    	String apellido = "perez";
    	Long dni= 44555897L; 
    	Integer idAlumno = 1;
    	Long celular = 1566655848L;
    	String email = "martaPerez@unlam.edu.ar";
    	LocalDate fechaDeNacimientoAlu=LocalDate.of(2003, 01, 03);
     	LocalDate fechaDeIngresoAlu=LocalDate.of(2023, 01, 03);
     
    	
    	Universidad unlam = new Universidad (nombreUniversidad);
    	Alumno alumno1 = new Alumno(idAlumno, dni, nombre, apellido, fechaDeNacimientoAlu, fechaDeIngresoAlu, celular, email);
    	unlam.registrar(alumno1);
        
        assertTrue(unlam.inscribirAlumnoAUnaMateria(dni,idAlumno)) ;
	
	}*/

	///////////////////////
	
	
	//docente
	
		@Test
		public void queSePuedaCrearUnDocente() {
			
				// PREPARACION
			String nombreDeLaUniversidad = "Unlam";
				Long dni = 37246801L;
				String nombre = "lucas";
				Long celular = 1123451234L;
				String email = "lucasbarrios@alumno.edu.ar";
				Integer legajo = 333;
				String apellido = "Barrios";
				LocalDate fechaDeNacimiento=LocalDate.of(2003, 01, 03);

				// ACCION
				Universidad unlam = new Universidad(nombreDeLaUniversidad);
				Profesor nuevoDocente = new Profesor(legajo,dni,nombre, apellido, fechaDeNacimiento, celular,
					 email);
				Boolean seCreo = unlam.CrearUnDocente(nuevoDocente);

				// VALIDACION
				assertNotNull(seCreo);
				System.out.println(seCreo);
			}

	
		@Test
		public void queNoSePuedaRegistrarDosDocentesConElMismoDni() {
			String nombreDeLaUniversidad = "Unlam";
			
			Long dni = 37246801L;
			String nombre = "lucas";
			Long celular = 1123451234L;
			String email = "lucasbarrios@alumno.edu.ar";
			Integer legajo = 333;
			String apellido = "Barrios";
			LocalDate fechaDeNacimiento=LocalDate.of(2003, 01, 03);

			Long dni1 = 37233801L;
			
			
			//ACCION
			Profesor nuevoProfesor = new Profesor(legajo,dni,nombre, apellido, fechaDeNacimiento, celular,
					 email);
			Profesor nuevoProfesor2 = new Profesor(legajo,dni1,nombre, apellido, fechaDeNacimiento, celular,
					 email);
			Universidad Unlam = new Universidad(nombreDeLaUniversidad);
			Unlam.CrearUnDocente(nuevoProfesor);
			Boolean sePudoCrear = Unlam.CrearUnDocente(nuevoProfesor2);
			assertFalse (sePudoCrear);
			System.out.println(sePudoCrear);
			
	  
		}
	
	
	
	
	
	@Test

	public void queSePuedaCrearUnPlanDeEstudio() { // anda ***
		String nombre = "Desarrollo Web";
		
		PlanDeEstudio Tecnicatura = new PlanDeEstudio(nombre);
		assertNotNull(Tecnicatura);
	
	}
	
	/*@Test
	public void queSePuedaIngresaUnaCorrelativa() { // este estoy haciendo//
		
		 	String nombre = "Desarrollo Web";
	    	String nombreMateria = "PB2";
	    	Integer codigo = 2;
	        
	        
	        Materia pb2 = new Materia(codigo,nombreMateria);
			PlanDeEstudio Tecnicatura = new PlanDeEstudio(nombre);
		
		assertNotNull(Tecnicatura);
		
		
>>>>>>> manrique
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
	
	
	
	@Test
	// verificar que el alumno y el curso esten dado de alta
	public void queSePuedaInscribirAlumnoAunCurso() {
		
	}*/
	
	
	
	
	
}
