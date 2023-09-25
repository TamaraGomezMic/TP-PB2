package ar.edu.unlam.pb2.integrador1;

import java.util.HashSet;
import java.util.Objects;
import java.time.LocalDate;

public class CicloLectivo {

	private Integer idCiclo;
	private LocalDate inicioRangoCiclo;
	private LocalDate finRangoCiclo;
	
	private Turno turno;
	private HashSet<Materia> materias;

	public CicloLectivo(Integer idCiclo,LocalDate inicioRangoCiclo,LocalDate finRangoCiclo) {
		this.idCiclo = idCiclo;
		this.inicioRangoCiclo = inicioRangoCiclo;
		this.finRangoCiclo = finRangoCiclo;
	}

	public Integer getIdCiclo() {
		return idCiclo;
	}

	public void setIdCiclo(Integer idCiclo) {
		this.idCiclo = idCiclo;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(idCiclo);
	}

	public void agreagarUnMateriaAlCiclo(Materia materia) {
		materias.add(materia);
		
	}

	public LocalDate getInicioRangoCiclo() {
		return inicioRangoCiclo;
	}

	public void setInicioRangoCiclo(LocalDate inicioRangoCiclo) {
		this.inicioRangoCiclo = inicioRangoCiclo;
	}

	public LocalDate getFinRangoCiclo() {
		return finRangoCiclo;
	}

	public void setFinRangoCiclo(LocalDate finRangoCiclo) {
		this.finRangoCiclo = finRangoCiclo;
	}

	public HashSet<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(HashSet<Materia> materias) {
		this.materias = materias;
	}

	

	
	
	

	
	// no se puede asignar 2 ciclos lectivos con el mismo ID
}
