package ar.edu.unlam.pb2.integrador1;

import java.time.LocalDate;

public class Profesor extends Persona{



		//CONSTRUCTOR
		
	public Profesor(Integer legajo, Long dni, String nombre, String apellido, LocalDate fechaDeNacimiento, Long celular,
			String email) {
		super(legajo, dni, nombre, celular, email,apellido,fechaDeNacimiento);
		
		
	}



	
		
}
