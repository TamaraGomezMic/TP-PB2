package ar.edu.unlam.pb2.integrador1;

import java.util.ArrayList;


public class Universidad {
	
	// private Alumno [] alumnos;
		private ArrayList<Alumno> alumnos;
		private String nombre;
		private ArrayList<Materia> materias;
		private ArrayList <InscripcionAmateria> inscripcionesMateria;

		public Universidad(String nombre) {
			this.setNombre(nombre);
			this.alumnos = new ArrayList<>();
			this.materias = new ArrayList<>();
			this.inscripcionesMateria = new ArrayList<>();
		}

		public Boolean registrar(Alumno alumno) {

			if (buscarAlumnoPorDni(alumno.getDniAlu()) == null)
			
				return this.alumnos.add(alumno);

			return false;
		}

		public Alumno buscarAlumnoPorDni(Long dni) {

			for (int i = 0; i < alumnos.size(); i++) {
				if (this.alumnos.get(i).getDniAlu().equals(dni))
					return this.alumnos.get(i);
			}
			
			return null;
		}

		public Boolean existeAlumno(Long dni) {
			for (int i = 0; i < alumnos.size(); i++) {
				if (this.alumnos.get(i).getDniAlu().equals(dni))
					return true;
			}
			return false;
		}

		public Boolean registraMateria(Materia materia) {
		   
			return this.materias.add(materia);
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

		private Materia buscarMateriaPorCodigo(Integer codigo) {
			for (int i = 0; i < this.materias.size(); i++) {
				if (this.materias.get(i).getCodigo().equals(codigo))
					return this.materias.get(i);
			}
			return null;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		


}
