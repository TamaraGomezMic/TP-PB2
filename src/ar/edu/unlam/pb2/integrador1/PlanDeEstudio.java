package ar.edu.unlam.pb2.integrador1;


import java.util.ArrayList;

import java.util.List;

public class PlanDeEstudio {

	private List <Materia> materiaDelPlan;
	private String nombreCarrera = "";
	
	public PlanDeEstudio(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
		this.materiaDelPlan = new ArrayList <Materia>();
	}
	
	
	

	public List<Materia> getMateriaPlan() {
		return materiaDelPlan;
	}




	public void setMateria(Materia materia) {
		this.materiaDelPlan.add(materia);
	}




	public String getNombreCarrera() {
		return nombreCarrera;
	}




	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	
	

	public Boolean ingresarMateriaAlPlanDeEstudio(Universidad universidad, Integer codigoMateria) {
		
		// buscar la materia que este registrada en el array de la universidad
		
		
			if ( universidad.buscarMateriaPorCodigo(codigoMateria)!= null) {
				Materia materiaAagregar = universidad.buscarMateriaPorCodigo(codigoMateria);
				this.materiaDelPlan.add(materiaAagregar);
				return true;
			}
		return false;
	}
	
	public Boolean ingresarCorrelativa(Universidad universidad, Integer codigoMateria, Integer codigoMateria2) {
		if ( universidad.buscarMateriaPorCodigo(codigoMateria)!= null && universidad.buscarMateriaPorCodigo(codigoMateria2)!= null) {
			Materia correlativaAagregar = universidad.buscarMateriaPorCodigo(codigoMateria2);
			for(int i=0 ; i< materiaDelPlan.size(); i++) {
				if(this.materiaDelPlan.get(i).equals(universidad.buscarMateriaPorCodigo(codigoMateria))){
				this.materiaDelPlan.get(i).setCorrelativa(correlativaAagregar);
			
			return true;
				}
		}
	
		
	
	}return false;
		
	}
				


	public Boolean eliminarCorrelativa(Universidad universidad, Integer codigoMateria, Integer codigoMateria2) {
		
		if ( universidad.buscarMateriaPorCodigo(codigoMateria)!= null && universidad.buscarMateriaPorCodigo(codigoMateria2)!= null) {
			Materia correlativaAeliminar = universidad.buscarMateriaPorCodigo(codigoMateria2);
			for(int i=0 ; i< materiaDelPlan.size(); i++) {
				if(this.materiaDelPlan.get(i).equals(universidad.buscarMateriaPorCodigo(codigoMateria))){
						for(int j=0; j<materiaDelPlan.get(i).getCorrelativa().size();j++) {
						if(this.materiaDelPlan.get(i).getCorrelativa().get(j).equals(correlativaAeliminar)) {
							this.materiaDelPlan.get(i).getCorrelativa().remove(j);
							}
						}
			
			return true;
				}
		}
	
		
	
	}return false;
	}




	public Materia buscarMateriaPorCodigo(Integer codigoMateria) {
		for (int i = 0; i < this.materiaDelPlan.size(); i++) {
			if (this.materiaDelPlan.get(i).getCodigoDeMateria().equals(codigoMateria))
				return this.materiaDelPlan.get(i);
		}
		return null;
	}
	
	}







	







	
		
	




	
	
	

