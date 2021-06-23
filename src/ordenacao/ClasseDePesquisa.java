package ordenacao;

public class ClasseDePesquisa<T extends Comparable<T>> {

	public int pesquisaLinear(T[] vetor, T elem) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].compareTo(elem) == 0) {
				return i;
			}
		}
		return -1;
	}

	public int buscaBinaria(T[] vetor, T elem) {
		int inicio = 0;
		int fim = vetor.length - 1;
		int metade;

		while (inicio <= fim) {
			metade = ((inicio + fim) / 2);
			if (vetor[metade].compareTo(elem) > 0) {
				fim = metade-1;
			} else if (vetor[metade].compareTo(elem) < 0) {
				inicio = metade+1;
			} else {
				return metade;
			}
		}
		return -1;
	}

}
