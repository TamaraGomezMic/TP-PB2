package ar.edu.unlam.pb2.integrador1;

import java.time.LocalDate;

public class Profesor {
	//ATRIBUTOS
		private Long dniProf;
		private String nombreProf;
		private String apellidoProf;
		private LocalDate fechaDeNacimientoProf;
			
	    
		

		//CONSTRUCTOR
		public Profesor(Long dniProf, String nombreProf, String apellidoProf, LocalDate fechaDeNacimientoProf) {
			this.setDniProf(dniProf);
			this.nombreProf=nombreProf;
			this.apellidoProf=apellidoProf;
			this.fechaDeNacimientoProf=fechaDeNacimientoProf;
			
		}




		public Long getDniProf() {
			return dniProf;
		}




		public void setDniProf(Long dniProf) {
			this.dniProf = dniProf;
		}




		public String getNombreProf() {
			return nombreProf;
		}




		public void setNombreProf(String nombreProf) {
			this.nombreProf = nombreProf;
		}




		public String getApellidoProf() {
			return apellidoProf;
		}




		public void setApellidoProf(String apellidoProf) {
			this.apellidoProf = apellidoProf;
		}




		public LocalDate getFechaDeNacimientoProf() {
			return fechaDeNacimientoProf;
		}




		public void setFechaDeNacimientoProf(LocalDate fechaDeNacimientoProf) {
			this.fechaDeNacimientoProf = fechaDeNacimientoProf;
		}
		
		
}
