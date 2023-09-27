package ar.edu.unlam.pb2.integrador1;

public class Nota {
	private Integer valor;
	private TipoDeNota tipoNota;
	
	public Nota(Integer valor, TipoDeNota tipoNota) {
		this.setValor(valor);
		this.setTipoParcial(tipoNota);
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public TipoDeNota getTipoParcial() {
		return tipoNota;
	}

	public void setTipoParcial(TipoDeNota tipoParcial) {
		this.tipoNota = tipoParcial;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}