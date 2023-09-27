package ar.edu.unlam.pb2.integrador1;

import java.time.LocalDate;
import java.util.ArrayList;




public class Universidad {
	
		private String nombreUni;
		private ArrayList<Alumno> alumno;
		private ArrayList<Profesor> profesor;
		private ArrayList<Materia> materia;
		private ArrayList <InscripcionAmateria> inscripcionesMateria;
		private ArrayList<Comision> comision;
		private ArrayList<CicloLectivo> cicloLectivo;
		private ArrayList<Aula> aula;
		private ArrayList<Nota> nota;
		private ArrayList<RegistroDeNotaExamenes> registroDeNotaExamenes;

		public Universidad(String nombre) {
			this.setNombreUni(nombre);
			this.alumno = new ArrayList<Alumno>();
			this.profesor = new ArrayList<Profesor>();
			this.materia = new ArrayList<>();
			this.inscripcionesMateria = new ArrayList<>();
			this.comision = new ArrayList<Comision>();
			this.cicloLectivo = new ArrayList<CicloLectivo>();
			this.aula = new ArrayList<Aula>();
			this.nota = new ArrayList<Nota>();
			this.registroDeNotaExamenes = new ArrayList<RegistroDeNotaExamenes>();
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


//		public Boolean existeAlumno(Integer dni) { es igual a buscar alumno por dni 
//			for (int i = 0; i < alumno.size(); i++) {
//				if (this.alumno.get(i).getDni().equals(dni))
//
//					return true;
//			}
//			return false;
//		}

		public Boolean registraMateria(Materia materia) {
		     if (buscarMateriaPorCodigo(materia.getCodigoDeMateria())== null) {
		    	 
		    	 this.materia.add(materia);
				   return true;
			   }else   return false;
				
		   }
		   
		public Materia buscarMateriaPorCodigo(Integer codigo) {
			for (int i = 0; i < this.materia.size(); i++) {
				if (this.materia.get(i).getCodigoDeMateria().equals(codigo))
					return this.materia.get(i);
			}
			return null;
		}
		
	

		public ArrayList<Materia> getMateria() {
			return materia;
		}


		public void setMateria( Materia materia) {
			this.materia.add(materia);
		}

// boolean inscribirAlumnoAUnaMateria(Long dni, Integer codigo) {
//			
//			//no se puede inscribir alumnos si no tiene al menps cursada todas las correlativas(correlativas nota >=4)
//		
//			Alumno alumno = this.buscarAlumnoPorDni(dni);
//			Materia materia = this.buscarMateriaPorCodigo(codigo);
//			
//			if (alumno != null && materia != null) {
//				
//
//		    InscripcionAmateria  inscripcionMateria = new InscripcionAmateria (alumno,materia);
//
//			return this.inscripcionesMateria.add(inscripcionMateria );
//				
//			}
//			
//			return false;
//		}

		
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
		
		public Profesor buscarProfesorPorId(Integer idDocente) {


			for (int i = 0; i < profesor.size(); i++) {
				if (this.profesor.get(i).getLegajo().equals(idDocente))
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
		
		
		//---------CICLO LECTIVO -----------
		
		//No se puede asignar 2 ciclos Lectivo con mismo Id 
		//y no se pueden superponer los rangos de fechas entre 2 ciclos distintos
		public Boolean agregarCicloLectivo(CicloLectivo ciclo) {
			if (buscarCicloPorID(ciclo.getIdCiclo()) == null && fechaEnRango(ciclo.getInicioCiclo(), ciclo.getFinCiclo())== null) {
				this.cicloLectivo.add(ciclo);
				return true;
			}
			

			return false;
			
		}// faltan validar las fechas
		
		
		

		public CicloLectivo fechaEnRango(LocalDate inicioRangoCiclo, LocalDate finRangoCiclo) {
			for (int i = 0; i < cicloLectivo.size(); i++) {
				if (!this.cicloLectivo.get(i).getFinCiclo().isBefore(inicioRangoCiclo) && !finRangoCiclo.isBefore(this.cicloLectivo.get(i).getInicioCiclo())) {
					return this.cicloLectivo.get(i);
				}
			}
		
			return null;
		}


		//.after(inicioRangoCiclo) || cicloLectivo.equals(inicioRangoCiclo))
				//&& (cicloLectivo.before(finRangoCiclo) || cicloLectivo.equals(finRangoCiclo))

		

		public CicloLectivo buscarCicloPorID(Integer idCiclo) {
			
			for (int i = 0; i < cicloLectivo.size(); i++) {
				if (this.cicloLectivo.get(i).getIdCiclo().equals(idCiclo))
					return this.cicloLectivo.get(i);

			}
			
			return null;
		}



		//--en proceso
//		public Boolean asignarCicloLectivoyTurnoAMateria(Integer codigoMateria, Integer idCiclo, String turno) {
//			Boolean sePuedoAsignar = false;
//			Materia materia =  buscarMateriaPorCodigo(codigoMateria);
//			CicloLectivo ciclo = buscarCicloPorID(idCiclo);
//			
//			materia.agregarCicloLectivo(ciclo);
//			materia.agregarTurno(turno);
//			ciclo.agreagarUnMateriaAlCiclo(materia);
//			
//			
//			return null;
//		}


		public Boolean asignarDocenteAComision(Integer idComision, Integer idDocente) {
			if (buscarComisionPorId(idComision)!= null && buscarComisionPorId(idComision).getProfesorAsignado().isEmpty()) {
				buscarComisionPorId(idComision).setProfesorAsignado(buscarProfesorPorId(idDocente));
				return true;
			
			} else {
				if (buscarComisionPorId(idComision)!= null && buscarComisionPorId(idComision).getAlumnosAsignados().size() >21) {
					buscarComisionPorId(idComision).setProfesorAsignado(buscarProfesorPorId(idDocente));
					return true;
				}
			}
		
			return false;
		}


		public Boolean asignarMateriaAunaComision(Integer idComision, Integer codigoMateria) {
			if(buscarComisionPorId(idComision)!= null && buscarComisionPorId(idComision).getMateria() == null) {
				buscarComisionPorId(idComision).setMateria(buscarMateriaPorCodigo(codigoMateria));
				return true;
			}
			return false;
			
			
		}


		public Boolean asignarTurnoAunaComision(Integer idComision, Turno turno) {
			if(buscarComisionPorId(idComision)!= null && buscarComisionPorId(idComision).getTurno()== null) {
				buscarComisionPorId(idComision).setTurno(turno);
				return true;
			}
			return false;
			
			
			
			
			
		}


		public Boolean asignarAulaAunaComision(Integer idComision, Aula aula) {
			if(buscarComisionPorId(idComision)!= null && buscarComisionPorId(idComision).getAula() == null) {
				buscarComisionPorId(idComision).setAula(aula);
				return true;
			}
			return false;
			
			
		}


		public Boolean asignarCicloLectivoAunaComision(Integer idComision, CicloLectivo ciclo) {
			if(buscarComisionPorId(idComision)!= null && buscarComisionPorId(idComision).getCiclo() == null) {
				buscarComisionPorId(idComision).setCiclo(ciclo);
				return true;
			}
			return false;
			
			
		}

		//----AULA-------

		public Boolean crearAula(Aula aula) {
			return this.aula.add(aula);
			
		}
		

		
		//---------NOTA---------
		
		

		public Boolean registrarNota(Nota nota) {
			
			if(queElTipoDeNotaSeaValido(nota) && notaDeUnoADiez(nota)) {
				this.nota.add(nota);
				return true;
				
			}
			return false;
		}

		public Boolean queElTipoDeNotaSeaValido(Nota nota) {
			TipoDeNota tipo = nota.getTipoParcial();
					
				 if (tipo != TipoDeNota.PRIMER_PARCIAL &&
				            tipo != TipoDeNota.SDO_PARCIAL &&
				            tipo != TipoDeNota.REC_1PARCIAL &&
				            tipo != TipoDeNota.REC_2DOPARCIAL &&
				            tipo != TipoDeNota.FINAL) {
					 return false;
	        }
			
			return true;
		}
		
		public Boolean notaDeUnoADiez(Nota nota) {
			if((nota.getValor() >= 1) && (nota.getValor() <= 10)) {
					
					return true;
			     
	        }
			
			return false;
		}
		
		public Boolean crearRegistroDeNota(Alumno alumno, Comision comision, Nota nota1, Nota nota2, Nota nota3,
				Nota nota4, Nota nota5) {
			Boolean alumnos = registrar(alumno);
			Boolean comisiones = crearUnaComision(comision);
			
			Boolean notas1 = registrarNota(nota1);
			Boolean notas2 = registrarNota(nota2);
			Boolean notas3 = registrarNota(nota3);
			Boolean notas4 = registrarNota(nota4);
			Boolean notas5 = registrarNota(nota5);
			
			if(alumnos && comisiones && notas1 && notas2 && notas3 && notas4 && notas5) {
				
				new RegistroDeNotaExamenes(alumno,nota1,comision);
				new RegistroDeNotaExamenes(alumno,nota2,comision);
				
				if(puedeRendirFinal(nota1,nota2)){
					new RegistroDeNotaExamenes(alumno,nota5,comision);
					return true;
				}else if(verificarRecuperatorio(nota1,nota2)) {
						if(nota1.getValor() > 4) {
							new RegistroDeNotaExamenes(alumno,nota4,comision);
							return true;
						} 
						new RegistroDeNotaExamenes(alumno,nota3,comision);
					}
					return true;
				}
			
				return false;
			
		}
		
	public Boolean verificarRecuperatorio(Nota nota1, Nota nota2) {
			
			if ((registrarNota(nota1) && registrarNota(nota2))) {
				this.nota.add(nota1);
				this.nota.add(nota2);
				
				if(!(nota1.getValor() < 4 && nota2.getValor() < 4)) {
				return true;
				}
			}
			
			return false;
		}
	
	public Boolean puedeRendirFinal(Nota nota1, Nota nota2) {
		if ((registrarNota(nota1) && registrarNota(nota2))) {
			this.nota.add(nota1);
			this.nota.add(nota2);
			
			if((nota1.getValor() < 4 || nota2.getValor() < 4)) {
			
			return false;
			}
			return true;
		}
		
		return false;

	}
	
	public Boolean sePuedaObtener(Boolean registroNotaExitoso) {
		Integer nota1 = 0;
		Integer nota2 = 0;
		if(registroNotaExitoso) {
			for (int i = 0; i < cicloLectivo.size(); i++) {
				if (this.registroDeNotaExamenes.get(i).getNota().getTipoParcial() == TipoDeNota.PRIMER_PARCIAL) {
					nota1 = this.registroDeNotaExamenes.get(i).getNota().getValor();
				}else if (this.registroDeNotaExamenes.get(i).getNota().getTipoParcial() == TipoDeNota.SDO_PARCIAL) {
					nota2 = this.registroDeNotaExamenes.get(i).getNota().getValor();
				}	

			}
			
			calcularPromedio(nota1,nota2);
			return true;
		}
		return false;
		
	}
	
	public Integer calcularPromedio(Integer nota1, Integer nota2){
		return (nota1 + nota2) / 2;
	}
	



		/////////////////no se si va este metodo----------------
		public Boolean sePuedeRegistrarNotaFinal(Nota nota) {
			TipoDeNota tipo = nota.getTipoParcial();
					
			if (tipo == TipoDeNota.FINAL) {
				for (int i = 0; i < nota.size(); i++) {
					if ((this.nota.get(i).getTipoParcial() == TipoDeNota.PRIMER_PARCIAL) && ((this.nota.get(i).getValor() < 4) || (this.nota.get(i).getValor() > 10))) {
						
						return false;
					
						
				}else if ((this.nota.get(i).getTipoParcial() == TipoDeNota.SDO_PARCIAL) && ((this.nota.get(i).getValor() < 4) || (this.nota.get(i).getValor() > 10))) {
				
			
					return false;
			}
			
					
			}
				return false;
		}
			return true;
	}
		
	
		

//		public Boolean crearRegistroDeNota(Alumno alumno, Comision comision,
//				Nota nota) {
//			
//			Boolean alumnos = registrar(alumno); 
//			Boolean notas = registrarNota(nota);
//			Boolean comisiones = crearUnaComision(comision);
//			
//			if(alumnos && notas && comisiones) {
//				new RegistroDeNotaExamenes(alumno,nota,comision);
//				return true;
//			}
//			return false;
//		}
		
		

//		public Boolean verificarRecuperatorio(Nota nota) {
//			
//			if (existeRecu(nota) == null) {
//				this.nota.add(nota);
//				return true;
//			}
//
//			return false;
//		}

		///////////no se si va ///////////////////////
		private Object existeRecu(Nota nota) {
			
			for (int i = 0; i < nota.size(); i++) {
				if ((this.nota.get(i).getTipoParcial() == TipoDeNota.PRIMER_PARCIAL && this.nota.get(i).getValor() < 4) && (nota.getTipoParcial() == TipoDeNota.SDO_PARCIAL && nota.getValor() < 4)) {
						return false;
					
					} else if ((this.nota.get(i).getTipoParcial() == TipoDeNota.SDO_PARCIAL && this.nota.get(i).getValor() < 4) && (nota.getTipoParcial() == TipoDeNota.PRIMER_PARCIAL && nota.getValor() < 4)) {
						return false;
					}
			} return null;
		}


		public void inscribirAlumnoAUnaMateria(Long dni, Integer codigoMateria, PlanDeEstudio tecnicatura) {

		 if(buscarAlumnoPorDni(dni)!= null && tecnicatura.buscarMateriaPorCodigo(codigoMateria)!= null) { //verifique que este el alumno y este la materia en el plan de estudio 
			 //verificar si esa materia tiene correlativa , si tiene correlativa ver que el alumno la tenga aprobada
			 
			 if (permitirInscripcionPorCorrelativa(codigoMateria)) {
				 
				 InscripcionAmateria materiaInscripta = new InscripcionAmateria(buscarAlumnoPorDni(dni),buscarMateriaPorCodigo(codigoMateria));
				 inscripcionesMateria.add(materiaInscripta);
			 }
			 
			 
		 }
			
		}


		private boolean permitirInscripcionPorCorrelativa(Integer codigoMateria) {
			
			
			return false;
		}


}