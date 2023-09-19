package ar.edu.unlam.pb2.integrador1;

import java.time.LocalDate;

public class Alumno extends Persona{

	//ATRIBUTOS
	private LocalDate fechaDeIngreso;
		
    
	

	//CONSTRUCTOR
	public 	Alumno(Long dni, String nombre, Long celular, String email, String apellido, LocalDate fechaDeNacimiento, LocalDate fechaDeIngreso) {
	super(dni, nombre, celular, email, apellido, fechaDeNacimiento);
		
	this.fechaDeIngreso = fechaDeIngreso;
	
	}
	
	public Alumno(Long dni, String nombre, String celular, String email, String apellido) {
		super();

	}
	
	public Alumno(Long dni, String apellido, String nombre) {
		
		
		
		
	}

	//METODOS
	public LocalDate getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public void setFechaDeIngreso(LocalDate fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
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
