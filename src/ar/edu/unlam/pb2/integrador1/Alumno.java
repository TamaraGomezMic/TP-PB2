package ar.edu.unlam.pb2.integrador1;


public class Alumno extends Persona{

	
		
    	
	public 	Alumno (Integer legajo, Long dni, String nombre, String celular, String email, String apellido) {
	super(legajo, dni, nombre, celular, email, apellido);
		
	
	
	}
	
	// no se puede asignar 2 alumnos con el mismo DNI
	
	

	// creo que tendria que tener unaclase aparte donde este todo el alumno , la carrera, las materias aprobadas
	 public Boolean registrarNota (idCurso,idAlumno,nota) {
		 //la nota debe estar entre 1 a 10
		 //no se puede asignar una nota mayor o igual a 7 si sus correlativas no estan aprobadas
		 //las notas son de tipo 1erParcial, 2doParcial ,rec!parcial,Rec2parcial
		 // se pueden asigna hasta 3 tipos de notas pero no se puede cargar 2 notas del mismo tipo 
		 
	 }
	 
	 public <ArrayList> obtenerListadoMateriasAprobadas(idAlumno){
		// va a mostrar  dni,nombredelAlumno y apellido, materia , nota y ciclo lectivo
	 }
	 
	 public <ArrayList> obtenerMateriasQueFaltanCursar(idAlumno){
		 // va a mostrar la nombre de la materia
	 }
	 
	 

}
