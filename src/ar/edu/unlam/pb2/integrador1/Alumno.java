package ar.edu.unlam.pb2.integrador1;

import java.time.LocalDate;

public class Alumno{

	//ATRIBUTOS
	private Integer idAlumno;
	private Long dniAlu;
	private String nombreAlu;
	private String apellidoAlu;
	private LocalDate fechaDeNacimientoAlu;
	private LocalDate fechaDeIngresoAlu;
		
    
	

	//CONSTRUCTOR
	public Alumno(Integer idAlumno, Long dniAlu, String nombreAlu, String apellidoAlu, LocalDate fechaDeNacimientoAlu, LocalDate fechaDeIngresoAlu) {
		this.idAlumno = idAlumno;
		this.dniAlu = dniAlu;
		this.nombreAlu=nombreAlu;
		this.apellidoAlu=apellidoAlu;
		this.fechaDeNacimientoAlu=fechaDeNacimientoAlu;
		this.fechaDeIngresoAlu=fechaDeIngresoAlu;
		
	}


	//METODOS
	
	
	

	// no se puede asignar 2 alumnos con el mismo DNI
	
	

	// creo que tendria que tener unaclase aparte donde este todo el alumno , la carrera, las materias aprobadas
	 public Long getDniAlu() {
		return dniAlu;
	}


	public void setDniAlu(Long dniAlu) {
		this.dniAlu = dniAlu;
	}


	public String getNombreAlu() {
		return nombreAlu;
	}


	public void setNombreAlu(String nombreAlu) {
		this.nombreAlu = nombreAlu;
	}


	public String getApellidoAlu() {
		return apellidoAlu;
	}


	public void setApellidoAlu(String apellidoAlu) {
		this.apellidoAlu = apellidoAlu;
	}


	public LocalDate getFechaDeNacimientoAlu() {
		return fechaDeNacimientoAlu;
	}


	public void setFechaDeNacimientoAlu(LocalDate fechaDeNacimientoAlu) {
		this.fechaDeNacimientoAlu = fechaDeNacimientoAlu;
	}


	public LocalDate getFechaDeIngresoAlu() {
		return fechaDeIngresoAlu;
	}


	public void setFechaDeIngresoAlu(LocalDate fechaDeIngresoAlu) {
		this.fechaDeIngresoAlu = fechaDeIngresoAlu;
	}


	public Integer getIdAlumno() {
		return idAlumno;
	}


	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

	//--------------------------------------------------
	
	/*
	public Boolean registrarNota(idComision, idAlumno, nota) {
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
	 
	*/ 

}
