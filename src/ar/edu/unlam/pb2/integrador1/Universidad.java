package ar.edu.unlam.pb2.integrador1;

import java.util.ArrayList;




public class Universidad {
	
		private String nombreUni;
		private ArrayList<Alumno> alumno;
		private ArrayList<Profesor> profesor;
		private ArrayList<Materia> materia;
		private ArrayList <InscripcionAmateria> inscripcionesMateria;
		private ArrayList<Comision> comision;
		private ArrayList<CicloLectivo> cicloLectivo;

		public Universidad(String nombre) {
			this.setNombreUni(nombre);
			this.alumno = new ArrayList<Alumno>();
			this.profesor = new ArrayList<Profesor>();
			this.materia = new ArrayList<>();
			this.inscripcionesMateria = new ArrayList<>();
			this.comision = new ArrayList<Comision>();
			this.cicloLectivo = new ArrayList<CicloLectivo>();
		}


		public String getNombreUni() {
			return nombreUni;
		}



		public void setNombreUni(String nombreUni) {
			this.nombreUni = nombreUni;
		}

		
		
		//------------ ALUMNO -----------
		
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
		
		
		
		// ------- COMISION---------
		
		//No se Pueden generar 2 Comisiones para la misma materia, 
		//el mismo cicloLectivo y el mismo turno
		public Boolean crearUnaComision(Comision comision) {
							
			if (buscarComisionPorId(comision.getIdComision()) == null) {
				this.comision.add(comision);
				return true;
				
			}
			
			return false;
		}
		
		public Comision buscarComisionPorId(Integer idComision) {


			for (int i = 0; i < comision.size(); i++) {
				if (this.comision.get(i).getIdComision().equals(idComision))
					return this.comision.get(i);

			}
			
			return null;
		}
		
		
		//No se puede asignar 2 ciclos Lectivo con mismo Id 
		//y no se pueden superponer los rangos de fechas entre 2 ciclos distintos
		public Boolean agregarCicloLectivo(CicloLectivo ciclo) {
			if (buscarCicloPorID(ciclo.getIdCiclo()) == null) {
				this.cicloLectivo.add(ciclo);
				return true;
			}
			

			return false;
			
		}// faltan validar las fechas
		

		public CicloLectivo buscarCicloPorID(Integer idCiclo) {
			
			for (int i = 0; i < cicloLectivo.size(); i++) {
				if (this.cicloLectivo.get(i).getIdCiclo().equals(idCiclo))
					return this.cicloLectivo.get(i);

			}
			
			return null;
		}



		//--en proceso
		public Boolean asignarCicloLectivoyTurnoAMateria(Integer codigoMateria, Integer idCiclo, String turno) {
			Boolean sePuedoAsignar = false;
			Materia materia =  buscarMateriaPorCodigo(codigoMateria);
			CicloLectivo ciclo = buscarCicloPorID(idCiclo);
			
			materia.agregarCicloLectivo(ciclo);
			materia.agregarTurno(turno);
			ciclo.agreagarUnMateriaAlCiclo(materia);
			
			
			return null;
		}

		/*
		

		if (curso.mostrarALumno().equals(alumno)) {
			alumno.agregarUnCurso(Legajo);
			return sePuedoInscribir = true;
		} 

		
		*/
		
		


		




		



		


		


		




}
