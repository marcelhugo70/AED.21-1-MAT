package arvore;

import java.util.Random;
import java.util.Scanner;

public class TesteArvoreBSTComNumerosAleatorios {

	public static void main(String[] args) {
		ArvoreBST<Integer> arvore = new ArvoreBST<>();
		Scanner teclado = new Scanner(System.in);
		System.out.print("Quantidade de elementos:");
		int qtd = teclado.nextInt();
		int[] vetor = new int[qtd];
		Random r = new Random();
		int numero;
		for (int i=0; i < qtd; i++) {
			numero = r.nextInt(100_000);
			arvore.inserir(numero);
			vetor[i] = numero;
		}
		System.out.println(arvore.toString());
		int posicao;
		for (int i=0; i < qtd; i++) {
			posicao = r.nextInt(qtd);
			while (vetor[posicao] == -1) {
				posicao = r.nextInt(qtd);
			}
			arvore.retirar(vetor[posicao]);
			System.out.println("Retirando "+vetor[posicao]);
			vetor[posicao] = -1;
		}
		System.out.println(arvore.toString());
		
	}

}
