package ar.edu.unlam.pb2.integrador1;

import java.util.List;
import java.util.Objects;

public class Comision {
	
	private Materia materia;
	private CicloLectivo ciclo;
	private Turno turno;
	private Aula aula;
	private Integer idComision;
	private List<RegistroDeNotaExamenes> registroDeNota;
	
	
	

	public Comision(Integer idComision) {
		
		this.idComision=idComision;
		
	}




	public Integer getIdComision() {
		return idComision;
	}

	public void setIdComision(Integer idComision) {
		this.idComision = idComision;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public CicloLectivo getCiclo() {
		return ciclo;
	}

	public void setCiclo(CicloLectivo ciclo) {
		this.ciclo = ciclo;
	}

	

	



	public List<RegistroDeNotaExamenes> getRegistroDeNota() {
		return registroDeNota;
	}




	public void setRegistroDeNota(List<RegistroDeNotaExamenes> registroDeNota) {
		this.registroDeNota = registroDeNota;
	}



	public Aula getAula() {
		return aula;
	}




	public void setAula(Aula aula) {
		this.aula = aula;
	}


	

	
	@Override
	public int hashCode() {
		return Objects.hash(ciclo, materia, turno);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comision other = (Comision) obj;
		return Objects.equals(ciclo, other.ciclo) && Objects.equals(materia, other.materia) && Objects.equals(turno, other.turno);
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
