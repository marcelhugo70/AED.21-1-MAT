package arvore;

public class TesteArvoreNAria {
	public static void main(String args[]) {
		NoArvore<Integer> n9 = new NoArvore<Integer>(9);
		NoArvore<Integer> n10 = new NoArvore<Integer>(10);
		NoArvore<Integer> n4 = new NoArvore<Integer>(4);
		n4.inserirFilho(n10);
		n4.inserirFilho(n9);

		NoArvore<Integer> n8 = new NoArvore<Integer>(8);
		NoArvore<Integer> n3 = new NoArvore<Integer>(3);
		n3.inserirFilho(n8);

		NoArvore<Integer> n5 = new NoArvore<Integer>(5);
		NoArvore<Integer> n6 = new NoArvore<Integer>(6);
		NoArvore<Integer> n7 = new NoArvore<Integer>(7);

		NoArvore<Integer> n2 = new NoArvore<Integer>(2);
		n2.inserirFilho(n7);
		n7.inserirFilho(n6);
		n6.inserirFilho(n5);

		NoArvore<Integer> n1 = new NoArvore<Integer>(1);
		n1.inserirFilho(n4);
		n1.inserirFilho(n3);
		n1.inserirFilho(n2);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);
		System.out.println(a.toString());
		System.out.println("Buscando o 8 = " + a.pertence(8));
		System.out.println("Buscando o 10 = " + a.pertence(10));
		System.out.println("Buscando o 4 = " + a.pertence(4));
		System.out.println("Buscando o 1 = "+a.pertence(1));

		System.out.println("Buscando o 20 = "+a.pertence(20));
		
		System.out.println("Grau do 2="+a.getGrau(2));
		System.out.println("Grau do 20="+a.getGrau(20));
		System.out.println("Grau do 10="+a.getGrau(10));
		System.out.println("Grau da árvore a="+a.getGrauArvore());
		System.out.println("Altura da árvore a="+a.getAltura());
		
		Arvore<String> b = new Arvore<>();
		System.out.println("Grau da árvore b="+b.getGrauArvore());
		System.out.println("Altura da árvore b="+b.getAltura());
	}
}
