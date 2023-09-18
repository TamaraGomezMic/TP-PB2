package ar.edu.unlam.pb2.integrador1;

public abstract class Persona {
	//ATRIBUTOS
		private Long dni;
		private String nombre;
		private Long celular;
		private String email;
		private String legajo;
		private String apellido;
		
		
		
		//CONSTRUCTOR
		public Persona(String legajo, Long dni, String nombre, Long celular, String email, String apellido) {
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




		public Long getCelular() {
			return celular;
		}




		public void setCelular(Long celular) {
			this.celular = celular;
		}




		public String getEmail() {
			return email;
		}




		public void setEmail(String email) {
			this.email = email;
		}




		public String getLegajo() {
			return legajo;
		}




		public void setLegajo(String legajo) {
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
