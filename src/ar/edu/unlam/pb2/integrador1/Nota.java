package ar.edu.unlam.pb2.integrador1;

public class Nota {
	private Integer valor;
	private TipoDeNota tipoParcial;
	
	public Nota(Integer valor, TipoDeNota tipoParcial) {
		this.setValor(valor);
		this.setTipoParcial(tipoParcial);
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public TipoDeNota getTipoParcial() {
		return tipoParcial;
	}

	public void setTipoParcial(TipoDeNota tipoParcial) {
		this.tipoParcial = tipoParcial;
	}
}
