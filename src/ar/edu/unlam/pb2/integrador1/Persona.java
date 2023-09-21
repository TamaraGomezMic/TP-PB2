package ar.edu.unlam.pb2.integrador1;

public abstract class Persona {
	//ATRIBUTOS
		private Long dni;
		private String nombre;
		private String celular;
		private String email;
		private Integer legajo;
		private String apellido;
		
		
		
		//CONSTRUCTOR
		public Persona(Integer legajo, Long dni, String nombre, String apellido, String celular, String email) {
			this.setDni(dni);
			this.nombre=nombre;
			this.celular=celular;
			this.email=email;
			this.legajo=legajo;
			this.apellido=apellido;
		}



		public String getNombre() {
			return nombre;
		}




		public void setNombre(String nombre) {
			this.nombre = nombre;
		}




		public String getCelular() {
			return celular;
		}




		public void setCelular(String celular) {
			this.celular = celular;
		}




		public String getEmail() {
			return email;
		}




		public void setEmail(String email) {
			this.email = email;
		}




		public Integer getLegajo() {
			return legajo;
		}




		public void setLegajo(Integer legajo) {
			this.legajo = legajo;
		}




		public Long getDni() {
			return dni;
		}




		public void setDni(Long dni) {
			this.dni = dni;
		}




		public String getApellido() {
			return apellido;
		}




		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
}
