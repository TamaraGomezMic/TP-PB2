package ar.edu.unlam.pb2.integrador1;

import java.util.ArrayList;

public class Materia {
	private Integer codigoDeMateria = 0;
	private String nombre = "";
	private ArrayList <Materia> correlativa;

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

	
	
	
	
	
	

}
