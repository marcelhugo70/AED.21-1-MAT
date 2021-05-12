package arvore;

public class ArvoreBST<T extends Comparable> extends ArvoreBinariaAbstract<T> {

	public void inserir(T info) {
		if (this.vazia()) {
			this.setRaiz(new NoArvoreBST<>(info));
		} else {
			((NoArvoreBST<T>) this.getRaiz()).inserir(info);
		}
	}

	public NoArvoreBST<T> buscar(T procurado) {
		if (this.vazia()) {
			return null;
		} else {
			return ((NoArvoreBST<T>) this.getRaiz()).buscar(procurado);
		}
	}

	public void retirar(T info) {
		NoArvoreBST<T> noARemover = this.buscar(info);
		if (noARemover != null) {
			this.retirar(noARemover);
		}
	}

	private void retirar(NoArvoreBST<T> noARemover) {
		if (noARemover == this.getRaiz()) {
			// caso 1 - nó folha
			if (noARemover.getEsq() == null && noARemover.getDir() == null) {
				this.setRaiz(null);
			} else {
				// caso 2 - nó com 1 filho
				if (noARemover.getEsq() == null || noARemover.getDir() == null) {
					if (noARemover.getEsq() != null) { // filho está à esquerda
						this.setRaiz(noARemover.getEsq());
					} else { // filho está à direita
						this.setRaiz(noARemover.getDir());
					}
				} else {
					// caso 3 - nó com 2 filhos
					NoArvoreBST<T> sucessor = this.sucessor(noARemover);
					T info = sucessor.getInfo();
					this.retirar(sucessor);
					this.getRaiz().setInfo(info);
				}
			}
		} else { // noARemover não é raiz
			NoArvoreBST<T> pai = this.descobrirPai(noARemover);
			// caso 1 - nó folha
			if (noARemover.getEsq() == null && noARemover.getDir() == null) {
				if (pai.getEsq() == noARemover) {
					pai.setEsq(null);
				} else {
					pai.setDir(null);
				}
			} else if (noARemover.getEsq() == null || noARemover.getDir() == null) {
				// caso 2 - nó com 1 filho
				NoArvoreBST<T> filho;
				if (noARemover.getEsq() != null) { // filho está à esquerda
					filho = (NoArvoreBST<T>) noARemover.getEsq();
				} else {
					filho = (NoArvoreBST<T>) noARemover.getDir();
				}
				if (pai.getEsq() == noARemover) {
					pai.setEsq(filho);
				} else {
					pai.setDir(filho);
				}
			} else {
				// caso 3 - nó com 2 filhos
				NoArvoreBST<T> sucessor = this.sucessor(noARemover);
				T info = sucessor.getInfo();
				this.retirar(sucessor);
				noARemover.setInfo(info);
			}
		}
	}

	private NoArvoreBST<T> descobrirPai(NoArvoreBST<T> filho) {
		if (filho == null || this.getRaiz() == filho) {
			return null;
		}
		NoArvoreBST<T> pai = (NoArvoreBST<T>) this.getRaiz();
		while (pai!=null) {
			if (pai.getEsq() == filho || pai.getDir() == filho) {
				return pai;
			}
			if (pai.getInfo().compareTo(filho.getInfo())>0) {
				pai = (NoArvoreBST<T>) pai.getEsq();
			}
			else {
				pai = (NoArvoreBST<T>) pai.getDir();
			}
		}
		return null;
	}

	private NoArvoreBST<T> sucessor(NoArvoreBST<T> no) {
		NoArvoreBST<T> sucessor = (NoArvoreBST<T>) no.getDir();
		while (sucessor.getEsq() != null) {
			sucessor = (NoArvoreBST<T>) sucessor.getEsq();
		}
		return sucessor;
	}

}
