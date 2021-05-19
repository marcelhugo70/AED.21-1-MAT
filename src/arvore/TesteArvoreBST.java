package arvore;

public class TesteArvoreBST {

	public static void main(String[] args) {
		ArvoreBST<Integer> arvore = new ArvoreBST<>();
		
		arvore.inserir(63);
		arvore.inserir(27);
		arvore.inserir(80);
		arvore.inserir(13);
		arvore.inserir(51);
		arvore.inserir(70);
		arvore.inserir(92);
		arvore.inserir(26);
		arvore.inserir(33);
		arvore.inserir(58);
		arvore.inserir(82);
		arvore.inserir(57);
		arvore.inserir(60);
		System.out.println(arvore);
		System.out.println(arvore.toStringOrdered());
		System.out.println(arvore.toStringOrdered2());
		
		System.out.println("Menor = "+arvore.menorElemento());
		System.out.println("Menor = "+arvore.buscarMenor());
		System.out.println("Maior = "+arvore.maiorElemento());
		
		System.out.println("Antecessor 13 = "+arvore.antecessor(arvore.buscar(13)));
		System.out.println("Antecessor 63 = "+arvore.antecessor(arvore.buscar(63)));
		System.out.println("Antecessor 57 = "+arvore.antecessor(arvore.buscar(57)));
		System.out.println("Antecessor 92 = "+arvore.antecessor(arvore.buscar(92)));
		
		System.out.println("Sucessor 13 = "+arvore.sucessor(arvore.buscar(13)));
		System.out.println("Sucessor 63 = "+arvore.sucessor(arvore.buscar(63)));
		System.out.println("Sucessor 57 = "+arvore.sucessor(arvore.buscar(57)));
		System.out.println("Sucessor 92 = "+arvore.sucessor(arvore.buscar(92)));
		
		System.out.println(arvore.buscar(80));
		System.out.println(arvore.buscar(57));
		System.out.println(arvore.buscar(100));
		arvore.retirar(58);
		arvore.retirar(100);
		arvore.retirar(13);
		arvore.retirar(63);
		System.out.println(arvore);
	}

}
