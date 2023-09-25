package ar.edu.unlam.pb2.integrador1;

import java.time.LocalDate;
import java.util.Objects;



public abstract class Persona {
	//ATRIBUTOS
		private Long dni;
		private String nombre;
		private Long celular;
		private String email;
		private Integer legajo;
		private String apellido;
		private LocalDate fechaDeNacimiento;
		
		
		
		
		//CONSTRUCTOR
		public Persona(Integer legajo, Long dni, String nombre, Long celular, String email, String apellido, LocalDate fechaDeNacimiento) {
			this.setDni(dni);
			this.nombre=nombre;
			this.celular=celular;
			this.email=email;
			this.legajo=legajo;
			this.apellido=apellido;		
			this.fechaDeNacimiento = fechaDeNacimiento;
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



		public LocalDate getFechaDeNacimiento() {
			return fechaDeNacimiento;
		}



		public void setFechaDeNacimientoAlu(LocalDate fechaDeNacimientoAlu) {
			this.fechaDeNacimiento = fechaDeNacimientoAlu;
		}

	

		// selecciono por que parametro voy a comparar (legajo)

		@Override
		public int hashCode() {
			return Objects.hash(legajo);
		}



		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Persona other = (Persona) obj;
			return Objects.equals(legajo, other.legajo);
		}

		
}
