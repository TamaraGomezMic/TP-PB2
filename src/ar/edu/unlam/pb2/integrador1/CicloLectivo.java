package ar.edu.unlam.pb2.integrador1;

import java.util.HashSet;
import java.util.Objects;


public class CicloLectivo {

	private Integer idCiclo;
	private String turno;
	private HashSet<Materia> materias;

	public CicloLectivo(Integer idCiclo, String turno) {
		this.idCiclo = idCiclo;
		this.turno = turno;
	}

	public Integer getIdCiclo() {
		return idCiclo;
	}

	public void setIdCiclo(Integer idCiclo) {
		this.idCiclo = idCiclo;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(idCiclo);
	}

	public void agreagarUnMateriaAlCiclo(Materia materia) {
		materias.add(materia);
		
	}

	
	
	

	
	// no se puede asignar 2 ciclos lectivos con el mismo ID
}
