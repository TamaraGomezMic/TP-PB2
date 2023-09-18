package ar.edu.unlam.pb2.integrador1;

public class Aula {
	private Integer nroAula;
	private Integer capacidadMaxima;
	

	public Aula(Integer nroAula, Integer capacidadMaxima) {
	this.setNroAula(nroAula);
	this.setCapacidadMaxima(capacidadMaxima);
	
	}


	public Integer getNroAula() {
		return nroAula;
	}


	public void setNroAula(Integer nroAula) {
		this.nroAula = nroAula;
	}


	public Integer getCapacidadMaxima() {
		return capacidadMaxima;
	}


	public void setCapacidadMaxima(Integer capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
}
