package arvore;

public class Arvore<T> {
	private NoArvore<T> raiz;

	public Arvore() {
	}

	public NoArvore<T> getRaiz() {
		return raiz;
	}

	public void setRaiz(NoArvore<T> raiz) {
		this.raiz = raiz;
	}

	public boolean vazia() {
		return this.getRaiz() == null;
	}

	public String toString() {
		if (this.vazia()) {
			return "<>";
		}
		return this.getRaiz().imprimirPre();
	}

	public NoArvore<T> pertence(T info) {
		if (this.vazia()) {
			return null;
		}
		return this.getRaiz().pertence(info);
	}

	public int getGrau(T info) {
		NoArvore<T> noInfo = null;
		noInfo = this.pertence(info);
		if (noInfo != null) {
			return noInfo.getGrau();
		} else {
			return -1;
		}
	}

	public int getGrauArvore() {
		if (vazia()) {
			return -1;
		}
		return raiz.getGrauSubarvore();
	}

	public int getAltura() {
		// altura da arvore
		if (vazia()) {
			return -1;
		}
		return (raiz.getAlturaSubarvore());
	}

}
