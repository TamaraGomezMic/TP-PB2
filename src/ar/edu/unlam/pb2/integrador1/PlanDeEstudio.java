package ar.edu.unlam.pb2.integrador1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PlanDeEstudio {

	private Set <Materia> materia;
	private String nombreCarrera = "";
	
	public PlanDeEstudio(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
		this.materia = new HashSet <Materia>();
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
