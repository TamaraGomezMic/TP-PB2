package ar.edu.unlam.pb2.integrador1;

import java.time.LocalDate;




public class Alumno extends Persona{
	


	//ATRIBUTOS
	private Integer idAlumno;
	private Long dniAlu;
	private String nombreAlu;
	private String apellidoAlu;
	private LocalDate fechaDeNacimientoAlu;
	private LocalDate fechaDeIngresoAlu;
	private Long celular;
	private String email;
	

	//CONSTRUCTOR
	
	 public Alumno(Integer idAlumno, Long dniAlu, String nombreAlu, String apellidoAlu, LocalDate fechaDeNacimientoAlu,
				LocalDate fechaDeIngresoAlu, Long celular, String email) {
			super(idAlumno,dniAlu,nombreAlu,apellidoAlu,fechaDeNacimientoAlu,celular,email);
			this.fechaDeIngresoAlu = fechaDeIngresoAlu;
		}


	//METODOS
	
	
	// no se puede asignar 2 alumnos con el mismo DNI
	
	

	// creo que tendria que tener unaclase aparte donde este todo el alumno , la carrera, las materias aprobadas




	public LocalDate getFechaDeIngresoAlu() {
		return fechaDeIngresoAlu;
	}


	public void setFechaDeIngresoAlu(LocalDate fechaDeIngresoAlu) {
		this.fechaDeIngresoAlu = fechaDeIngresoAlu;
	}







	//--------------------------------------------------
	
	/*
	public Boolean registrarNota(idComision, idAlumno, nota) {
=======
	
	//public Boolean registrarNota (idCurso,idAlumno,nota) {
>>>>>>> manrique
		 //la nota debe estar entre 1 a 10
		 //no se puede asignar una nota mayor o igual a 7 si sus correlativas no estan aprobadas
		 //las notas son de tipo 1erParcial, 2doParcial ,rec!parcial,Rec2parcial
		 // se pueden asigna hasta 3 tipos de notas pero no se puede cargar 2 notas del mismo tipo 
		 
<<<<<<< HEAD
	 }
	
	 public <ArrayList> obtenerListadoMateriasAprobadas(idAlumno){
=======
	// }
	 
	// public <ArrayList> obtenerListadoMateriasAprobadas(idAlumno){
>>>>>>> manrique
		// va a mostrar  dni,nombredelAlumno y apellido, materia , nota y ciclo lectivo
	// }
	 
	// public <ArrayList> obtenerMateriasQueFaltanCursar(idAlumno){
		 // va a mostrar la nombre de la materia
	// }
	 
	*/ 

}
