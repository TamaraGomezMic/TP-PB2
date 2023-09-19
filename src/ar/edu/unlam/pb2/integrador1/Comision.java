package ar.edu.unlam.pb2.integrador1;

public class Comision {
	
	private Integer idComision;
	
	public Comision(Integer idComision) {
		this.setIdComision(idComision);
	}

	public Integer getIdComision() {
		return idComision;
	}

	public void setIdComision(Integer idComision) {
		this.idComision = idComision;
	}

	
	/*
	// no se puede generar 2 comisiones para la misma materia , el mismo ciclo lectivo y el mismo turno 
	
	public Boolean asignarProfesorAlCurso(Integer idCurso, Long dniDocente) {
		
		//verificar que exita el curso y el docente
		// cada 20 alumnos se debe agregar un docente ejemplo de 1 a 20 alumnos solo se puede agregar 1 docente de 21 a 40 serian 2 docentes
		return null;
		
	}
	
	public <ArrayList> obtenerReporteDeNotasDeAlumnosDelCurso(idCurso){
		//muestra curso,nombre dela materia, dni, nombre y apellido y nota 
	}*/
}
