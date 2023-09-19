package ar.edu.unlam.pb2.integrador1;

public class Materia {

	private Integer codigoMateria;
	private Integer nombreMateria;
	
	public Materia(Integer codigoMateria) {
		this.codigoMateria = codigoMateria;
	}
	
	public Materia(Integer codigo, String nombre) {
		// TODO Auto-generated constructor stub
	}

	public Object getCodigo() {
		
		return null;
	}



	public Integer getCodigoMateria() {
		return codigoMateria;
	}



	public void setCodigoMateria(Integer codigoMateria) {
		this.codigoMateria = codigoMateria;
	}

	public Integer getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(Integer nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	
	
	// no se puede asignar 2 materias con el mismo  id
	
	
	

}
