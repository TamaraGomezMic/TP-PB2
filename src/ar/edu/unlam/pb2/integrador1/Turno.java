package ar.edu.unlam.pb2.integrador1;

import java.util.List;

public class Turno {

	private Comision idComision;
	private Materia materia;
	private CicloLectivo ciclo;
	private String turno;
	private Aula aula;
	private List<RegistroDeNotaExamenes> registroDeNota;
	
	public Turno(Comision idComision,Materia materia,CicloLectivo ciclo,Aula aula, String turno) {
		this.materia=materia;
		this.setIdComision(idComision);
		this.ciclo=ciclo;
		this.turno = turno;
		this.aula=aula;
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

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public List<RegistroDeNotaExamenes> getRegistroDeNota() {
		return registroDeNota;
	}

	public void setRegistroDeNota(List<RegistroDeNotaExamenes> registroDeNota) {
		this.registroDeNota = registroDeNota;
	}



	public Comision getIdComision() {
		return idComision;
	}



	public void setIdComision(Comision idComision) {
		this.idComision = idComision;
	}
	
}
