package ar.edu.unlam.pb2.integrador1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;


public class Materia {

	private Integer codigoDeMateria;
	private String nombre;
	private ArrayList <Materia> correlativa;
	private ArrayList <CicloLectivo> cicloLectivo;
	private HashSet<CicloLectivo> ciclos;

	public Materia(Integer codigo, String nombre) {
	    this.codigoDeMateria = codigo;
		this.nombre=nombre;
		correlativa = new ArrayList <Materia>();
		
	}
	
	
	public Integer getCodigoDeMateria() {
		return codigoDeMateria;
	}
	


	public void setCodigoDeMateria(Integer codigoDeMateria) {
			this.codigoDeMateria = codigoDeMateria;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public ArrayList<Materia> getCorrelativa() {
		return correlativa;
	}


	public void setCorrelativa(ArrayList<Materia> correlativa) {
		this.correlativa = correlativa;
	}


	public ArrayList <CicloLectivo> getCicloLectivo() {
		return cicloLectivo;
	}


	public void setCicloLectivo(ArrayList <CicloLectivo> cicloLectivo) {
		this.cicloLectivo = cicloLectivo;
	}


	public void agregarCicloLectivo(CicloLectivo ciclo) {
		ciclos.add(ciclo);
		
	}



	@Override
	public int hashCode() {
		return Objects.hash(codigoDeMateria);
	}
	
	

}
