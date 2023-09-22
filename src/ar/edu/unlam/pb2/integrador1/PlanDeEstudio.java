package ar.edu.unlam.pb2.integrador1;


import java.util.HashSet;
import java.util.Set;

public class PlanDeEstudio {

	private Set <Materia> materia;
	private String nombreCarrera = "";
	
	public PlanDeEstudio(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
		this.materia = new HashSet <Materia>();
	}
	
	
	

	public Set<Materia> getMateria() {
		return materia;
	}




	public void setMateria(Set<Materia> materia) {
		this.materia = materia;
	}




	public String getNombreCarrera() {
		return nombreCarrera;
	}




	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}




	public Boolean asignarMateriaCorrelativa(Integer codigoMateria, Integer codigoMateriaCorrelativa) {
		return null;
		
		// se debe validar que ambos codigos existan en una materia
		
			}
	
	public Boolean eliminarCorrelativa( Integer codigoMateria, Integer codigoMAteriaAeliminar) {
		
		// se debe validar que ambos codigos existan en una materia
		return null;
		
	}
	
	
}
