public class Aplication {

	public static void main(String[] args) {

		Vetor<Contato> v = new Vetor<>(1);

		Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@gmail.com");
		Contato c2 = new Contato("Contato 2", "4567-8989", "contato2@gmail.com");
		Contato c3 = new Contato("Contato 3", "7894-4847", "contato3@gmail.com");

		Contato c4 = new Contato("Contato 3", "7894-4847", "contato3@gmail.com");

		v.adiciona(c1);
		v.adiciona(c2);
		v.adiciona(c3);

		System.out.println("Tamanho: " + v.tamanho());
		System.out.println(v);

		int pos = v.busca(c4);
		if (pos > -1) {
			System.out.println("Elemento existe no vetor.");
		} else {
			System.out.println("Elemento não existe no vetor.");
		}
		
		
	

	}

}
