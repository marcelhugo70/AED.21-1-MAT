package arvore;

public class NoArvore<T> {
	private T info;
	private NoArvore<T> filho;
	private NoArvore<T> irmao;

	public NoArvore(T info) {
		this.setInfo(info);
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public String imprimirPre() {
		String str = "<" + this.info; // trata raiz
		if (this.getFilho() != null) {
			str += this.getFilho().imprimirPre();
		} 
		str +=  ">";
		if (this.getIrmao() != null) {
			str += this.getIrmao().imprimirPre();
		}
		return str ;
	}

	public void inserirFilho(NoArvore<T> noAInserir) {
		if (noAInserir != null) {
			noAInserir.setIrmao(this.filho);
			this.setFilho(noAInserir);
		}
	}

	public NoArvore<T> pertence(T procurado) {
		if (this.getInfo().equals(procurado)) {
			return this;
		}
		NoArvore<T> noProcurado = null;
		if (this.getFilho() != null) {
			noProcurado = this.getFilho().pertence(procurado);
		}
		if (noProcurado == null && this.getIrmao() != null) {
			noProcurado =  this.getIrmao().pertence(procurado);
		}
		return noProcurado;
	}

	public NoArvore<T> getFilho() {
		return filho;
	}

	public void setFilho(NoArvore<T> filho) {
		this.filho = filho;
	}

	public NoArvore<T> getIrmao() {
		return irmao;
	}

	public void setIrmao(NoArvore<T> irmao) {
		this.irmao = irmao;
	}

	@Override
	public String toString() {
		return info.toString();
	}

}
