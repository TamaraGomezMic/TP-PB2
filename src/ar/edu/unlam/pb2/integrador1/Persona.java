package ar.edu.unlam.pb2.integrador1;

import java.time.LocalDate;

public abstract class Persona {
	//ATRIBUTOS
		private Long dni;
		private String nombre;
		private Long celular;
		private String email;
		private String apellido;
		private LocalDate fechaDeNacimiento;
		
		
		//CONSTRUCTOR
		public Persona(Long dni, String nombre, Long celular, String email, String apellido, LocalDate fechaDeNacimiento) {
			this.setDni(dni);
			this.nombre=nombre;
			this.celular=celular;
			this.email=email;
			this.apellido=apellido;
			this.fechaDeNacimiento=fechaDeNacimiento;
			
		}



		public Persona() {
			
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



		public LocalDate getFechaDeNacimiento() {
			return fechaDeNacimiento;
		}



		public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
			this.fechaDeNacimiento = fechaDeNacimiento;
		}
}
