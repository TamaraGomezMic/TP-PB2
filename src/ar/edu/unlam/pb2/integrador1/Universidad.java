package ar.edu.unlam.pb2.integrador1;

import java.util.ArrayList;


public class Universidad {
	
		private String nombre;
		private ArrayList<Alumno> alumno;
		private ArrayList<Materia> materia;
		private ArrayList <InscripcionAmateria> inscripcionesMateria;

		public Universidad(String nombre) {
			this.nombre = nombre;
			this.alumno = new ArrayList<Alumno>();
			this.materia = new ArrayList<>();
			this.inscripcionesMateria = new ArrayList<>();
		}

		public Boolean registrar(Alumno alumno) {


			if (buscarAlumnoPorDni(alumno.getDni()) == null) {
				this.alumno.add(alumno);
				return true;
			}
				


			return false;
		}

		public Alumno buscarAlumnoPorDni(Long dni) {


			for (int i = 0; i < alumno.size(); i++) {
				if (this.alumno.get(i).getDni().equals(dni))
					return this.alumno.get(i);

			}
			
			return null;
		}


		public Boolean existeAlumno(Integer dni) {
			for (int i = 0; i < alumno.size(); i++) {
				if (this.alumno.get(i).getDni().equals(dni))

					return true;
			}
			return false;
		}

		public Boolean registraMateria(Materia materia) {
		     if (buscarMateriaPorCodigo(materia.getCodigoDeMateria())== null) {
		    	 
		    	 this.materia.add(materia);
				   return true;
			   }else   return false;
				
		   }
		   
		private Materia buscarMateriaPorCodigo(Integer codigo) {
			for (int i = 0; i < this.materia.size(); i++) {
				if (this.materia.get(i).getCodigoDeMateria().equals(codigo))
					return this.materia.get(i);
			}
			return null;
		}
		

		public boolean inscribirAlumnoAUnaMateria(Long dni, Integer codigo) {
			
			//no se puede inscribir alumnos si no tiene al menps cursada todas las correlativas(correlativas nota >=4)
		
			Alumno alumno = this.buscarAlumnoPorDni(dni);
			Materia materia = this.buscarMateriaPorCodigo(codigo);
			
			if (alumno != null && materia != null) {
				

		    InscripcionAmateria  inscripcionMateria = new InscripcionAmateria (alumno,materia);

			return this.inscripcionesMateria.add(inscripcionMateria );
				
			}
			
			return false;
		}




}
