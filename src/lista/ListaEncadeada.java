package lista;

public class ListaEncadeada implements Lista {
	private NoLista primeiro;
	private NoLista ultimo;
	private int qtdeElementos;

	@Override
	public void inserir(int valor) {
		NoLista novo = new NoLista();
		novo.setInfo(valor);
		qtdeElementos++;
		// para inser��o no final (a lista fica de acordo com a ordem de inser��o)
		if (this.estaVazia()) {
			primeiro = novo;
		} else {
			ultimo.setProximo(novo);
		}
		ultimo = novo;
		/*
		 * para inser��o no in�cio (a lista fica ao contr�rio)
		 * novo.setProximo(this.primeiro); this.primeiro = novo;
		 */
	}

	public String toString() {
		String toString = "[";
		NoLista p = this.primeiro;
		while (p != null) {
			toString += p.getInfo() + ", ";
			p = p.getProximo();
		}
		toString += "]";
		return toString;
	}

	@Override
	public int buscar(int valor) {
		NoLista p = this.primeiro;
		int posicao = 0;
		while (p != null) {
			if (p.getInfo() == valor) {
				return posicao;
			}
			posicao++;
			p = p.getProximo();
		}
		return -1;
	}

	@Override
	public void retirar(int valor) {
		NoLista anterior = null;
		NoLista p = this.primeiro;

		while (p != null && p.getInfo() != valor) {
			anterior = p;
			p = p.getProximo();
		}
		if (p != null) {
			if (anterior == null) {
				this.primeiro = p.getProximo();
			} else {
				anterior.setProximo(p.getProximo());
			}
			this.qtdeElementos--;
		}
	}

	@Override
	public boolean estaVazia() {
		return (primeiro == null); // (ultimo == null) ou (qtdeElementos == 0)
	}

	@Override
	public Lista copiar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void concatenar(Lista outra) {
		// TODO Auto-generated method stub

	}

	@Override
	public Lista dividir() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTamanho() {
		return this.qtdeElementos;
	}

	@Override
	public int pegar(int posicao) {
		if (posicao >= this.qtdeElementos) {  // posi��o inv�lida
			throw new ArrayIndexOutOfBoundsException("Posi��o inv�lida "+posicao);
		}
		NoLista p = this.primeiro;
		int contPosicao = 0;
		while (p != null) {
			if (contPosicao == posicao) {
				return p.getInfo();
			}
			contPosicao++;
			p = p.getProximo();
		}
		// pela l�gica nunca deve chegar aqui
		return Integer.MIN_VALUE;
	}

}
