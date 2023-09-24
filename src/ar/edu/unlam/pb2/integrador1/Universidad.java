package ar.edu.unlam.pb2.integrador1;

import java.util.ArrayList;


public class Universidad {
	
		private String nombreUni;
		private ArrayList<Alumno> alumno;
		private ArrayList<Profesor> profesor;
		private ArrayList<Materia> materia;
		private ArrayList <InscripcionAmateria> inscripcionesMateria;

		public Universidad(String nombre) {
			this.setNombreUni(nombre);
			this.alumno = new ArrayList<Alumno>();
			this.profesor = new ArrayList<Profesor>();
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

		
		//-----------DOCENTE-----------
		
		public Boolean crearUnDocente(Profesor profesor) {
			if (buscarProfesorPorDni(profesor.getDni()) == null) {
				this.profesor.add(profesor);
				return true;
			}
			

			return false;
		}
		
		public Profesor buscarProfesorPorDni(Long dni) {


			for (int i = 0; i < profesor.size(); i++) {
				if (this.profesor.get(i).getDni().equals(dni))
					return this.profesor.get(i);

			}
			
			return null;
		}
		
		public Boolean CrearNuevoDocente(Profesor nuevoProfesor, Boolean docente) {
			
			if (existeProfesor(nuevoProfesor.getDni()) == docente) {
				this.profesor.add(nuevoProfesor);
				return true;
			}
			
			
			return false;
		}

		
		public Boolean existeProfesor(Long dni) {
			for (int i = 0; i < profesor.size(); i++) {
				if (this.profesor.get(i).getDni().equals(dni))

					return true;
			}
			return null;
		}
		
		
		
		
		
		

		public String getNombreUni() {
			return nombreUni;
		}



		public void setNombreUni(String nombreUni) {
			this.nombreUni = nombreUni;
		}



		


		




}
