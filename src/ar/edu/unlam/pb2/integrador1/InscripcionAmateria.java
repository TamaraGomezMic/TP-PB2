package ar.edu.unlam.pb2.integrador1;



public class InscripcionAmateria {
	private Alumno alumno;
	private Materia materia;
	private Nota nota;

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

	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}

}
