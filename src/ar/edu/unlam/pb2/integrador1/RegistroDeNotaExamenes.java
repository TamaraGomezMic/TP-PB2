package ar.edu.unlam.pb2.integrador1;



public class RegistroDeNotaExamenes {

	private Alumno alumno;
	private Nota nota;
	private Comision comision;
	
	public RegistroDeNotaExamenes(Alumno alumno, Nota nota, Comision comision) {
		this.alumno = alumno;
		this.nota = nota;
		this.setComision(comision);
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}

	public Comision getComision() {
		return comision;
	}

	public void setComision(Comision comision) {
		this.comision = comision;
	}
	
	



	

	
}
