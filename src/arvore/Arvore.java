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
}
