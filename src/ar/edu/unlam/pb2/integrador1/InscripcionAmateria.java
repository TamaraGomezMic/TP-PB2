package ar.edu.unlam.pb2.integrador1;

// no se puede inscribir si esta fuera de la fecha de inscripcion 
// no se puede inscribir si la cantidad de alunmos ya esta completya 
//no se puede inscribir si el alumno ya esta inscripto el mismo dia y turno 

public class InscripcionAmateria {
	private Alumno alumno;
	private Materia materia;
	//private Nota nota;

	public InscripcionAmateria(Alumno alumno, Materia materia) {
		
		this.alumno=alumno;
		this.materia = materia;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	//public Nota getNota() {
		//return nota;
	//}

	//public void setNota(Nota nota) {
	//	this.nota = nota;
	//}

}
