package ar.edu.unlam.pb2.integrador1;



import java.util.Objects;
import java.time.LocalDate;

public class CicloLectivo {

	private Integer idCiclo;
	private LocalDate inicioCiclo;
	private LocalDate finCiclo;
	
	private Turno turno;
	

	public CicloLectivo(Integer idCiclo,LocalDate inicioCiclo,LocalDate finCiclo) {
		this.idCiclo = idCiclo;
		this.inicioCiclo = inicioCiclo;
		this.finCiclo = finCiclo;
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

	

	

	public LocalDate getInicioCiclo() {
		return inicioCiclo;
	}

	public void setInicioCiclo(LocalDate inicioCiclo) {
		this.inicioCiclo = inicioCiclo;
	}

	public LocalDate getFinCiclo() {
		return finCiclo;
	}

	public void setFinCiclo(LocalDate finCiclo) {
		this.finCiclo = finCiclo;
	}

	
	

	
	
	

	
	// no se puede asignar 2 ciclos lectivos con el mismo ID
}
